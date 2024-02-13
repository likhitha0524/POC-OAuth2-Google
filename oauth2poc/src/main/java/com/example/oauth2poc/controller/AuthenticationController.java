package com.example.oauth2poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/")
    public String home(){
        return "Hello welcome to Home page!";
    }
    @GetMapping("/restricted")
    public String restricted()
    {
        return "To see this text you need to be logged in!";
    }
}
