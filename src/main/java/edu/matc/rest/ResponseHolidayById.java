package edu.matc.rest;

import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/holidaysById")
public class ResponseHolidayById {
    @GET
    @Path("/{id}")
    @Produces("text/json")
    public Response getHolidaysById(@PathParam("id") int id) {
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
        Holiday holiday = holidayDao.getById(id);
        if (holiday != null) {
            return Response.status(Response.Status.OK).entity(holiday.toString()).build();
        }
        String errorMessage = "Unable to find results for id:" + id;
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }
}
