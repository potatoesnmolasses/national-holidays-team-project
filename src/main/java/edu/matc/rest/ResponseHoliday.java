package edu.matc.rest;

import com.google.gson.Gson;
import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
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

    /**
     * updates the holiday with a form POST
     * @param id the holiday id (to change)
     * @param name the name to change the holiday to
     * @param date the date to change the holiday to
     * @return the response
     */
    @POST
    @Path("/update")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public Response updateHoliday(
            @FormParam("holId") Integer id,
            @FormParam("holName") String name,
            @FormParam("holDate") String date) {
        logger.debug("updateHoliday() is called, name: " + name + ", id: " + id + ", date: " + date);
        //Instantiate dao
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
        Holiday newHoliday = null;
        //test that fields not empty
        if (id.equals(null) || name.isEmpty() || date.isEmpty()) {
            return Response.status(400)
                    .entity("Form field was left blank - please fill out all fields completely")
                    .build();
        }
        //Test that id is found
        if (holidayDao.getById(id) == null) {
            return Response.status(400)
                    .entity("That id wasn't found.  Try again?")
                    .build();
        } else {
            newHoliday = holidayDao.getById(id);
        }
        //Set attributes
        LocalDate localDate = LocalDate.parse(date);
        newHoliday.setName(name);
        newHoliday.setDate(localDate);
        holidayDao.update(newHoliday);
        Holiday updated = holidayDao.getById(id);

        return Response.status(200)
                .entity("updateHoliday() is called, Holiday: " + updated.toString())
                .build();

    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addHoliday(
            @FormParam("month") int month,
            @FormParam("day") int day,
            @FormParam("name") String name) {
        try {
            // Check if any fields are empty
            if (name.isEmpty()) {
                return Response.status(Response.Status.BAD_REQUEST)
                        .entity("Holiday name cannot be empty")
                        .build();
            }

            // Get the current year
            int currentYear = LocalDate.now().getYear();

            // Create a LocalDate object for the holiday date
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
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Failed to add holiday. Error: " + e.getMessage())
                    .build();
        }
    }
}