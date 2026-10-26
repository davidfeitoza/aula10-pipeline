package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorSenhaTest {

    private final ValidadorSenha validador = new ValidadorSenha();

    @Test
    void deveRejeitarSenhaNula() {
        assertFalse(validador.validar(null));
    }

    @Test
    void deveRejeitarSenhaCurta() {
        assertFalse(validador.validar("1234"));
    }

    @Test
    void deveAceitarSenhaComOitoCaracteres() {
        assertTrue(validador.validar("12345678"));
    }
}