package edu.matc.rest;

import com.google.gson.Gson;
import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.util.List;

@Path("/holidayUpdate")
public class ResponseHolidayUpdate {
    @POST
    @Produces("application/json")
    public Response updateHoliday(@QueryParam("holId") int id, @QueryParam("holName") String name, @QueryParam("holDate") String date) {
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
        //check Holiday id
        if (holidayDao.getById(id) == null) {
            String errorMessage = "Unable to find results for id: " + id;
            return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
        }
        //check values for name and date
        if (name.isEmpty() || date.isEmpty()) {
            String errorMessage = "Please enter a valid name and date!";
            return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
        }
        //String to LocalDate
        LocalDate localDate = LocalDate.parse(date);
        //update Holiday
        Holiday holiday = new Holiday(localDate, name);
        holidayDao.update(holiday);
        String json = new Gson().toJson(holiday);
        return Response.status(Response.Status.OK).entity(json).build();
    }
}
