package edu.matc.rest;

import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/holidays")
public class ResponseHoliday {
    private final Logger logger = LogManager.getLogger(this.getClass());

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public Response getMessage() {
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
        List<Holiday> holidays = holidayDao.getAll();
        logger.debug(holidays);
        StringBuilder text = new StringBuilder();

        for (Holiday holiday : holidays) {
            text.append(holiday.toString());
        }

        return Response.status(200).entity(text.toString()).build();
    }
}