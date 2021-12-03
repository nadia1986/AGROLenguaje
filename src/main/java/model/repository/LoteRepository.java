/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.entity.Campo;
import model.entity.EstadoLote;
import model.entity.Lote;
import model.entity.TipoDeSuelo;

/**
 *
 * @author nadia
 */
public class LoteRepository {

    List<Lote> lotes;

    public LoteRepository() {
        this.lotes = new ArrayList<>();
        cargarLotes();
    }

    public void cargarLotes() {
        CampoRepository campo = new CampoRepository();
        TipoDeSuelo tipoDeSuelo1 = new TipoDeSuelo(1, "apto para maiz");
        TipoDeSuelo tipoDeSuelo2= new TipoDeSuelo(2, "apto para soja");
        TipoDeSuelo tipoDeSuelo3= new TipoDeSuelo(3, "apto para girasol");
        EstadoLote estadoLoteOcupado = new EstadoLote("Ocupado");
        EstadoLote estadoLoteDisponible = new EstadoLote(" Disponible");

        Lote norte1 = new Lote("C-001", "150 ha", tipoDeSuelo1, campo.campos.get(1), estadoLoteDisponible);
        Lote norte2 = new Lote("C-002", "250 ha ", tipoDeSuelo2, campo.campos.get(1), estadoLoteDisponible);
        Lote norte3 = new Lote("C-003", "300 ha", tipoDeSuelo1, campo.campos.get(1), estadoLoteOcupado);

       this.lotes.add(norte1);
        this.lotes.add(norte2);
        this.lotes.add(norte3);

    }
    
    public List<Lote> findAll(){
        return lotes;
    }
    
    public void crearLote(Lote lote){
        this.lotes.add(lote);
    }
    
    public void eliminarLote(Lote lote){
        this.lotes.remove(lote);
    }
    
    public void modificarEstadoLote( String idLote, EstadoLote estadoLote){
        
        Lote  loteEncontrado= buscarPorIdLote (idLote);
        if (loteEncontrado != null){
            loteEncontrado.setEstadoLote(estadoLote);
            
        }
        
    }
    
    public Lote buscarPorIdLote(String idLote){
        Lote loteEncontrado= null;
        
        for (Lote loteR : this.lotes) {
            if (idLote.equals(loteR.getIdLote())){
                loteEncontrado= loteR;
            }
            
        }
        
        return loteEncontrado;
    }

}
