package com.holamundo.cl.holamundo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController{

    @RequestMapping("/app")
    public String holaMundo() {
        return "Hola a todos, mi nombre es Pedro";
    }

}