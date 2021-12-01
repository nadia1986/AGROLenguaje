/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.service.LoteService;

/**
 *
 * @author nadia
 */
public class LoteController {
      private LoteService servicioLote;

    public LoteController() {
        servicioLote = new LoteService();
    }

    public boolean buscar(String idLote){
        boolean estado = false;
        if (servicioLote.buscar(idLote)!= null){
            System.out.println("Lote encontrado");
        }else{
            System.out.println("error");
        }
        return estado;
    }
}
