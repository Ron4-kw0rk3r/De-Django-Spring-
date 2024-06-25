package com.ProyModelodb.proymodelodb.Repositories;
/* 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.ProyModelodb.proymodelodb.Models.Usuario;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
@RestController
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
// Custom query to insert a new user into the database
    @Modifying
    @Query(value = "INSERT INTO usuario (nombre, edad, estado) VALUES (:nombre, :edad, :estado)", nativeQuery = true)
    void insertUsuario(@Param("nombre") String nombre, @Param("edad") int edad, @Param("estado") boolean estado);

}

*/