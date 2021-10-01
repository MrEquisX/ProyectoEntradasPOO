/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta_entradas;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Pais {
    private int id;
    private String name;
    private ArrayList<Region> regions = new ArrayList<Region>();
    private ArrayList<Eventos> eventos = new ArrayList<Eventos>();


    
//Contructor
    public Pais(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
//Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public int getCantRegions() {return regions.size();}

    public int getUltimaId(){
        if (regions != null) return regions.get(regions.size() - 1).getId();
        return 0;
    }
    
    public int getCantEventos(){return eventos.size();}
    
    public int getUltimaID_Eventos() {
        if (eventos != null) return eventos.get(eventos.size()-1).getIdEventos();
        return 0;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public ArrayList<Eventos> getEventos() {
        return eventos;
    }
    
//Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public void setEventos(ArrayList<Eventos> eventos) {
        this.eventos = eventos;
    }
    
    

//METODOS REGIONES-----------------------------------------------------------------

    //Revisa si existe una region a traves de su id
    public boolean existeRegion(int id){
        for (Region region : this.regions) if (id == region.getId()) return true;
        return false;
    }

    //Revisa si existe una region a traves de su nombre
    public boolean existeRegion(String nombre) {
        for (Region region : this.regions) if (nombre.equalsIgnoreCase(region.getName())) return true;
        return false;
    }

    //Retorna informacion de
    public String[] getInfoRegion(int id) {
        String [] data = new String[2];

        for (Region region : this.regions) {
            if (id == region.getId()) {
                data = region.getData();
            }
        }
        return data;
    }

    public ArrayList<String[]> getInfoRegiones() {
        ArrayList<String []> data = new ArrayList<String[]>();

        for (Region region : this.regions) {
            data.add(region.getData());
        }
        return data;
    }

    //Agrega una region
    public void addRegion(Region region) {regions.add(region);}

    //Edita una region
    public void editRegion(int id, String nombre) {
        for (Region region : regions) {
            if (region.getId() == id)
                region.setName(nombre);
        }
    }

    //Elimina una region
    public void removeRegion(int idRegion) {
        for (Region region : regions) {
            if (region.getId() == idRegion) {
                regions.remove(region);
                return;
            }
        }
    }
    //METODOS EVENTOS-----------------------------------------------------------------------
    
    //Revisa si existe un evento segun su id
    public boolean existeEvento(int id) {
        for (Eventos eventos : this.eventos) if (id == eventos.getIdEventos()) return true;
        return false;
    }

    //Revisa si existe un evento segun su nombre
    public boolean existeEvento(String nombre) {
        for (Eventos eventos : this.eventos) if (nombre.equalsIgnoreCase(eventos.getName())) return true;
        return false;
    }
    
        //Retorna informacion de un evento segun su id
    public String[] getInfoEventos(int id) {
        String[] data = new String[3];

        for (Eventos eventos : this.eventos) {
            if (id == eventos.getIdEventos()) {
                data = eventos.getData();
            }
        }
        return data;
    }

    //Retorna informacion de un evento segun su nombre
    public String[] getInfoEventos(String nombre,String fecha) {
        String[] data = null;

        for (Eventos eventos : this.eventos){
            if (nombre.equalsIgnoreCase(eventos.getName())){
                data = eventos.getData();
            }
        }
        return data;
    }
    
    //Retorna informacion de un evento segun su fecha
    public String[] getInfoEventos(String fecha){
        String[] data = null;
        
        for(Eventos eventos : this.eventos){
            if(fecha.equalsIgnoreCase(eventos.getFecha_Evento())){
                data = eventos.getData();
            }
        }
        return data;
    }

    //Retorna informacion de todos los eventos
    public ArrayList<String[]> getInfoEventos() {
        ArrayList<String[]> data = new ArrayList<String[]>();

        for (Eventos eventos : this.eventos) {
            data.add(eventos.getData());
        }
        return data;
    }
    
    //Agrega un evento
    public void addEventos(Eventos evento) {eventos.add(evento);}

    //Edita un evento
    public void editEventos(int id, String nombreEvento) {
        for (Eventos evento : eventos) {
            if (evento.getIdEventos() == id)
                evento.setName(nombreEvento);           
        }
    }

    //Elimina un evento
    public void removeEventos(int idEvento) {
        for (Eventos evento : eventos) {
            if (evento.getIdEventos() == idEvento) {
                eventos.remove(evento);
                return;
            }
        }
    }

    
    
    //Base de Datos-------------------------------------------------------------------------
    public void cargarRegiones() throws Exception {
        Region nueva;
        CSVReader csvReader = new CSVReaderBuilder(new FileReader("src/venta_entradas/Database/Region.csv")).withSkipLines(1).build(); //Se salta los headers

        List<String[]> data = csvReader.readAll();

        for (String[] linea : data) {
            if (Integer.parseInt(linea[2]) == this.id) {
                nueva = new Region(parseInt(linea[0]), linea[1]);
                this.regions.add(nueva);
            }
        }
    }
        public void cargarEventos() throws Exception {
        Eventos nuevo;
        CSVReader csvReader = new CSVReaderBuilder(new FileReader("src/venta_entradas/Database/Eventos.csv")).withSkipLines(1).build(); 
        
        List<String[]> data = csvReader.readAll();
        
        for (String[] linea : data) {
                nuevo = new Eventos(parseInt(linea[0]), linea[1], linea [2]);
                this.eventos.add(nuevo);  
        }
    }
        
    public void actualizarBd() throws Exception {
            

    //----------CSVPais---------------------------------------------
        CSVWriter writerPais = new CSVWriter(new FileWriter("src/venta_entradas/Database/Pais.csv"));
        try {
            //Crea la lista de strings que guardara en un CSV
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"id", "nombre"});
            data.add(new String[] {Integer.toString(this.id), this.name});

            writerPais.writeAll(data);
            writerPais.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    //----------CSVRegion-------------------------------------------
        CSVWriter writerRegion = new CSVWriter(new FileWriter("src/venta_entradas/Database/Region.csv"));
        try {
            //Crea la lista de strings que guardara en un CSV
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"id", "nombre" , "pais_id" });

            for (Region r: this.regions){
                data.add(new String[] { Integer.toString(r.getId()), r.getName(), Integer.toString(this.id) });
            }

            writerRegion.writeAll(data);
            writerRegion.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    //----------CSVEventos-------------------------------------------
        CSVWriter writerEvento = new CSVWriter(new FileWriter("src/venta_entradas/Database/Eventos.csv"));
        try{
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"id", "nombre", " fecha"});
            
            for(Eventos ev : this.eventos){
                data.add(new String[] { Integer.toString(ev.getIdEventos()), ev.getName(), ev.getFecha_Evento()});
            }
            
            writerEvento.writeAll(data);
            writerEvento.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
