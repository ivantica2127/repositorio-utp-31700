package com.utp.myapp.sistemautp31700.sales.interfaces.rest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> saludo(@RequestParam(defaultValue = "world") String name){
        String saludo = "Hello " + name + "!";
        return ResponseEntity.ok(saludo);
    }
}

