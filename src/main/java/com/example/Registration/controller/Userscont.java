package com.example.Registration.controller;

import com.example.Registration.DTO.UserDTO;
import com.example.Registration.entity.Users;
import com.example.Registration.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Userscont {
    @Autowired
    private UsersService usersService;

    @PostMapping("/users")
    public Users postData(@RequestBody UserDTO users){
        return usersService.saveUsersData(users);
    }
    @GetMapping("/usersData")
    public List<Users> getAllData(){
        return usersService.getALlUsersData();
    }
    @GetMapping("/users/{id}")
    public Users getData(@PathVariable ("id") long id){
        return usersService.getUsersFindByid(id);
    }
    @PutMapping("/users")
    public Users updateData(@RequestBody Users users){
        return usersService.updateUsersData(users);
    }
    @DeleteMapping("/users/{id}")
    public boolean deleteData(@PathVariable ("id") long id){
        return usersService.deleteUsersData(id);
    }

}
