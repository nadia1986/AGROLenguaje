/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.service.ProyectoDeCultivoService;

/**
 *
 * @author nadia
 */
public class ProyectoController {
    private ProyectoDeCultivoService serviProyecto;

    public ProyectoController() {
        this.serviProyecto = new ProyectoDeCultivoService();
    }

    
    public boolean buscar(int  numeroProyecto) {
        boolean estado = false;
        if (serviProyecto.buscarProyecto(numeroProyecto) != null) {
            System.out.println("Proyecto encontrado");
        } else {
            System.out.println("Error al cargar numero proyecto");
        }
        return estado;
    }

    
}
