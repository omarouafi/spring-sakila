package com.hitema.intro.controllers;
import com.hitema.intro.models.Country;
import com.hitema.intro.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {


    private CountryService service;
    
    @Autowired
    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Country> getAllCountries() {
        return service.readAll();
    }

    @PostMapping("/create")
    public Country createCountry(@RequestBody Country country) {
        return service.create(country);
    }


    @PutMapping("/update")
    public Country updateCountry(@RequestBody Country country) {
        return service.update(country);
    }
    
}