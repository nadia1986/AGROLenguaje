
package model.service;

import java.util.List;
import model.entity.EstadoDelProyecto;
import model.entity.ProyectoDeCultivo;
import model.repository.ProyectoDeCultivoRepository;

/**
 *
 * @author nadia
 */
public class ProyectoDeCultivoService {
    private ProyectoDeCultivoRepository repositorio;

    public ProyectoDeCultivoService() {
        this.repositorio = new ProyectoDeCultivoRepository();
    }

   
    
    public ProyectoDeCultivo buscarProyecto( int numeroProyecto){
        return repositorio.buscarPorNumeroProyecto(numeroProyecto);
        
    }
    
     public List<ProyectoDeCultivo> Listar (){
        return repositorio.mostrarProyectos();
    }
   // public ProyectoDeCultivo editarEstado(int numeroProyecto, EstadoDelProyecto estadoDelProyecto){
       // return repositorio.modificarEstadoProyecto(numeroProyecto, estadoDelProyecto);// ??? agrego un soutp en repository para que deje de ser void el método???
   // }
    
}
