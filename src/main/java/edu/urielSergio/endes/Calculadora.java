package edu.sergioUriel.endes;

/**
 * Clase que la proporciona operaciones aritméticas básicas.
 */
public class Calculadora {

    /**
     * Suma dos números.
     * @param a primer sumando
     * @param b segundo sumando
     * @return suma de a y b
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Resta dos números.
     * @param a minuendo
     * @param b sustraendo
     * @return resultado de a - b
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dos números.
     * @param a primer factor
     * @param b segundo factor
     * @return producto de a y b
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide dos números.
     * @param a dividendo
     * @param b divisor
     * @return resultado de a / b
     * @throws IllegalArgumentException si b es cero
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return a / b;
    }
}
