package com.example.bootcamp_app.Repository;

import java.util.Optional;

import com.example.bootcamp_app.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

}