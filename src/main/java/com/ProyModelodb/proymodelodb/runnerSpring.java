package com.ProyModelodb.proymodelodb;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.Map;


@RestController
@RequestMapping("/usuarios")
public class runnerSpring {

    @PostMapping
    public ResponseEntity<String> agregarUsuario(@RequestBody Map<String, Object> payload) {
        try {
            String nombre = (String) payload.get("nombre");
            int edad = (int) payload.get("edad");
            boolean estado = (boolean) payload.get("estado");

            Usuario usuario = new Usuario();
            usuario.setNombre(nombre);
            usuario.setEdad(edad);
            usuario.setEstado(estado);
            usuario.insertUsuario(nombre, edad, estado);

            return ResponseEntity.ok("Datos almacenados en la db");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: No se pudieron cargar los datos");
        }
    }
}

