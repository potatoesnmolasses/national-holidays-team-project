package edu.matc.rest;

import com.google.gson.Gson;
import edu.matc.entity.Holiday;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Path("/allHolidays")
public class ResponseHolidayAll {
    private final Logger logger = LogManager.getLogger(this.getClass());

    // The Java method will process HTTP GET requests
    @GET
    @Produces("text/json")
    public Response getMessage() {
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
        List<Holiday> holidays = holidayDao.getAll();
        logger.debug("The list of holidays:" + holidays);

        // Convert the list of Holiday objects to JSON using Gson
        Gson gson = new Gson();
        String json = gson.toJson(holidays);

        return Response.status(200).entity(json).build();
    }

    @Path("/plainText")
    @GET
    @Produces("text/plain")
    public Response getPlainMessage(@Context HttpHeaders requestHeaders) {
        /**
        GenericDao<Holiday> holidayDao = new GenericDao<>(Holiday.class);
        List<Holiday> holidays = holidayDao.getAll();
        //Generate strings of holidays
        StringBuilder builder = new StringBuilder();
        for (Holiday holiday : holidays) {
            builder.append(holiday.toString());
            builder.append("\n");
        }
        String output = builder.toString();*/

        String output = requestHeaders.getRequestHeader("Accept").get(0);
        return Response.status(200).entity(output).build();}

    @Path("/plainText")
    @GET
    @Produces("text/html")
    public Response getHtmlMessage(@Context HttpHeaders requestHeaders) {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><title>Titled</title><body>");

        builder.append(requestHeaders.getRequestHeader("Accept").get(0));
        builder.append("</body></html>");
        String output = builder.toString();
        return Response.status(200).entity(output).build();}

    @GET
    @Path("/test1")
    public String allHeaders(@Context  HttpHeaders headers) {
        MultivaluedMap<String, String> rh = headers.getRequestHeaders();
        String str = rh.entrySet()
                .stream()
                .map(e -> e.getKey() + " = " + e.getValue())
                .collect(Collectors.joining("<br/>"));
        return str;
    }
}