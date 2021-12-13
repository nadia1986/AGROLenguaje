/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.entity.ProyectoDeCultivo;
import model.service.ProyectoDeCultivoService;

/**
 *
 * @author nadia
 */
public class ProyectoController {
    private ProyectoDeCultivoService serviProyecto;
    private ProyectoDeCultivo proyectoDeCultivos;

    public ProyectoController() {
        this.serviProyecto = new ProyectoDeCultivoService();
    }

    
    public ProyectoDeCultivo buscar(int numeroProyectoB) {
        
        if (serviProyecto.buscarProyecto(numeroProyectoB) != null) {            
            return    serviProyecto.buscarProyecto(numeroProyectoB);       
        } else {
            return null;
        }
        

    
}
}