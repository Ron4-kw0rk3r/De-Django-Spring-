package com.ProyModelodb.proymodelodb;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/getusuarios")
public class getrunnerSpring {

    @GetMapping
    public ResponseEntity<Usuario[]> getUsuarios() {
        try {
            Usuario[] usuarios = viewUsuario.getTodosUsuariosArray();
            return ResponseEntity.ok(usuarios);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    
}
