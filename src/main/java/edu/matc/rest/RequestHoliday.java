package edu.matc.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Application;
import javax.ws.rs.ext.Provider;
import java.util.HashSet;
import java.util.Set;

//Defines the base URI for all resource URIs.
@ApplicationPath("/")
//The java class declares root resource and provider classes
public class RequestHoliday extends Application {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {

        HashSet h = new HashSet<Class<?>>();
        h.add(ResponseHolidayAll.class);
        h.add(ResponseHolidayById.class);
        h.add(ResponseHolidayByName.class);
        h.add(ResponseHolidayByDate.class);
        return h;
    }
}