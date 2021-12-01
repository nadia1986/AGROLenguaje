
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
        private CampoRepository repository;

    public CampoService() {
        this.repository = new CampoRepository();
    }

    public List<Campo> buscarcampoPorNombre(String nombre){
        List<Campo> camposEncontrados = new ArrayList<>();

        for (Campo campoR : repository.findAllCampo()) {
            if (campoR.getNombre().contains(nombre)) {
                camposEncontrados.add(campoR);
            }
        }
        return camposEncontrados;
    }
}
