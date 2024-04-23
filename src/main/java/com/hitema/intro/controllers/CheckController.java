package com.hitema.intro.controllers;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CheckController {

    @GetMapping({"/","/check"})
    public String helloServer() {
        LocalDate currentDate = LocalDate.now();
        return "<h1>Hello from the server! The current date is: " + currentDate.toString() + "</h1>";
    }

}
