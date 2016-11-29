package com.example.spring.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fares on 11/29/16.
 */
@RestController
@RequestMapping("/api")
public class TestResource {

    @GetMapping("/foradmin")
    public String forAdmin(){
        return "hello";
    }
}
