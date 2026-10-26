package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioVendasTest {

    private final RelatorioVendas relatorio = new RelatorioVendas();

    @Test
    void deveCalcularTotal() {
        assertEquals(
                60.0,
                relatorio.calcularTotal(new double[]{10, 20, 30}),
                0.001
        );
    }

    @Test
    void deveCalcularMedia() {
        assertEquals(
                20.0,
                relatorio.calcularMedia(new double[]{10, 20, 30}),
                0.001
        );
    }

    @Test
    void deveRetornarZeroNaMediaDeListaVazia() {
        assertEquals(
                0.0,
                relatorio.calcularMedia(new double[]{}),
                0.001
        );
    }

    @Test
    void deveEncontrarMaiorVenda() {
        assertEquals(
                30.0,
                relatorio.maiorVenda(new double[]{10, 30, 20}),
                0.001
        );
    }
}