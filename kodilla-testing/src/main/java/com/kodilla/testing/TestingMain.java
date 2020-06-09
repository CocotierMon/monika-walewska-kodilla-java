package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator(2,3);
        System.out.println("Wynik dodawania to: " + calculator.add());
        System.out.println("Wynik odejmowania to: " + calculator.substract());
    }
}
