package com.dira.Dira.controller;

import com.dira.Dira.model.Customer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
@RequestMapping("/customer")
public class ControllerCustomer {

    @GetMapping("/getname")
    public ResponseEntity<String> getName() {
        return new ResponseEntity(Optional.of("Name of Customer"), HttpStatusCode.valueOf(401));


    }
    @PostMapping("/newсustomer")
    public void newCustomer(@RequestBody String jsonObjectCustomer){
        Gson gson = new Gson();
        Customer customer =gson.fromJson(jsonObjectCustomer,Customer.class);
        System.out.println(customer);


    }
}
