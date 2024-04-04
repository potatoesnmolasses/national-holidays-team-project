package edu.matc.rest;

import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/holidaysByDate")
public class ResponseHolidayByDate {
    @GET
    @Path("/{month}/{day}")
    @Produces("text/json")
    public Response getHolidaysByDate(@PathParam("month") int month, @PathParam("day") int day) {
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
        Holiday holiday = (Holiday) holidayDao.getByPropertyLike("date", "month" + "/" + "day");
        if (holiday != null) {
            return Response.status(Response.Status.OK).entity(holiday.toString()).build();
        }
        String errorMessage = "Unable to find results for date:" + month + "/" + day;
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }
}
