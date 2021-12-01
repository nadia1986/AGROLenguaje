package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadia
 */
public class TipoDeSuelo {

    private int tipoDeSuelo;
    private String descripcion;
    private List<Cultivo> cultivos;

    public TipoDeSuelo() {
        this.cultivos = new ArrayList<>();
    }

    public TipoDeSuelo(int tipoDeSuelo, String descripcion) {
        this.tipoDeSuelo = tipoDeSuelo;
        this.descripcion = descripcion;

        this.cultivos = new ArrayList<>();
    }

    public int getTipoDeSuelo() {
        return tipoDeSuelo;
    }

    public void setTipoDeSuelo(int tipoDeSuelo) {
        this.tipoDeSuelo = tipoDeSuelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

}
