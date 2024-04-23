package com.hitema.intro.controllers;


import com.hitema.intro.models.City;
import com.hitema.intro.services.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    private CityService service;

    public CityController(CityService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<City> getAllCities() {
        return service.readAll();
    }
}
