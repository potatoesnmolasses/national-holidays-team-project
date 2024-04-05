package edu.matc.rest;

import com.google.gson.Gson;
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
            String json = new Gson().toJson(holiday);
            return Response.status(Response.Status.OK).entity(json).build();
        }
        String errorMessage = "Unable to find results for id:" + id;
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }
}
