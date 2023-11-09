package com.dira.Dira.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/seller")
public class ControllerSeller {

    @GetMapping("/read")
    public ResponseEntity<String> read() {
        return new ResponseEntity(Optional.of("Hello im Seller"), HttpStatusCode.valueOf(200));
    }
    @PostMapping("/create")
    public void create(){


    }

}
