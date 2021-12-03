
package model.service;

import java.util.ArrayList;
import java.util.List;
import model.entity.Campo;
import model.repository.CampoRepository;

/**
 *
 * @author nadia
 */
public class CampoService {
        private CampoRepository repositorio;

    public CampoService() {
        this.repositorio = new CampoRepository();
    }

   public Campo buscarCampo(String nombre){
       return repositorio.buscarPorNombre(nombre);
   }
   
    public List<Campo> Listar (){
        return repositorio.findAllCampo();
    }
}
