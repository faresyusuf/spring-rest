package com.example.spring.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fares on 11/20/16.
 */
@RestController
@RequestMapping("/api")
public class AccountResource {
    private final Logger log = LoggerFactory.getLogger(AccountResource.class);

    @GetMapping("/authenticate")
    public String authenticate(){
        return "Hi";
    }

}
