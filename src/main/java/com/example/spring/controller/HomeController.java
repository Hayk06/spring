package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome() {
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/about_us")
    public String aboutUs(){
        return "about_us";
    }
    @GetMapping("/product")
    public String product(){
        return "product";
    }

    @GetMapping("/sign_in")
    public String signIn(){
        return "sign_in";
    }

}