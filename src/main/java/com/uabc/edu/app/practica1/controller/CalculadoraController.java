package com.uabc.edu.app.practica1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    float res;

    @GetMapping("/")
    public String saludo(){

        return "<b> Bienvenidos chavales</b>";
    }
    @GetMapping("/sumar")
    public float sumar(@RequestParam(name = "numA") float num1,
                       @RequestParam(name = "numB") float num2){
        res = num1 + num2;
        return res;
    }
    @GetMapping("/restar")
    public float restar(@RequestParam(name = "numA") float num1,
                        @RequestParam(name = "numB") float num2){
        res = num1 - num2;
        return res;
    }

    @GetMapping("/multiplicar")
    public float multiplicar(@RequestParam(name = "numA") float num1,
                             @RequestParam(name = "numB") float num2){
        res = num1 * num2;
        return res;
    }

    @GetMapping("/dividir")
    public float dividir(@RequestParam(name = "numA") float num1,
                         @RequestParam(name = "numB") float num2){
        res = num1 / num2;
        return res;
    }

    @GetMapping("/cuadrado")
    public float cuadrado(@RequestParam(name = "numA") float num1){
        res = num1*num1;
        return res;
    }

    @GetMapping("/porcentaje")
    public float residuo(@RequestParam(name = "numA") float num1,
                         @RequestParam(name = "numB") float num2){
        res = num1*(num2/100);
        return res;
    }
}
