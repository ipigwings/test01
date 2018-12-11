package com.service.cse.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2018-12-11T02:27:31.878Z")


@RestSchema(schemaId = "sdzsdzts")
@Path("/cse")

@Produces({ "application/json" })
public class SdzsdztsImpl  {

    @Autowired
    private SdzsdztsDelegate sdzsdztsDelegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return sdzsdztsDelegate.helloworld(name);
    }
}

