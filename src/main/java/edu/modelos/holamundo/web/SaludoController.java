package edu.modelos.holamundo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.modelos.holamundo.dominio.Saludador;

@RestController
public class SaludoController {

    private final Saludador saludador;

    // Spring ve que el constructor necesita un Saludador y le entrega el que creo en ConfiguracionApp.
    public SaludoController(Saludador saludador) {
        this.saludador = saludador;
    }

    @GetMapping("/saludo")
    public Saludo saludo(@RequestParam(defaultValue = "Mundo") String nombre) {
        String mensaje = saludador.saludar(nombre);
        return new Saludo(mensaje, mensaje.length());
    }
}