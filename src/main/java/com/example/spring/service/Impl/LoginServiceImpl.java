package com.example.spring.service.Impl;

import com.example.spring.entity.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean login(String username, String password) {
        if(userRepository.existsByUsername(username)){
            User user = userRepository.findByUsername(username);
            if (user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}