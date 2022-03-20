package com.example.sprintboottestcontainers.services;

import com.example.sprintboottestcontainers.models.User;
import com.example.sprintboottestcontainers.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

}
