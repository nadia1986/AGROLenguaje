
package model.entity;

/**
 *
 * @author nadia
 */
public class EstadoDelProyecto {
     private String descripcion;
    
    
   
    public EstadoDelProyecto(String descripcion){
        this.descripcion= descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
