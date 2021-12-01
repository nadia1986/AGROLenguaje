package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadia
 */
public class Lote {

    private String idLote;
    private String superficieLote;
    private TipoDeSuelo tipoDeSuelo;
    private List<ProyectoDeCultivo> proyectosDeCultivos;
    private Campo campo;
    private EstadoLote estadoLote;

    public Lote() {
        this.proyectosDeCultivos = new ArrayList<>();
    }

    public Lote(String idLote, String superficieLote, TipoDeSuelo tipoDeSuelo, Campo campo, EstadoLote estadoLote) {
        this.idLote = idLote;
        this.superficieLote = superficieLote;
        this.tipoDeSuelo = tipoDeSuelo;
        this.proyectosDeCultivos = new ArrayList<>();
        this.campo = campo;
        this.estadoLote = estadoLote;
    }

    public String getIdLote() {
        return idLote;
    }

    public void setIdLote(String idLote) {
        this.idLote = idLote;
    }

    public List<ProyectoDeCultivo> getProyectosDeCultivos() {
        return proyectosDeCultivos;
    }

    public void setProyectosDeCultivos(List<ProyectoDeCultivo> proyectosDeCultivos) {
        this.proyectosDeCultivos = proyectosDeCultivos;
    }

    public String getSuperficieLote() {
        return superficieLote;
    }

    public void setSuperficieLote(String superficieLote) {
        this.superficieLote = superficieLote;
    }

    public TipoDeSuelo getTipoDeSuelo() {
        return tipoDeSuelo;
    }

    public void setTipoDeSuelo(TipoDeSuelo tipoDeSuelo) {
        this.tipoDeSuelo = tipoDeSuelo;
    }

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    public EstadoLote getEstadoLote() {
        return estadoLote;
    }

    public void setEstadoLote(EstadoLote estadoLote) {
        this.estadoLote = estadoLote;
    }

}
