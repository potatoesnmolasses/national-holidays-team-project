package edu.matc.rest;

import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.time.LocalDate;

@Path("/add")
public class AddHoliday {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @POST
    public Response addHoliday(
            @FormParam("date") String date,
            @FormParam("name") String name) {

        try {

            LocalDate holidayDate = LocalDate.parse(date);

            Holiday holiday = new Holiday();
            holiday.setDate(holidayDate);
            holiday.setName(name);

            GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
            holidayDao.insertEntity(holiday);
            Holiday insertedHoliday = holidayDao.getById(holiday.getId());

            if (insertedHoliday != null) {
                return Response.status(200)
                        .entity("Holiday added successfully! Name: " + holiday.getName() + "Date" + holiday.getDate()).build();
            } else {
                return Response.status(500)
                        .entity("Failed to add holiday to the database.")
                        .build();
            }
        } catch (Exception e) {
            logger.error("Holiday was not entered into the database");
            return Response.status(500)
                    .entity("Failed to add holiday.")
                    .build();
        }
    }
}