/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.disenotaller3;

import java.util.Date;

/**
 *
 * @author CMONTES
 */
public abstract class ActividadSumativa {
    protected String titulo;
    protected Date fechaDeEntrega;
    protected float puntajeMaximo;
    protected String contenido;
    protected float calificacion;
    protected String id;

    public ActividadSumativa(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id) {
        this.titulo = titulo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.puntajeMaximo = puntajeMaximo;
        this.contenido = contenido;
        this.calificacion = calificacion;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public float getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeMaximo(float puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
}
