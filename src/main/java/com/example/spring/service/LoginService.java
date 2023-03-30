package com.example.spring.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    boolean login(String username, String password);
}