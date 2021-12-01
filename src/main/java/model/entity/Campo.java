package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadia
 */
public class Campo {

    private String nombre;
    private String superficie;
    private Empresa unaEmpresa;
    private Provincia unaProvincia;
    private EstadoCampo estadoCampo;
    private List<Lote> lotes;

    public Campo() {
        this.lotes = new ArrayList<>();
    }

    public Campo(String nombre, String superficie, Empresa unaEmpresa, Provincia unaProvincia, EstadoCampo unEstadoCampo) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.unaEmpresa = unaEmpresa;
        this.unaProvincia = unaProvincia;
        this.estadoCampo = unEstadoCampo;
        this.lotes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public Empresa getUnaEmpresa() {
        return unaEmpresa;
    }

    public void setUnaEmpresa(Empresa unaEmpresa) {
        this.unaEmpresa = unaEmpresa;
    }

    public Provincia getUnaProvincia() {
        return unaProvincia;
    }

    public void setUnaProvincia(Provincia unaProvincia) {
        this.unaProvincia = unaProvincia;
    }

    public EstadoCampo getEstadoCampo() {
        return estadoCampo;
    }

    public void setEstadoCampo(EstadoCampo unEstadoCampo) {
        this.estadoCampo = unEstadoCampo;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

  



}
