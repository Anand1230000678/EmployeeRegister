package com.example.Registration.controller;

import com.example.Registration.entity.Country;
import com.example.Registration.service.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryService countryService;


    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping
    public ResponseEntity<Country> addCountry(@RequestBody Country country){
       return ResponseEntity.ok(countryService.addCountry(country));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable  long id){
        return ResponseEntity.ok(countryService.getCountryById(id));
    }
}
