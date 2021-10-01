package com.example.demo.controller;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailService {

    @Async
    @SneakyThrows
    public void sendEmail(int i) {
        log.info("sending email {}", i);
        Thread.sleep(100);
    }

}
