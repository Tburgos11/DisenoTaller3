/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.disenotaller3;

import java.util.Date;
import java.util.List;

/**
 *
 * @author CMONTES
 */
public class Incidente {
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
    protected PersonalAcademico beneficiario;
    private Usuario responsableIncidentes;

    public Incidente(int id, Date fecha_reportado, String estado, String titulo, String descripcion, List log_actualizaciones, Date fecha_cerrado, String tipo, PersonalAcademico beneficiario, Usuario responsableIncidentes) {
        this.id = id;
        this.fecha_reportado = fecha_reportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrado = fecha_cerrado;
        this.tipo = tipo;
        this.beneficiario = beneficiario;
        this.responsableIncidentes = responsableIncidentes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_reportado() {
        return fecha_reportado;
    }

    public void setFecha_reportado(Date fecha_reportado) {
        this.fecha_reportado = fecha_reportado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public List getLog_actualizaciones() {
        return log_actualizaciones;
    }

    public void setLog_actualizaciones(List log_actualizaciones) {
        this.log_actualizaciones = log_actualizaciones;
    }

    public Date getFecha_cerrado() {
        return fecha_cerrado;
    }

    public void setFecha_cerrado(Date fecha_cerrado) {
        this.fecha_cerrado = fecha_cerrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public PersonalAcademico getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(PersonalAcademico beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Usuario getResponsableIncidentes() {
        return responsableIncidentes;
    }

    public void setResponsableIncidentes(Usuario responsableIncidentes) {
        this.responsableIncidentes = responsableIncidentes;
    }
    
    
    
}
