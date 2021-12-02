package model.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nadia
 */
public class ProyectoDeCultivo {
    
    private int numeroProyecto;
    private String fechaInicio;
    private String fechaFin;
    private EstadoDelProyecto estadoDelProyecto;
    private List<RegistroLaboreo> registrosLaboreos;
    private Lote lote;

    public ProyectoDeCultivo() {
        this.registrosLaboreos = new ArrayList<>();
    }

    public ProyectoDeCultivo(int  numeroProyecto, String fechaInicio, String fechaFin, EstadoDelProyecto estadoDelProyecto, Lote lote) {
        this.fechaFin = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoDelProyecto = estadoDelProyecto;
        this.lote = lote;
        this.numeroProyecto= numeroProyecto;
        this.registrosLaboreos = new ArrayList<>();

    }

    public String  getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio( String  fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getNumeroProyecto() {
        return numeroProyecto;
    }

    public void setNumeroProyecto(int numeroProyecto) {
        this.numeroProyecto = numeroProyecto;
    }
    
    

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String  fechaFin) {
        this.fechaFin = fechaFin;
    }

    public EstadoDelProyecto getEstadoDelProyecto() {
        return estadoDelProyecto;
    }

    public void setEstadoDelProyecto(EstadoDelProyecto estadoDelProyecto) {
        this.estadoDelProyecto = estadoDelProyecto;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public List<RegistroLaboreo> getRegistrosLaboreos() {
        return registrosLaboreos;
    }

    public void setRegistrosLaboreos(List<RegistroLaboreo> registrosLaboreos) {
        this.registrosLaboreos = registrosLaboreos;
    }

 

}
