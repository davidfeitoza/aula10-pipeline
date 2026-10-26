package org.example;

public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor não pode ser zero");
        }

        return a / b;
    }
}