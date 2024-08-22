package com.example.Registration.repository;

import com.example.Registration.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country,Long> {
    Country findByName(String country);
}
