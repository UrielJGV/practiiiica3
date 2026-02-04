package edu.sergioUriel.endes;

/**
 * Clase para convertir temperaturas entre Celsius y Fahrenheit.
 */
public class ConversorTemperatura {

    /**
     * Convierte grados Celsius a Fahrenheit.
     * @param celsius temperatura en grados Celsius
     * @return temperatura en grados Fahrenheit
     */
    public double celsiusAFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /**
     * Convierte grados Fahrenheit a Celsius.
     * @param fahrenheit temperatura en grados Fahrenheit
     * @return temperatura en grados Celsius
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}

