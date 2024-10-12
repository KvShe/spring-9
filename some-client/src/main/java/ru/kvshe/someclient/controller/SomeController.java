package ru.kvshe.someclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    @GetMapping
    public String saySomething() {
        return "Anything";
    }
}
