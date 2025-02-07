/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Libro_Modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Libro_Controlador {

    public List<Libro_Modelo> obtenerLibrosPorCedula(String cedula) {
        List<Libro_Modelo> listaLibros = new ArrayList<>();
        String sql = "CALL ObtenerLibrosPorAutor(?)";

        try (Connection conn = new ConexionBDD().conectar(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cedula);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                listaLibros.add(new Libro_Modelo(
                    rs.getInt("idLibro"),
                    rs.getString("titulo"),
                    rs.getString("cedula")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaLibros;
    }
}
