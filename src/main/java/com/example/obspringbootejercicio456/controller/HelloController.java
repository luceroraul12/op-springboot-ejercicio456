package com.example.obspringbootejercicio456.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/mensaje-bienvenida")
    public String saludar(){
        return "Saludando....";
    }
}
