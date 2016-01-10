package com.vdzon.msw;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestMapping("/customers")
@RestController
@Produces(MediaType.APPLICATION_JSON)
public class TestResource {

    @GET
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Customer> get(@PathVariable("id") String id) {
        Customer robbert = new Customer("Robbert-spring-boot", Long.parseLong(id));
        return new ResponseEntity<Customer>(robbert, HttpStatus.OK);
    }


}
