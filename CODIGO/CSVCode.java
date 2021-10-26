/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGO;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ignac
 */
public class CSVCode {
    private int id;
    private String name;
    private ArrayList<Region> regiones = new ArrayList<Region>();
    private ArrayList<Eventos> eventos = new ArrayList<Eventos>();

    public CSVCode(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
//Getters&Setters    
    public ArrayList<Region> getRegiones() {
        return regiones;
    }

    public void setRegiones(ArrayList<Region> regiones) {
        this.regiones = regiones;
    }

    public ArrayList<Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Eventos> eventos) {
        this.eventos = eventos;
    }
    
    
//Metodos

        
//METODOS REGIONES
//retorna informacion de
    public String[] getInfoRegion(String id) {
        String [] data = new String[2];

        for (Region region : this.regiones) {
            if (id == region.getId()) {
                data = region.getData();
            }
        }
        return data;
    }
    
        public ArrayList<String[]> getInfoRegiones() {
        ArrayList<String []> data = new ArrayList<String[]>();

        for (Region region : this.regiones) {
            data.add(region.getData());
        }
        return data;
    }
        
//METODOS EVENTOS
        
     //Retorna informacion de todos los eventos
    public ArrayList<String[]> getInfoEventos() {
        ArrayList<String[]> data = new ArrayList<String[]>();

        for (Eventos eventos : this.eventos) {
            data.add(eventos.getData());
        }
        return data;
    }    
        
 
//CSV BDD
    public static ArrayList <Region> cargarRegiones() throws Exception {
        Region nuevo;
        ArrayList<Region> lista = new ArrayList();
        CSVReader csvReader = new CSVReaderBuilder(new FileReader("src/Database/Region.csv")).withSkipLines(1).build();

        List<String[]> data = csvReader.readAll();

        for (String[] linea : data) {
            nuevo = new Region(linea[0], linea[1]);
            lista.add(nuevo);
        }
        return lista;
    }
    
    public static ArrayList <Eventos> cargarEventos() throws Exception {
        Eventos nuevo;
        ArrayList<Eventos> lista = new ArrayList();
        CSVReader csvReader = new CSVReaderBuilder(new FileReader("src/Database/Eventos.csv")).withSkipLines(1).build();
        
        List<String[]> data = csvReader.readAll();
        
        for (String [] linea : data){
            nuevo = new Eventos(parseInt(linea[0]), linea[1], linea[2], linea[3]);
            lista.add(nuevo);
        }
        return lista;
    }
    
    public void actualizarBd() throws Exception {
        
    //----------CSVRegion-------------------------------------------
        CSVWriter writerRegion = new CSVWriter(new FileWriter("src/Database/Region.csv"));
        try {
            //Crea la lista de strings que guardara en un CSV
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"id", "nombre" });

            for (Region r: this.regiones){
                data.add(new String[] { r.getId(), r.getNombre()});
            }

            writerRegion.writeAll(data);
            writerRegion.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    //----------CSVEvento-------------------------------------------
        CSVWriter writerEvento = new CSVWriter(new FileWriter("src/Database/Eventos.csv"));
        try {
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"id", "nombre", "fecha","idRegion"});
            
            for (Eventos ev : this.eventos){
                data.add(new String[] {Integer.toString(ev.getIdEventos()), ev.getName(), ev.getFecha_Evento(),ev.getIdRegion()});
            }
            
            writerEvento.writeAll(data);
            writerEvento.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }    
}
