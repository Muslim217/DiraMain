package com.dira.Dira.controller;



import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/test")
public class ControllerTest {

    @GetMapping("/hello")
    public ResponseEntity<String> test() {
        return new ResponseEntity(Optional.of("Hello world!"), HttpStatusCode.valueOf(401));
    }
}
