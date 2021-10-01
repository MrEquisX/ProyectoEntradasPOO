/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta_entradas;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ignac
 */
public class Main {

    public static void main(String[] args) throws IOException, Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int option;
        int id;
        boolean exito = false;
       
        //Instanciar CSVWriter
        CSVWriter writer = new CSVWriter(new FileWriter("D://output.csv", true)); //Append escribe en una nueva linea == agregar

        CSVReader csvReader = new CSVReaderBuilder(new FileReader("src/venta_entradas/Database/Pais.csv")).withSkipLines(1).build(); //Se salta los headers
        CSVReader csvReader1 = new CSVReader(new FileReader("src/venta_entradas/Database/Region.csv")); //No se salta los headers
        CSVReader csvReader2 = new CSVReader(new FileReader("src/venta_entradas/Database/Eventos.csv"));
        List<String[]> data = csvReader.readAll();

        Pais chile = new Pais(Integer.parseInt(data.get(0)[0]), data.get(0)[1]);
        chile.cargarRegiones();
        
        chile.cargarEventos();
       
       do {
            System.out.println("------------------------- Menu TICKET.FULL% " + chile.getName() + " -------------------------");
            System.out.println("1. Ver menu de regiones CHILE");
            System.out.println("2. Ver menu de eventos ");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("Ingrese una opcion: ");
            
            switch (option = Integer.parseInt(reader.readLine())) {
                case 1:
                        List<String[]> datos = chile.getInfoRegiones();

                        System.out.println("------------------------- REGIONES -------------------------");
                        for (String[] d : datos) System.out.println("id: " + d[0] + ", nombre: " + d[1]);
                        System.out.println();
                        System.out.println("1. Mostrar region");
                        System.out.println("2. Editar region");
                        System.out.println("3. Eliminar region");
                        System.out.println("4. Agregar region");
                        System.out.println("5. Volver");
                        System.out.print("Ingrese una opcion: ");

                        switch (Integer.parseInt(reader.readLine())) {
                            case 1:
                                String[] dRegion;
                                exito = false;
                                do {
                                    System.out.print("Ingrese la id de la region a mostrar: ");
                                    id = Integer.parseInt(reader.readLine());
                                    dRegion = chile.getInfoRegion(id);

                                    if (dRegion[0] != null) {
                                        System.out.println("id: " + dRegion[0] + ", nombre: " + dRegion[1]);
                                        exito = true;
                                    }

                                    if (!exito) System.out.println("Region seleccionada no existe");
                                } while (!exito);
                                break;

                            case 2:
                                do {
                                    System.out.print("Ingrese la id de la region que desea editar: ");
                                    if (exito = chile.existeRegion(id = Integer.parseInt(reader.readLine()))) {
                                        System.out.print("Ingrese el nuevo nombre: ");
                                        chile.editRegion(id, reader.readLine());

                                        System.out.println("Region editada con exito");
                                    } else System.out.println("Region seleccionada no existe");
                                } while (!exito);
                                break;

                            case 3:
                                do {
                                    System.out.print("Ingrese la id de la region que desea eliminar: ");
                                    if (exito = chile.existeRegion(id = Integer.parseInt(reader.readLine()))) {
                                        chile.removeRegion(id);
                                        System.out.println("Region eliminada con exito");
                                    } else System.out.println("Region seleccionada no existe");
                                } while (!exito);
                                break;

                            case 4:
                                System.out.print("Ingrese el nombre de la nueva region: ");
                                Region nueva = new Region(chile.getUltimaId() + 1, reader.readLine());
                                if (chile.existeRegion(nueva.getName())) {
                                    System.out.println("Esta region se encuntra en nuestro registro");
                                } else {
                                    chile.addRegion(nueva);
                                    System.out.println("Region agregada con exito");
                                }

                                break;
                            case 5:
                                break;

                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;

                        }
                        break;
                case 2:
                        List<String[]> datosEvento = chile.getInfoEventos();
                    
                        System.out.println("------------------------- EVENTOS -------------------------");
                        for (String[] d : datosEvento) System.out.println("id: " + d[0] + ", nombre: " + d[1] + ", fecha: " + d[2]);
                        System.out.println();
                        System.out.println("1. Mostrar evento");
                        System.out.println("2. Editar evento");
                        System.out.println("3. Eliminar evento");
                        System.out.println("4. Agregar evento");
                        System.out.println("5. Volver");
                        System.out.print("Ingrese una opcion: ");

                        switch (Integer.parseInt(reader.readLine())) {
                            case 1:
                                String[] dEvento;
                                exito = false;
                                do {
                                    System.out.print("Ingrese la id del evento a mostrar: ");
                                    id = Integer.parseInt(reader.readLine());
                                    dEvento = chile.getInfoEventos(id);

                                    if (dEvento[0] != null) {
                                        System.out.println("id: " + dEvento[0] + ", nombre: " + dEvento[1] + ", fecha: " + dEvento[2]);
                                        exito = true;
                                    }

                                    if (!exito) System.out.println("Evento seleccionado no existe");
                                } while (!exito);
                                break;

                            case 2:
                                do {
                                    System.out.print("Ingrese la id del evento que desea editar: ");
                                    if (exito = chile.existeEvento(id = Integer.parseInt(reader.readLine()))) {
                                        System.out.print("Ingrese el nuevo nombre: ");
                                        chile.editEventos(id, reader.readLine());

                                        System.out.println("Evento editado con exito");
                                    } else System.out.println("Evento seleccionado no existe");
                                } while (!exito);
                                break;

                            case 3:
                                do {
                                    System.out.print("Ingrese la id del evento que desea eliminar: ");
                                    if (exito = chile.existeEvento(id = Integer.parseInt(reader.readLine()))) {
                                        chile.removeEventos(id);
                                        System.out.println("Evento eliminado con exito");
                                    } else System.out.println("Evento seleccionado no existe");
                                } while (!exito);
                                break;

                            case 4:
                                System.out.print("Ingrese el nombre del nuevo evento: ");
                                String nombre = reader.readLine();
                                System.out.print("Ingrese la fecha del nuevo evento: ");
                                String fecha = reader.readLine();
                                Eventos nuevo = new Eventos(chile.getUltimaID_Eventos() + 1, nombre, fecha);
                                if (chile.existeEvento(nuevo.getName())) {
                                    System.out.println("Este evento se encuentra en nuestro registro");
                                } else {
                                    chile.addEventos(nuevo);
                                    System.out.println("Evento agregada con exito");
                                }
                                break;
                            case 5:
                                break;

                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;

                        }
                break;
                
            }  
        } while (option != 5);   
    }
}
    