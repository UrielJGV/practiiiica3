package edu.sergioUriel.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase ValidadorPassword.
 */
public class ValidadorPasswordTest {

    private final edu.sergioUriel.endes.ValidadorPassword validador = new edu.sergioUriel.endes.ValidadorPassword();

    @Test
    void testPasswordValida() {
        assertTrue(validador.esPasswordValida("Abcdefg1"));
        assertTrue(validador.esPasswordValida("Password123"));
    }

    @Test
    void testPasswordDemasiadoCorta() {
        assertFalse(validador.esPasswordValida("Abc1"));
    }

    @Test
    void testPasswordSinMayusculas() {
        assertFalse(validador.esPasswordValida("abcdefg1"));
    }

    @Test
    void testPasswordSinNumeros() {
        assertFalse(validador.esPasswordValida("Abcdefgh"));
    }

    @Test
    void testPasswordNula() {
        assertFalse(validador.esPasswordValida(null));
    }

    @Test
    void testPasswordVaciaOSoloEspacios() {
        assertFalse(validador.esPasswordValida(""));
        assertFalse(validador.esPasswordValida("        "));
    }
}

