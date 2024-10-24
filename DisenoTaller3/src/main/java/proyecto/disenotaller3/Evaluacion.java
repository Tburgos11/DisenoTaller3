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
public class Evaluacion extends ActividadSumativa{
    private int limiteDeTiempo;

    public Evaluacion(int limiteDeTiempo, String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
        this.limiteDeTiempo = limiteDeTiempo;
    }

    

    
    
}
