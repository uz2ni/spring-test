package com.example.springtest.validation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ValidationController {

    @PostMapping("/user")
    public String user(@Valid @RequestBody User user) {
        System.out.println(user);
        return "success";
    }
}
