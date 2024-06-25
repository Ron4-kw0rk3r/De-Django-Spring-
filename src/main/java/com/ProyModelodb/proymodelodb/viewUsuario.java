package com.ProyModelodb.proymodelodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class viewUsuario {

    
    public static Usuario[] getTodosUsuariosArray() {
        String url = "jdbc:postgresql://localhost:5432/ModeloSpring";
        String user = "postgres";
        String password = "toor";

        String sql = "SELECT * FROM usuario";

        Usuario[] usuarios = new Usuario[100]; // Assuming a maximum of 100 users
        int index = 0;

        try (Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNombre(rs.getString("nombre"));
                usuario.setEdad(rs.getInt("edad"));
                usuario.setEstado(rs.getBoolean("estado"));
                usuarios[index++] = usuario;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        // Resize the array to the actual number of users
        Usuario[] result = new Usuario[index];
        System.arraycopy(usuarios, 0, result, 0, index);

        return result;
    }
}