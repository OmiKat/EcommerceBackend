package com.example.Ecommerce.Backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class hello {

    @GetMapping
    public String hola(){
        return "hello";
    }

}
