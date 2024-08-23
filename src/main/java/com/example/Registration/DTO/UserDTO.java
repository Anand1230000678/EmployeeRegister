package com.example.Registration.DTO;

import com.example.Registration.entity.Country;
import com.example.Registration.entity.State;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class UserDTO {
    private String name;
    private String address;
    private String country;
    private String state;
    private List<String> qualification;
    private String religion;

}
