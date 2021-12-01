
package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.entity.Cultivo;
import model.entity.SecuenciaLaboreo;

/**
 *
 * @author nadia
 */
public class SecuenciaLaboreoRepository {
    
     private List<SecuenciaLaboreo> secuenciaLaboreos;

    public SecuenciaLaboreoRepository() {
        this.secuenciaLaboreos = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos(){
        
        Cultivo c1= new Cultivo( "maiz" ,null);
        Cultivo c2= new Cultivo( "Soja" ,null);
        
        
        SecuenciaLaboreo  s1 = new SecuenciaLaboreo();
        s1.setDescripcion("Fumigar,desmalezar, rastrillar");
        s1.setSecuencia("0,1,2");
        s1.setUnCultivo(c1);

        SecuenciaLaboreo  s2 = new SecuenciaLaboreo();
        s1.setDescripcion("desmalezar, arar");
        s1.setSecuencia("1,3");
        s1.setUnCultivo(c2);

       

        this.secuenciaLaboreos.add(s1);
        this.secuenciaLaboreos.add(s2);
       

    }
    
  
   
    
    
}
