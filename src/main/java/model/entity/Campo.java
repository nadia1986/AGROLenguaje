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
    private Empresa empresa;
    private Provincia provincia;
    private EstadoCampo estadoCampo;
    private List<Lote> lotes;

    public Campo() {
        this.lotes = new ArrayList<>();
    }

    public Campo(String nombre, String superficie, Empresa empresa, Provincia provincia, EstadoCampo estadoCampo) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.empresa = empresa;
        this.provincia = provincia;
        this.estadoCampo = estadoCampo;
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
        return empresa;
    }

    public void setUnaEmpresa(Empresa unaEmpresa) {
        this.empresa = unaEmpresa;
    }

    public Provincia getUnaProvincia() {
        return provincia;
    }

    public void setUnaProvincia(Provincia unaProvincia) {
        this.provincia = unaProvincia;
    }

    public EstadoCampo getEstadoCampo() {
        return estadoCampo;
    }

    public void setEstadoCampo(EstadoCampo estadoCampo) {
        this.estadoCampo = estadoCampo;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

  



}
