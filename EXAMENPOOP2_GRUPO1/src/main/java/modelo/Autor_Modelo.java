/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ruby
 */
public class Autor_Modelo {
    private int idAutor;
    private String cedula;
    
    public Autor_Modelo(int idAutor, String cedula) {
        this.idAutor = idAutor;
        this.cedula = cedula;
    }
    
    public int getIdAutor() { return idAutor; }
    public String getCedula() { return cedula; }
}

