package com.example.actuator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {

    @GetMapping("/get")
    public ResponseEntity<String> getData(){
        return ResponseEntity.ok("Response from getData method!!!");
    }
}
