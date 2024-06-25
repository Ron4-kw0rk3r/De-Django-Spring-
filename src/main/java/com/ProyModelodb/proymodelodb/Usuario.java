package com.ProyModelodb.proymodelodb;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    // ----------------------------------------------------
    // Declaracion de metodos get y set
    // ----------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // ----------------------------------------------------
    // Metodo para obtener todos los usuarios de la base de datos
    // ----------------------------------------------------
    
    // ----------------------------------------------------
    // Metodo para insertar usuario en la base de datos
    // ----------------------------------------------------
    public void insertUsuario(String nombre, int edad, boolean estado) {
        String url = "jdbc:postgresql://localhost:5432/ModeloSpring";
        String user = "postgres";
        String password = "toor";

        String sql = "INSERT INTO usuario (nombre, edad, estado) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setInt(2, edad);
            pstmt.setBoolean(3, estado);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    
    
}