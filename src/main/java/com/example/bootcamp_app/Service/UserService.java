package com.example.bootcamp_app.Service;

import com.example.bootcamp_app.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

//    private final PasswordEncoder passwordEncoder;
    private final UserRepository repository;
}
