package edu.modelos.holamundo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.modelos.holamundo.dominio.Saludador;
import edu.modelos.holamundo.dominio.SaludadorFormal;
import edu.modelos.holamundo.dominio.SaludadorInformal;

@Configuration
public class ConfiguracionApp {

    // Spring ejecuta este metodo una sola vez y guarda el objeto que devuelve.
    // El valor de saludo.estilo se lee de application.properties (si no existe, usa "informal").
    @Bean
    public Saludador saludador(@Value("${saludo.estilo:informal}") String estilo) {
        if (estilo.equals("formal")) {
            return new SaludadorFormal();
        }
        return new SaludadorInformal();
    }
}