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

    @RequestMapping("/api/suma")
    public String suma(){
        int a = 18;
        int b = 9;
        int resultado = a + b;
        return "El resultado de la suma "+ a + b + "es" +  resultado; 
    }

    @RequestMapping("/api/resta")
    public String resta(){
        int a = 81;
        int b = 9;
        int resultado = a - b;
        return "El resultado de la suma "+ a + b + "es" +  resultado; 
    }

    @RequestMapping("/api/multiplicacion")
    public String multiplicar(){
        int a = 5;
        int b = 6;
        int resultado = a + b;
        return "El resultado de la multiplicacion entre " + a + b + " es " + resultado;
    }


}