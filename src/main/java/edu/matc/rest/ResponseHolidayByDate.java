package edu.matc.rest;

import com.google.gson.Gson;
import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/holidaysByDate")
public class ResponseHolidayByDate {
    @GET
    @Path("/{month}/{day}")
    @Produces("application/json")
    public Response getHolidaysByDate(@PathParam("month") int month, @PathParam("day") int day) {
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);

        // Query holidays by matching the month and day of the date
        List<Holiday> holidays = holidayDao.findByMonthAndDay(month, day);

        if (!holidays.isEmpty()) {
            // Convert the list of Holiday objects to JSON string
            String json = new Gson().toJson(holidays);
            return Response.status(Response.Status.OK).entity(json).build();
        }

        String errorMessage = "Unable to find results for date: " + month + "/" + day;
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }
}