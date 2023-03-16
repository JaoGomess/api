package com.api.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculadoraController {
    
    @GetMapping("/doubles")
    public List<Double> getDoubles(@RequestParam("numbers") List<Double> numbers) { return numbers; }

    @GetMapping("/somar")
    public double Somar(@RequestParam("numbers") List<Double> numeros) {
        double valorSomado = 0;
        for (double num: numeros) {
            valorSomado = valorSomado + num;
        }
        return valorSomado;
    }

    @GetMapping("/subtrair")
    public double Subtrair(@RequestParam("numbers") List<Double> numeros) {
        double valorSubtraido = numeros.get(0);
        for(int i = 1; i < numeros.size(); i++){
            valorSubtraido -= numeros.get(i);
        }
        if (valorSubtraido < 0) return 0;
            else return valorSubtraido;
    }

    @GetMapping("/multiplicar")
    public double Multiplicar(@RequestParam("numbers") List<Double> numeros) {
        double valorMultiplicado = 1;
        for (double num: numeros) {
            valorMultiplicado *= num;
        }
        return valorMultiplicado;
    }


    @GetMapping("/dividir")
    public double Dividr(@RequestParam("numer") double num1, @RequestParam("numer") double num2) { return num1 / num2; }
}

