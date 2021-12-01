
package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.entity.Cultivo;
import model.entity.TipoDeSuelo;

/**
 *
 * @author nadia
 */
public class CultivoRepository {
    private List<Cultivo> cultivos;

    public CultivoRepository() {
        this.cultivos = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos(){
        
        TipoDeSuelo tipoDeSuelo1= new TipoDeSuelo( 1 , "apto para maiz");
        TipoDeSuelo tipoDeSuelo2= new TipoDeSuelo(2, "apto para soja");
        TipoDeSuelo tipoDeSuelo3= new TipoDeSuelo(3, "apto para Girasol");
        
        Cultivo  c1 = new Cultivo();
        c1.setDescripcion("Maiz");
        c1.setTipoDeSuelo(tipoDeSuelo1);

        Cultivo  c2 = new Cultivo();
        c2.setDescripcion("Soja");
        c2.setTipoDeSuelo(tipoDeSuelo2);
        
        Cultivo  c3 = new Cultivo();
        c3.setDescripcion("Girasol");
        c3.setTipoDeSuelo(tipoDeSuelo3);

       

        this.cultivos.add(c1);
        this.cultivos.add(c2);
        this.cultivos.add(c3);

    }
    
  
   
    
}
