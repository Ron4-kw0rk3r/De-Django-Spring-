package com.ProyModelodb.proymodelodb;

import org.springframework.boot.web.servlet.error.ErrorController;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class fallaError implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        // Puedes agregar lógica personalizada aquí para manejar errores
        boolean isError = request.getAttribute("javax.servlet.error.status_code") != null; // tu lógica para determinar si hay un error
        if (isError) {
            return "Falla"; // Devuelve "error" si hay un error
        } else {
            return "Correcto"; // Devuelve "success" si no hay error
        }
    }
 
}