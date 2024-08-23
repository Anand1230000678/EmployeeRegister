package com.example.Registration.service;

import com.example.Registration.DTO.UserDTO;
import com.example.Registration.entity.Country;
import com.example.Registration.entity.State;
import com.example.Registration.entity.Users;
import com.example.Registration.repository.CountryRepo;
import com.example.Registration.repository.StateRepo;
import com.example.Registration.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsersServiceImp implements UsersService{
    @Autowired
    private UsersRepo usersRepo;
    @Autowired
    private CountryRepo countryRepo;
    @Autowired
    private StateRepo stateRepo;

    @Override
    public Users saveUsersData(UserDTO users) {
        Users user = new Users();
        user.setName(users.getName());
        user.setAddress(users.getAddress());
        Country country=countryRepo.findByName(users.getCountry());
        user.setCountry(country);
        State state= stateRepo.findByName(users.getState());
        user.setState(state);
        user.setQualification(users.getQualification());
        user.setReligion(users.getReligion());
        usersRepo.save(user);
        return user;


    }

    @Override
    public List<Users> getALlUsersData() {
        return usersRepo.findAll();
    }

    @Override
    public Users getUsersFindByid(long id) {
        Optional<Users>  users1 = usersRepo.findById(id);
        if(users1.isPresent()) {
            return users1.get();
        }
        return null;
    }

    @Override
    public Users updateUsersData(Users users) {
        Optional<Users> users2 = usersRepo.findById(users.getId());
        if (users2.isPresent())
        {
            Users oriUsers = users2.get();
            oriUsers.setName(users.getName());
            oriUsers.setAddress(users.getAddress());
            oriUsers.setCountry(users.getCountry());
            oriUsers.setState(users.getState());
            oriUsers.setQualification(users.getQualification());
            oriUsers.setReligion(users.getReligion());
            return usersRepo.save(oriUsers);
        }

        return null;
    }

    @Override
    public boolean deleteUsersData(long id) {
       try{
           usersRepo.deleteById(id);
           return true;
       }catch (Exception e){
           throw new RuntimeException("failed to users data"+ e.getMessage());

       }

    }
}
