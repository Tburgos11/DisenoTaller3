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
public class Tarea extends ActividadSumativa{
    protected Date fechaDePublicacion;

    public Tarea(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
    }

    
    
}
