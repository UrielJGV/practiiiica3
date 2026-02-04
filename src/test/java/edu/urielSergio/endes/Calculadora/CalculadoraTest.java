package edu.sergioUriel.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Calculadora.
 */
public class CalculadoraTest {

    private final edu.sergioUriel.endes.Calculadora calc = new edu.sergioUriel.endes.Calculadora();

    @Test
    void testSumar() {
        assertEquals(5.0, calc.sumar(2, 3));
        assertEquals(-1.0, calc.sumar(-2, 1));
        assertEquals(0.0, calc.sumar(0, 0));
    }

    @Test
    void testRestar() {
        assertEquals(1.0, calc.restar(3, 2));
        assertEquals(-3.0, calc.restar(-2, 1));
        assertEquals(0.0, calc.restar(0, 0));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6.0, calc.multiplicar(2, 3));
        assertEquals(-2.0, calc.multiplicar(-2, 1));
        assertEquals(0.0, calc.multiplicar(0, 5));
    }

    @Test
    void testDividir() {
        assertEquals(2.0, calc.dividir(6, 3));
        assertEquals(-2.0, calc.dividir(-4, 2));
        assertEquals(0.5, calc.dividir(1, 2));
    }

    @Test
    void testDividirPorCero() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
        assertEquals("No se puede dividir entre cero.", ex.getMessage());
    }
}

