package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/vinyls")
public class VinylController {

    @GetMapping
    public Object getVinyls(){
        return null;
    }
}
