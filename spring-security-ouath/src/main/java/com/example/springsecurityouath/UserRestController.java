package com.example.springsecurityouath;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Dena bank";
    }

//    @GetMapping("/admin")
//    public String adminProcess() {
//        return "Welcome admin";
//    }
//
//
//    @GetMapping("/user")
//    public String userProcess() {
//        return "Welcome user";
//    }
}
