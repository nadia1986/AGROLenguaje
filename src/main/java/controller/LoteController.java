package controller;

import java.util.List;
import model.entity.Lote;
import model.service.LoteService;

/**
 *
 * @author nadia
 */
public class LoteController {

    private LoteService servicioLote;
    private Lote lotes;

    public LoteController() {
        servicioLote = new LoteService();

    }

    public boolean buscar(String idLote) {
        boolean estado = false;
        if (servicioLote.buscar(idLote) != null) {
            System.out.println("Lote encontrado");
        } else {
            System.out.println("error");
        }
        return estado;
    }

    public List<Lote> listarLotes() {
        return servicioLote.Listar();
        
    }

}
