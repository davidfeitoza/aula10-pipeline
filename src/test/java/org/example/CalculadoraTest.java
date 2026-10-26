package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void deveSomarDoisNumeros() {
        assertEquals(5, calculadora.somar(2, 3));
    }

    @Test
    void deveDividirDoisNumeros() {
        assertEquals(5, calculadora.dividir(10, 2));
    }

    @Test
    void deveLancarExcecaoQuandoDivisorForZero() {
        assertThrows(
                ArithmeticException.class,
                () -> calculadora.dividir(10, 0)
        );
    }
}