package edu.matc.rest;

import com.google.gson.Gson;
import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/holidays")
public class ResponseHoliday {
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Gets all the holidays
     * @return the response with the results
     */
    @GET
    @Path("/all")
    @Produces("application/json")
    public Response getHolidays() {
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
        List<Holiday> holidays = holidayDao.getAll();
        logger.debug("The list of holidays:" + holidays);

        Gson gson = new Gson();
        String json = gson.toJson(holidays);

        return Response.status(200).entity(json).build();
    }

    /**
     * Gets holiday by id
     * @param id the id of the holiday
     * @return the response with the results
     */
    @GET
    @Path("id/{id}")
    @Produces("application/json")
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

    /**
     * Gets holidays by date
     * @param month an integer for the month
     * @param day an integer for the day
     * @return the response with the results
     */
    @GET
    @Path("dates/{month}/{day}")
    @Produces("application/json")
    public Response getHolidaysByDate(@PathParam("month") int month, @PathParam("day") int day) {
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);

        List<Holiday> holidays = holidayDao.findByMonthAndDay(month, day);

        if (!holidays.isEmpty()) {
            String json = new Gson().toJson(holidays);
            return Response.status(Response.Status.OK).entity(json).build();
        }

        String errorMessage = "Unable to find results for date: " + month + "/" + day;
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }

    /**
     * Gets the holidays by a search term
     * @param name the search term
     * @return the response with the results
     */
    @GET
    @Path("names/{name}")
    @Produces("application/json")
    public Response getHolidaysByName(@PathParam("name") String name) {
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
        List<Holiday> holidays = holidayDao.getByPropertyLike("name", "%" + name + "%");
        if (!holidays.isEmpty()) {
            String json = new Gson().toJson(holidays);
            return Response.status(Response.Status.OK).entity(json).build();
        }

        String errorMessage = "Unable to find results for name:" + name;
        return Response.status(Response.Status.NOT_FOUND).entity(errorMessage).build();
    }

}