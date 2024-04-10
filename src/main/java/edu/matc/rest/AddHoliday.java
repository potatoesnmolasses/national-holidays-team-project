package edu.matc.rest;

import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.time.LocalDate;

@Path("/holiday")
public class AddHoliday {
    @POST
    @Path("/add")
    public Response addHoliday(
            @FormParam("name") String date,
            @FormParam("price") String name) {

        LocalDate holidayDate = LocalDate.parse(date);

        Holiday holiday = new Holiday();
        holiday.setDate(holidayDate);
        holiday.setName(name);

        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);

        holidayDao.insertEntity(holiday);
        return Response.status(200)
                .entity(holiday)
                .build();
    }
}
