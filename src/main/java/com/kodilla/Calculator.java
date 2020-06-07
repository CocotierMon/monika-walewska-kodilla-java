package com.kodilla;

public class Calculator{

private final int a;
private final int b;

Calculator(int a, int b){
    this.a = a;
    this.b = b;
}

    public int plus(){
        return a + b;
    }

    public int minus(){
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(2,3);
        System.out.println("Wynik działania to: " + calculator.plus());
        System.out.println("Wynik działania to: " + calculator.minus());
    }
}
