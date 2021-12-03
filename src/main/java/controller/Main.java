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
        //List<Campo> campoEncontrados = service.buscarcampoPorNombre("La cachuera ");
        LoteController loteController = new LoteController();
        CampoController campoController = new CampoController();
        ProyectoController proyectoController = new ProyectoController();

        int opcion = -1;
        int numero = -1;
        int numero1 = -1;
        int numero3 = -1;
        Scanner scanner = new Scanner(System.in);

        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Administrar Campo\n"
                    + "2. Administar Lote\n"
                    + "3. Administar Proyecto de cultivo\n"
                    + "0. Salir\n");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {

                case 1:
                    System.out.println("Elige una opcion: \n"
                            + "1. Buscar Campo\n"
                            + "2. Listar Campos\n"
                            + "3. Agregar Campo\n"
                            + "4. Eliminar Campo\n"
                            + "5. Modificar Estado Campo\n"
                            + "0. Salir\n");
                    numero = Integer.parseInt(scanner.nextLine());

                    switch (numero) {
                        case 1:// BUSCA PERO IMPRIME NO ENCONTRADO
                            System.out.println("Ingrese nombre de Campo a buscar");
                            var buscarCampo = scanner.nextLine();
                            campoController.buscar(buscarCampo);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            System.out.println("Saludos!");

                            break;
                        default:
                            System.out.println("Opcion no reconocida");
                            break;

                    }
                    //System.out.println("Ingreso a adminitracion CAMPO");

                    break;

                case 2:
                    System.out.println("Elige una opcion: \n"
                            + "1. Buscar Lote\n"
                            + "2. Listar Lotess\n"
                            + "3. Agregar Lote\n"
                            + "4. Eliminar Lote\n"
                            + "5. Modificar Estado Lote\n"
                            + "0. Salir\n");
                    numero1 = Integer.parseInt(scanner.nextLine());

                    switch (numero1) {
                        case 1:
                            System.out.println("Ingrese idLote de lote a buscar");
                            var buscarLote = scanner.nextLine();
                            loteController.buscar(buscarLote);
                            
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            System.out.println("Saludos!");

                            break;
                        default:
                            System.out.println("Opcion no reconocida");
                            break;

                    }
                    //System.out.println("Ingreso a 
                    //System.out.println("Ingrese idLote a buscar");
                    // var buscarLote = scanner.nextLine();
                    //loteController.buscar(buscarLote);
                    //loteController.listarLotes(); //????? no aparece la lista de lotes!!!!!
                    break;
                case 3:
                    System.out.println("Ingrese Numero de Proyecto de cultivo");
                    numero3 = Integer.parseInt(scanner.nextLine());

                    proyectoController.buscar(numero3);
                    break;
                case 0:
                    System.out.println("Saludos!");
                    // loteController.listarTodosLosLotes();
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
        //System.out.println(campoEncontrado.getLotes()); NO APARECE LISTA DE LOTES QUE TIENE EL CAMPO
        //}
        // for ( Lote lotesEncontrado: lotesEncontrados){
        // System.out.println(loteEncontrado.getCampo());
        // System.out.println(lotesEncontrado.getTipoDeSuelo());
        // System.out.println(lotesEncontrado.getProyectosDeCultivos());
        //  System.out.println(loteEncontrado.getIdLote());
        // }
    }

}
