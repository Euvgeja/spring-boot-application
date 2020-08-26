package com.lisiy.demoproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}