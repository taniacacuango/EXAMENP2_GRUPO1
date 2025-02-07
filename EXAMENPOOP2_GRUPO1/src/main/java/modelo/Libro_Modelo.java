/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ruby
 */


public class Libro_Modelo {
    private int idLibro;
    private String titulo;
    private String cedulaAutor;

    public Libro_Modelo(int idLibro, String titulo, String cedulaAutor) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.cedulaAutor = cedulaAutor;
    }

    public int getIdLibro() { return idLibro; }
    public String getTitulo() { return titulo; }
    public String getCedulaAutor() { return cedulaAutor; }
}
