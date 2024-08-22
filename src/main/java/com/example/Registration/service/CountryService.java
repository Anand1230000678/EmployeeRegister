package com.example.Registration.service;

import com.example.Registration.entity.Country;
import com.example.Registration.repository.CountryRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {
    private  final CountryRepo countryRepo;

    public CountryService(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }

    public Country addCountry(Country country) {
        countryRepo.save(country);
        return country;


    }

    public Country getCountryById(long id) {
       Optional<Country> country=countryRepo.findById(id);
       if(country.isPresent())
       {
           return country.get();
       }
       return null;

    }
}
