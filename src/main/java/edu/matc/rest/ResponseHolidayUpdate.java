package edu.matc.rest;

import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

@Path("/holiday")
public class ResponseHolidayUpdate {
    private final Logger logger = LogManager.getLogger(this.getClass());

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
}
