package com.example.Registration.service;

import com.example.Registration.DTO.UserDTO;
import com.example.Registration.entity.Users;

import java.util.List;

public interface UsersService {
    Users saveUsersData(UserDTO users);
    List<Users>getALlUsersData();
    Users getUsersFindByid(long id);
    Users updateUsersData(Users users);
    boolean deleteUsersData(long id);



}
