package com.hitema.intro.controllers;
import com.hitema.intro.models.Country;
import com.hitema.intro.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("/hello")
    public String hello() {
        return "Hello from the server!";
    }
}