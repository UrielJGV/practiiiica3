package edu.urielSergio.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase ConversorTemperatura.
 */
public class ConversorTemperaturaTest {

    private final edu.sergioUriel.endes.ConversorTemperatura conversor = new edu.sergioUriel.endes.ConversorTemperatura();

    @Test
    void testCelsiusAFahrenheit() {
        assertEquals(32.0, conversor.celsiusAFahrenheit(0), 0.0001);
        assertEquals(212.0, conversor.celsiusAFahrenheit(100), 0.0001);
        assertEquals(-40.0, conversor.celsiusAFahrenheit(-40), 0.0001);
    }

    @Test
    void testFahrenheitACelsius() {
        assertEquals(0.0, conversor.fahrenheitACelsius(32), 0.0001);
        assertEquals(100.0, conversor.fahrenheitACelsius(212), 0.0001);
        assertEquals(-40.0, conversor.fahrenheitACelsius(-40), 0.0001);
    }
}

