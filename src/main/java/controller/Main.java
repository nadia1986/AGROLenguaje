/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import java.util.Scanner;
import model.entity.*;
import model.repository.*;
import model.service.*;

/**
 *
 * @author nadia
 */
public class Main {

    public static void main(String[] args) {
        LoteService serviceLote = new LoteService();
        CampoService service = new CampoService();
        LoteRepository repository = new LoteRepository();
        List<Campo> campoEncontrados = service.buscarcampoPorNombre("La cachuera ");
        LoteController loteController = new LoteController();

        var opcion = -1;
        var scanner = new Scanner(System.in);

        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Administrar Campo\n"
                    + "2. Administar Lote\n"
                    + "3. Administar Proyecto de cultivo\n"
                    + "0. Salir\n");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese nombre de Campo buscar");
                    var buscarCampo = scanner.nextLine();

                    break;

                case 2:
                    System.out.println("Ingrese idLote a buscar");
                    var buscarLote = scanner.nextLine();
                    loteController.buscar(buscarLote);
                    break;
                case 3:
                    System.out.println("Ingrese Numero de Proyecto de cultivo");
                    var buscarProyecto = scanner.nextLine();
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }

        }

        // loteController.buscar("C-001");
        //for (Campo campoEncontrado : campoEncontrados) {
        //System.out.println(campoEncontrado.getSuperficie());
        //System.out.println(campoEncontrado.getUnaProvincia());
        //System.out.println(campoEncontrado.getLotes());
        //}
        // for ( Lote lotesEncontrado: lotesEncontrados){
        // System.out.println(loteEncontrado.getCampo());
        // System.out.println(lotesEncontrado.getTipoDeSuelo());
        // System.out.println(lotesEncontrado.getProyectosDeCultivos());
        //  System.out.println(loteEncontrado.getIdLote());
        // }
    }

}
