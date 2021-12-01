package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadia
 */
public class Cultivo {

    private String descripcion;
    private TipoDeSuelo tipoDeSuelo;
    private List<SecuenciaLaboreo> secuenciaLaboreos;

    public Cultivo() {
        this.secuenciaLaboreos = new ArrayList<>();
    }

    public Cultivo(String descripcion, TipoDeSuelo tipoDeSuelo) {
        this.descripcion = descripcion;
        this.tipoDeSuelo = tipoDeSuelo;
        this.secuenciaLaboreos = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoDeSuelo getTipoDeSuelo() {
        return tipoDeSuelo;
    }

    public void setTipoDeSuelo(TipoDeSuelo unTipoDeSuelo) {
        this.tipoDeSuelo = unTipoDeSuelo;
    }

    public List<SecuenciaLaboreo> getSecuenciaLaboreos() {
        return secuenciaLaboreos;
    }

    public void setSecuenciaLaboreos(List<SecuenciaLaboreo> secuenciaLaboreos) {
        this.secuenciaLaboreos = secuenciaLaboreos;
    }

}
