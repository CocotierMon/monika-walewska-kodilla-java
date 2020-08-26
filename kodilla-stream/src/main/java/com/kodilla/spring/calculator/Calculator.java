package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public double add(double a, double b){
        System.out.println("Metoda add pokazuje wynik działania " + a + " + " + b );
        Display.displayValue(a + b);
        return a + b;
    }
    public double sub(double a, double b){
        System.out.println("Metoda sub pokazuje wynik działania " + a + " - " + b );
        Display.displayValue(a - b);
        return a - b;
    }
    public double mul(double a, double b){
        System.out.println("Metoda mul pokazuje wynik działania " + a + " * " + b );
        Display.displayValue(a * b);
        return a * b;
    }
    public double div(double a, double b) throws IllegalArgumentException{
        System.out.println("Metoda div pokazuje wynik działania " + a + " / " + b);
        Display.displayValue(a / b);
        return a / b;
    }
}
