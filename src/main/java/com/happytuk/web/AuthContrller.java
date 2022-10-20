package com.happytuk.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthContrller {

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable("id") String id) {

        return "{\"id\":\"" + id + "\", \"name\":\" wendy\"}";
    }

}
