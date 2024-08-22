package com.example.Registration.service;

import com.example.Registration.entity.Users;
import com.example.Registration.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsersServiceImp implements UsersService{
    @Autowired
    private UsersRepo usersRepo;

    @Override
    public Users saveUsersData(Users users) {
          
        return usersRepo.save(users);
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
