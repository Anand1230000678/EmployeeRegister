package com.example.Registration.service;

import com.example.Registration.DTO.StateDTO;
import com.example.Registration.entity.Country;
import com.example.Registration.entity.State;
import com.example.Registration.repository.CountryRepo;
import com.example.Registration.repository.StateRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class StateService {
   private final StateRepo stateRepo;
   private final CountryRepo countryRepo;

    public StateService(StateRepo stateRepo, CountryRepo countryRepo) {
        this.stateRepo = stateRepo;
        this.countryRepo = countryRepo;
    }


    public StateDTO addState(StateDTO state) {
        Country country =countryRepo.findByName(state.getCountry());
        State state1=new State();
       state1.setName(state.getName());
       state1.setCountry(country);
       stateRepo.save(state1);
       return state;



    }
}
