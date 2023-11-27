package com.pee.dockerized.postgresql.user;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/test")
public class nuevoControlador {

    @GetMapping("/hola")
    public String hola() {
        return "pepito";
    }
}
