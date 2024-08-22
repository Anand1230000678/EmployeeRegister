package com.example.Registration.repository;

import com.example.Registration.entity.Country;
import com.example.Registration.entity.State;
import com.example.Registration.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users,Long> {
}
