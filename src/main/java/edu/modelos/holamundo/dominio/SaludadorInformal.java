package edu.modelos.holamundo.dominio;

public class SaludadorInformal implements Saludador {

    @Override
    public String saludar(String nombre) {
        return "Hola, " + nombre;
    }
}