package com.service.dsafew.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-27T01:13:47.511Z")

@RestSchema(schemaId = "dsafew")
@RequestMapping(path = "/dsafew", produces = MediaType.APPLICATION_JSON)
public class DsafewImpl {

    @Autowired
    private DsafewDelegate userDsafewDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDsafewDelegate.helloworld(name);
    }

}
