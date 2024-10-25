/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.disenotaller3;

import java.util.List;

/**
 *
 * @author CMONTES
 */
public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    
    List<Estudiante> estudiantesInscritos;
    List<Estudiante> estudiantesEnEsperaDeInscripcion;
    List<Profesor> cursosACargo;
    List<ActividadSumativa> actividadesSumativas;
    List<Foro> foros;

    public Curso(String id, String nombre, boolean estadoDisponible, List<Estudiante> estudiantesInscritos, List<Estudiante> estudiantesEnEsperaDeInscripcion, List<Profesor> cursosACargo, List<ActividadSumativa> actividadesSumativas, List<Foro> foros) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.estudiantesInscritos = estudiantesInscritos;
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
        this.cursosACargo = cursosACargo;
        this.actividadesSumativas = actividadesSumativas;
        this.foros = foros;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

    public List<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(List<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public List<Estudiante> getEstudiantesEnEsperaDeInscripcion() {
        return estudiantesEnEsperaDeInscripcion;
    }

    public void setEstudiantesEnEsperaDeInscripcion(List<Estudiante> estudiantesEnEsperaDeInscripcion) {
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
    }

    public List<Profesor> getCursosACargo() {
        return cursosACargo;
    }

    public void setCursosACargo(List<Profesor> cursosACargo) {
        this.cursosACargo = cursosACargo;
    }

    public List<ActividadSumativa> getActividadesSumativas() {
        return actividadesSumativas;
    }

    public void setActividadesSumativas(List<ActividadSumativa> actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }

    public List<Foro> getForos() {
        return foros;
    }

    public void setForos(List<Foro> foros) {
        this.foros = foros;
    }
    
    
    
}
