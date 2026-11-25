package edu.modelos.holamundo.dominio;

public class SaludadorFormal implements Saludador {

    @Override
    public String saludar(String nombre) {
        return "Buenos dias, estimado(a) " + nombre;
    }
}