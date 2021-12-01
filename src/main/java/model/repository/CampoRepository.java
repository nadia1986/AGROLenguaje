package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.entity.Campo;
import model.entity.Empresa;
import model.entity.EstadoCampo;
import model.entity.Provincia;

/**
 *
 * @author nadia
 */
public class CampoRepository {

    List<Campo> campos;

    public CampoRepository() {
        this.campos = new ArrayList();
        cargarCampos();
    }

    public void cargarCampos() {
        Empresa empresa = new Empresa("20157896531", "Agrochaco", "Ruta 12 km 17", "3764578906");
        Provincia provincia = new Provincia("Corrientes");
        Provincia provincia2 = new Provincia("Misiones");
        Provincia provincia3 = new Provincia("Santa Fé");

        Campo a1 = new Campo("La cachuera ", "800 ha ", empresa, provincia, null);
        Campo a2 = new Campo("Los Paraisos", "500 ha ", empresa, provincia2, null);
        Campo a3 = new Campo("Los Naranjitos", "1100ha", empresa, provincia3, null);

        campos.add(a1);
        campos.add(a2);
        campos.add(a3);

        
    }
     
    public List<Campo> findAllCampo(){
        return campos;
    }
    
    public void crearCampo(Campo campo){
        this.campos.add(campo);
    }
    
    public void eliminarCampo(Campo campo){
        this.campos.remove(campo);
    }
    
    public void modificarEstadoCampo( String nombre, EstadoCampo estadoCampo){
        
        Campo  campoEncontrado= buscarPorNombre (nombre);
        if (campoEncontrado != null){
            campoEncontrado.setEstadoCampo(estadoCampo);
            
        }
        
    }
    
    public Campo buscarPorNombre(String nombre){
        Campo campoEncontrado= null;
        
        for (Campo campo  : this.campos) {
            if (nombre.equals(campo.getNombre())){
                campoEncontrado= campo;
            }
            
        }
        
        return campoEncontrado;
    }

}
