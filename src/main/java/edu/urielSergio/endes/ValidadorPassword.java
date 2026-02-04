package edu.sergioUriel.endes;

import java.util.regex.Pattern;

/**
 * Clase para validar contraseñas según reglas básicas de seguridad.
 */
public class ValidadorPassword {

    private static final Pattern PATRON_PASSWORD = Pattern.compile(
            "^(?=.*[A-Z])(?=.*\\d).{8,}$"
    );

    /**
     * Valida si una contraseña cumple las reglas:
     * - Al menos 8 caracteres
     * - Al menos una mayúscula
     * - Al menos un número
     * @param password contraseña a validar
     * @return true si es válida, false en caso contrario
     */
    public boolean esPasswordValida(String password) {
        if (password == null || password.trim().isEmpty()) {
            return false;
        }
        return PATRON_PASSWORD.matcher(password).matches();
    }
}

