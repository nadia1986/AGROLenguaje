
package model.entity;

/**
 *
 * @author nadia
 */
public class Laboreo {
       private String descripcion;
       private SecuenciaLaboreo secuenciaLaboreo;

    public Laboreo() {
    }

    public Laboreo(String descripcion) {
        this.descripcion = descripcion;
    }
       
       
      
    
    public Laboreo(String descripcion, SecuenciaLaboreo secuenciaLaboreo){
        this.descripcion= descripcion;
        this.secuenciaLaboreo= secuenciaLaboreo;
        
        
    }

    public SecuenciaLaboreo getSecuenciaLaboreo() {
        return secuenciaLaboreo;
    }

    public void setSecuenciaLaboreo(SecuenciaLaboreo secuenciaLaboreo) {
        this.secuenciaLaboreo = secuenciaLaboreo;
    }

  
    
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
