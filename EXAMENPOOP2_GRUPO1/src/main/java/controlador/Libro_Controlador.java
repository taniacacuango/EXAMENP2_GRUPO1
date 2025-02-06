/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ruby
 */
public class Libro_Controlador {
    public static DefaultTableModel obtenerLibrosPorCedula(String cedula) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID Libro", "Cédula Autor"}, 0);
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_base", "usuario", "contraseña");
             PreparedStatement ps = conn.prepareStatement("CALL ObtenerLibrosPorAutor(?)")) {
            
            ps.setString(1, cedula);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("idLibro"), rs.getString("cedula")});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al consultar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return model;
    }
}  

