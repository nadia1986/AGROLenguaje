/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        return repository.findAll();
    }
    
    //QUE CAMBIOS HAY QUE HACER EN EL METODO???
    
   // public Lote modificarEstado(String IdLote , EstadoLote estadoLote){
        //return repository.cargarLotes();
        
   // }
    
    
    
}
