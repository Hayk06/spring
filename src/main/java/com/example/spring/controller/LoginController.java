package com.example.spring.controller;

import com.example.spring.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestParam String fname, @RequestParam String fpass) {
        if (loginService.login(fname, fpass)) {
            return "redirect:/admin";
        } else {
            return "redirect:/home";
        }
    }
}
