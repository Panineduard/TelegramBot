package com.ascendix.hakaton.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/getPerson", headers="Accept=application/json")
    public @ResponseBody
    String g() {

        return "Hello";
    }
}
