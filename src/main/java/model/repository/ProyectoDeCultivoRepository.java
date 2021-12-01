package model.repository;

import java.util.ArrayList;
import java.util.List;
import model.entity.EstadoDelProyecto;
import model.entity.Lote;

import model.entity.ProyectoDeCultivo;

/**
 *
 * @author nadia
 */
public class ProyectoDeCultivoRepository {

    List<ProyectoDeCultivo> proyectoDeCultivos;

    public ProyectoDeCultivoRepository() {
        this.proyectoDeCultivos = new ArrayList<>();
        cargarProyectoDeCultivos();
    }

    public void cargarProyectoDeCultivos() {
        LoteRepository lote = new LoteRepository();

        EstadoDelProyecto estadoProyecto1 = new EstadoDelProyecto("En preparacion");
        EstadoDelProyecto estadoProyecto2 = new EstadoDelProyecto("Siembra");
        EstadoDelProyecto estadoProyecto3 = new EstadoDelProyecto("Cosecha");
        EstadoDelProyecto estadoProyecto4 = new EstadoDelProyecto("Cancelado");

        ProyectoDeCultivo maiz = new ProyectoDeCultivo(1, "2021-04-23", "2021-12-20", estadoProyecto2, lote.lotes.get(1));
        ProyectoDeCultivo soja = new ProyectoDeCultivo(2, "2021-11-24", "2022-01-30", estadoProyecto1, lote.lotes.get(2));

        proyectoDeCultivos.add(maiz);
        proyectoDeCultivos.add(soja);

    }

    public List<ProyectoDeCultivo> findAll() {
        return proyectoDeCultivos;
    }

   
        
         

 

}
