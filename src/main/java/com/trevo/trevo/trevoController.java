package com.trevo.trevo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class trevoController {
    // Controller methods will be added here in the future
    @RequestMapping("/")
    public String hello() {
        return "Bem-vindo ao Trevo!";
    }
}
