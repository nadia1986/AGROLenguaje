/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entity;

import java.time.LocalDate;

/**
 *
 * @author nadia
 */
public class RegistroLaboreo {

    private LocalDate fechaInicioLaboreo;
    private LocalDate fechaFinLaboreo;
    private ProyectoDeCultivo unProyectoDeCultivo;
    private SecuenciaLaboreo unaSecuenciaLaboreo;

    public RegistroLaboreo(LocalDate fechaInicioLaboreo, LocalDate fechaFinLaboreo, ProyectoDeCultivo unProyectoDeCultivo, SecuenciaLaboreo unaSecuenciaLaboreo) {
        this.fechaInicioLaboreo = fechaInicioLaboreo;
        this.fechaFinLaboreo = fechaFinLaboreo;
        this.unProyectoDeCultivo = unProyectoDeCultivo;

        this.unaSecuenciaLaboreo = unaSecuenciaLaboreo;

    }

    public LocalDate getFechaInicioLaboreo() {
        return fechaInicioLaboreo;
    }

    public void setFechaInicioLaboreo(LocalDate fechaInicioLaboreo) {
        this.fechaInicioLaboreo = fechaInicioLaboreo;
    }

    public LocalDate getFechaFinLaboreo() {
        return fechaFinLaboreo;
    }

    public void setFechaFinLaboreo(LocalDate fechaFinLaboreo) {
        this.fechaFinLaboreo = fechaFinLaboreo;
    }

    public ProyectoDeCultivo getUnProyectoDeCultivo() {
        return unProyectoDeCultivo;
    }

    public void setUnProyectoDeCultivo(ProyectoDeCultivo unProyectoDeCultivo) {
        this.unProyectoDeCultivo = unProyectoDeCultivo;
    }

    public SecuenciaLaboreo getUnaSecuenciaLaboreo() {
        return unaSecuenciaLaboreo;
    }

    public void setUnaSecuenciaLaboreo(SecuenciaLaboreo unaSecuenciaLaboreo) {
        this.unaSecuenciaLaboreo = unaSecuenciaLaboreo;
    }

}
