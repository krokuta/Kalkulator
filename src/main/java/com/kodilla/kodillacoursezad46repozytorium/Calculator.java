package com.kodilla.kodillacoursezad46repozytorium;

public class Calculator {

    public void adding(double a, double b){
        double add;
        add = a + b;
        System.out.println(add);
    }

    public void subtracting(double a, double b) {
        double sub;
        sub = a - b;
        System.out.println(sub);
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.adding(3.4, 6.5);
        calculator.subtracting(2.5, 9.2);
        System.out.println("hell yeah!!!");
    }
}
