package edu.matc.rest;

import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;

@Path("/add")
public class ResponseAddHoliday {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @POST
    public Response addHoliday(
            @QueryParam("month") int month,
            @QueryParam("day") int day,
            @QueryParam("name") String name) {

        try {

            int currentYear = LocalDate.now().getYear();
            LocalDate holidayDate = LocalDate.of(currentYear, month, day);

            Holiday holiday = new Holiday();
            holiday.setDate(holidayDate);
            holiday.setName(name);

            GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
            holidayDao.insertEntity(holiday);
            Holiday insertedHoliday = holidayDao.getById(holiday.getId());

            if (insertedHoliday != null) {
                return Response.status(Response.Status.CREATED)
                        .entity("Holiday added successfully! Name: " + holiday.getName() + ", Date: " + holiday.getDate())
                        .build();
            } else {
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                        .entity("Failed to add holiday to the database.")
                        .build();
            }
        } catch (Exception e) {
            logger.error("Holiday was not entered into the database", e);
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Failed to add holiday.")
                    .build();
        }
    }
}