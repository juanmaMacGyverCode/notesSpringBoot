package com.proyecto.notas.model;

import javax.persistence.*;

@Entity
@Table(name = "Notas") public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNota;
    private String rutaImagen;
    private String descripcion;
    private String titulo;


    public Nota(int idNota, String descripcion, String rutaImagen, String titulo) {
        this.idNota = idNota;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
    }
    public Nota() {

    }


    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}
