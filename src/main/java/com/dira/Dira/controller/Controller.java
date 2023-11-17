package com.dira.Dira.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/hello")
    public ResponseEntity<String> test() {
        return new ResponseEntity(Optional.of("Hello world,Dick"), HttpStatusCode.valueOf(401));
    }



}
