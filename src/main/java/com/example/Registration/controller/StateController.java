package com.example.Registration.controller;


import com.example.Registration.DTO.StateDTO;
import com.example.Registration.entity.State;
import com.example.Registration.service.CountryService;
import com.example.Registration.service.StateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/state")
public class StateController {
 private final StateService stateService;

    public StateController(StateService stateService) {
        this.stateService = stateService;
    }
@PostMapping
    public ResponseEntity<StateDTO> addState(@RequestBody StateDTO state){
        return ResponseEntity.ok(stateService.addState(state));
    }
}
