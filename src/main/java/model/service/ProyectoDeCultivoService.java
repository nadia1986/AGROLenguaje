/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.service;

import model.entity.EstadoDelProyecto;
import model.entity.ProyectoDeCultivo;
import model.repository.ProyectoDeCultivoRepository;

/**
 *
 * @author nadia
 */
public class ProyectoDeCultivoService {
    private ProyectoDeCultivoRepository repositorio;

    public ProyectoDeCultivoService(ProyectoDeCultivoRepository repositorio) {
        this.repositorio = repositorio;
    }
    
    public ProyectoDeCultivo buscarProyecto( int numeroProyecto){
        return repositorio.buscarPorNumeroProyecto(numeroProyecto);
        
    }
    
   // public ProyectoDeCultivo editarEstado(int numeroProyecto, EstadoDelProyecto estadoDelProyecto){
       // return repositorio.modificarEstadoProyecto(numeroProyecto, estadoDelProyecto);// ??? agrego un soutp en repository para que deje de ser void el método???
   // }
    
}
