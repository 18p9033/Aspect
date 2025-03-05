package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/my")
public class MyController {
    @GetMapping("/data")
    public String getData() {
        return "Data from MyController";
    }
}
