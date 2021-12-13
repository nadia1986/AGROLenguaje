
package model.service;

import java.util.*;
import model.entity.EstadoLote;

import model.entity.Lote;
import model.repository.LoteRepository;

/**
 *
 * @author nadia
 */
public class LoteService {
         private LoteRepository repository;

    public LoteService() {
        this.repository = new LoteRepository();
    }

   
    public Lote buscar(String IdLote){
        return repository.buscarPorIdLote(IdLote);
    }
    
    public List<Lote> Listar (){
        return repository.listar();
    }
    
    //QUE CAMBIOS HAY QUE HACER EN EL METODO???
    
   // public Lote modificarEstado(String IdLote , EstadoLote estadoLote){
       // return repository.modificarEstadoLote(IdLote, estadoLote);
        
    //}
    
    
    
}
