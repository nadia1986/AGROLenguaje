package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.entity.Laboreo;

/**
 *
 * @author nadia
 */
public class LaboreoRepository {

    List<Laboreo> laboreos;

    public LaboreoRepository() {
        this.laboreos = new ArrayList<>();
        cargarLaboreos();
    }

    public void cargarLaboreos( ) {
        Laboreo laboreo0 = new Laboreo("Fumigar");
        Laboreo laboreo1 = new Laboreo("Desmalizar");
        Laboreo laboreo2 = new Laboreo("Rastrillar");
        Laboreo laboreo3 = new Laboreo("Arar");
        
        laboreos.add(laboreo0);
        laboreos.add(laboreo1);
        laboreos.add(laboreo2);
        laboreos.add(laboreo3);
          

    }

    

}
