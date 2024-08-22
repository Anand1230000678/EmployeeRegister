package com.example.Registration.repository;

import com.example.Registration.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface StateRepo extends JpaRepository<State,Long> {
}
