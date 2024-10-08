package com.dibs-demo.crm.restfulwebservices.controller;

import com.dibs-demo.crm.restfulwebservices.model.BasicAuthentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {

    @GetMapping("/basicauth")
    public BasicAuthentication basicAuth() {
        return new BasicAuthentication("You are authenticated!");
    }
}
