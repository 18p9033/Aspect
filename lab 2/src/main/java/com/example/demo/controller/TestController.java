package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")  // جميع الطلبات اللي بتبدأ بـ /test هتروح هنا
public class TestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "🚀 Spring Boot is working!";
    }
}
