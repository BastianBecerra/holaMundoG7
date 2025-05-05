package com.holamundo.cl.holamundo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController{

    @RequestMapping("/app")
    public String holaMundo() {
        return "Hola a todos, mi nombre es Pedro";
    }


    @RequestMapping("/api/hello/{nombre}")
    public String saludar(@PathVariable String nombre){
        return "Hola a todos mi nombre es " + nombre;
    }

}