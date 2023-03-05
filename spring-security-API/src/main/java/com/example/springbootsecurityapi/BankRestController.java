package com.example.springbootsecurityapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to SBI bank";
    }

    @GetMapping("/transfer")
    public String transfer() {
        return "Funds transfer initiated";
    }

    @GetMapping("/balance")
    public String checkBalance() {
        return "Your account balance is Rs 10,000";
    }

    @GetMapping("/about")
    public String aboutUs() {
        return "SBI bank managed by Indian govt";
    }
}
