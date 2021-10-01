package com.example.demo.controller;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EmailController {

    @Autowired // even better using contructor
    private EmailService emailService;

    // http://localhost:8080/sendEmails
    @GetMapping("/sendEmails") // this should be @PostMapping !!!
    public void sendEmails() {
        for (int i = 0; i < 100; i++) {
            emailService.sendEmail(i);
        }
    }

}
