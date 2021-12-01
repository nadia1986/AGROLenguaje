
package model.entity;

/**
 *
 * @author nadia
 */
public class EstadoLote {
      private String descripcion;
    
    public EstadoLote(String descripcion){
        this.descripcion= descripcion;
        
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
