package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadia
 */
public class SecuenciaLaboreo {

    private String secuencia;
    private String descripcion;
    private List< Laboreo> laboreos;
    private Cultivo unCultivo;

    public SecuenciaLaboreo() {
        this.laboreos = new ArrayList<>();
    }

    public SecuenciaLaboreo(String secuencia, Cultivo unCultivo, String descripcion) {
        this.secuencia = secuencia;
        this.descripcion = descripcion;
        this.unCultivo = unCultivo;
        this.laboreos = new ArrayList<>();
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public List<Laboreo> getLaboreos() {
        return laboreos;
    }

    public void setLaboreos(List<Laboreo> laboreos) {
        this.laboreos = laboreos;
    }

    public Cultivo getUnCultivo() {
        return unCultivo;
    }

    public void setUnCultivo(Cultivo unCultivo) {
        this.unCultivo = unCultivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
