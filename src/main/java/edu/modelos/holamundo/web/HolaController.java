package edu.modelos.holamundo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola Mundo desde Spring Boot";
    }

    @GetMapping("/hola/{nombre}")
    public String holaA(@PathVariable String nombre) {
        return "Hola, " + nombre;
    }
}