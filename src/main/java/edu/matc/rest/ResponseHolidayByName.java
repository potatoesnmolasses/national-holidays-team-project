package edu.matc.rest;

import com.google.gson.Gson;
import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/holidaysByName")
public class ResponseHolidayByName {
    @GET
    @Path("/{name}")
    @Produces("text/json")
    public Response getHolidaysByName(@PathParam("name") String name) {
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
        List<Holiday> holidays = holidayDao.getByPropertyLike("name", "%" + name + "%");
        if (holidays != null && !holidays.isEmpty()) {
            // Convert the list of Holiday objects to JSON string
            String json = new Gson().toJson(holidays);
            return Response.status(Response.Status.OK).entity(json).build();
        }

        String errorMessage = "Unable to find results for name:" + name;
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }
}
