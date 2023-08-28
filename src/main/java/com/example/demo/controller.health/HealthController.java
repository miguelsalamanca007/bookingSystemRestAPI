package com.example.demo.controller.health;

import org.springframework.web.bind.annotation.RequestMapping;

public class HealthController {
    @RequestMapping("/health")
    public String checkAPI(){
        return "<h1>The API is working ok!</h1>";
    }
}
