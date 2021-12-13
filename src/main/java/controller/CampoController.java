/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.entity.Campo;
import model.service.CampoService;

/**
 *
 * @author nadia
 */
public class CampoController {
    private CampoService serviCampo;
    private Campo campos;

    public CampoController() {
        serviCampo = new CampoService();

    }

    public Campo  buscar(String nombreB) {
        
        if (serviCampo.buscarCampo(nombreB) != null) {            
            return    serviCampo.buscarCampo(nombreB);       
        } else {
            return null;
        }
        
    }

    //public List<Lote> listarLotes() {
       // return serviCampo.;
        
   // }

    
}
