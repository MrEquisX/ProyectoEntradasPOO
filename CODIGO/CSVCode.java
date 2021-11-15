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
import java.util.HashMap;
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
    private ArrayList<Administrador> admin = new ArrayList<Administrador>();
    private HashMap <Integer, InformacionEvento> infoEvento = new HashMap <Integer, InformacionEvento>();

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

    public ArrayList<Administrador> getAdmin() {
        return admin;
    }

    public void setAdmin(ArrayList<Administrador> admin) {
        this.admin = admin;
    }

    public HashMap<Integer, InformacionEvento> getInfoEvento() {
        return infoEvento;
    }

    public void setInfoEvento(HashMap<Integer, InformacionEvento> infoEvento) {
        this.infoEvento = infoEvento;
    }
    
    
//METODOS ADMIN
    //Anade un admin
    public boolean newAdmin(String user, String pass) throws IOException, Exception{
        ArrayList<Administrador> listaAdmin = new ArrayList();
        listaAdmin = CSVCode.cargarAdmin();
        CSVWriter writerAdmin = new CSVWriter(new FileWriter("src/Database/Administrador.csv"));
        try {
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"user","pass"});
            
            for (Administrador a : listaAdmin){
                data.add(new String[] {a.getUser(), a.getPassword()});
            }
            
            data.add(new String[] {user , pass});
            
            writerAdmin.writeAll(data);
            writerAdmin.close();
            return true;
            
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //Edita un evento
    public void editAdmin(String user, String pass) throws IOException, Exception {
        ArrayList<Administrador> listaAdmin = new ArrayList();
        listaAdmin = CSVCode.cargarAdmin();
        CSVWriter writerAdmin = new CSVWriter(new FileWriter("src/Database/Administrador.csv"));
        try {
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"user","pass"});
            
            for (Administrador a : listaAdmin){
                if (a.getUser().equals(user)){
                   data.add(new String[] {user, pass});
                }else{
                   data.add(new String[] {a.getUser(), a.getPassword()});
                }
            }
                     
            writerAdmin.writeAll(data);
            writerAdmin.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    

        
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
    
    //Anade un Evento
    public int newEvento(String nombre, String fecha, String idRegion) throws IOException, Exception{
        ArrayList<Eventos> lista = new ArrayList();
        lista = CSVCode.cargarEventos();        
        CSVWriter writerEvento = new CSVWriter(new FileWriter("src/Database/Eventos.csv"));
        try {
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"id", "nombre", "fecha","idRegion"});
            
            //int contador = 1;
            int mayor=0;
            for (Eventos ev : lista){
                if (ev.getIdEventos()>mayor){
                    mayor=ev.getIdEventos();
                }   
                data.add(new String[] {Integer.toString(ev.getIdEventos()), ev.getName(), ev.getFecha_Evento(),ev.getIdRegion()});                                            
           }
            
            mayor++;
            data.add(new String[] {Integer.toString(mayor), nombre , fecha , idRegion});
            
            writerEvento.writeAll(data);
            writerEvento.close();
            return mayor;
            
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
       
    }
    
    //Edita un evento
    public void editEventos(int idEvento, String nombreEvento, String fecha) throws IOException, Exception {
        ArrayList<Eventos> listaEventos = new ArrayList();
        listaEventos = CSVCode.cargarEventos();        
        CSVWriter writerEvento = new CSVWriter(new FileWriter("src/Database/Eventos.csv"));
        try {
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"id", "nombre", "fecha","idRegion"});
            
            for (Eventos ev : listaEventos){
                if (ev.getIdEventos()== idEvento){
                   data.add(new String[] {Integer.toString(ev.getIdEventos()), nombreEvento, fecha, ev.getIdRegion()});
                }else{
                   data.add(new String[] {Integer.toString(ev.getIdEventos()), ev.getName(), ev.getFecha_Evento(),ev.getIdRegion()});
                }
            }
                     
            writerEvento.writeAll(data);
            writerEvento.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Elimina un evento
    public void removeEventos(int idEvento) throws Exception {
        ArrayList<Eventos> listaEventos = new ArrayList();
        listaEventos = CSVCode.cargarEventos();        
        CSVWriter writerEvento = new CSVWriter(new FileWriter("src/Database/Eventos.csv"));
        try {
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"id", "nombre", "fecha","idRegion"});
            
            for (Eventos ev : listaEventos){
                if (ev.getIdEventos()!= idEvento){
                   data.add(new String[] {Integer.toString(ev.getIdEventos()), ev.getName(), ev.getFecha_Evento(),ev.getIdRegion()});
                }
            }
                     
            writerEvento.writeAll(data);
            writerEvento.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
//OPERACIONES HASHMAP
    //Anade info+Evento
    public void addInfo(int key, InformacionEvento nuevo){
        this.infoEvento.put(this.infoEvento.size(), (InformacionEvento) nuevo);
    }
    
    //Modifica info+Evento
    public void modifInfo(int key, int cantidadEntradas, int precioEntradas, String lugar){
        InformacionEvento info = this.infoEvento.get(key);
        info.setCantidadEntradas(cantidadEntradas);
        info.setPrecioEntradas(precioEntradas);
        info.setLugarEvento(lugar);
    }
    
    //Remueve info+Evento
    public void removeInfo(int key){
        this.infoEvento.remove(key);
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
   
    public static ArrayList <Administrador> cargarAdmin() throws Exception{
        Administrador nuevo;
        ArrayList<Administrador> listaAdmin = new ArrayList();
        CSVReader csvReader = new CSVReaderBuilder(new FileReader("src/Database/Administrador.csv")).withSkipLines(1).build();
        
        List<String[]> data = csvReader.readAll();
        
        for(String [] linea : data){
            nuevo = new Administrador(linea[0],linea[1]);            
            listaAdmin.add(nuevo);
        }
        return listaAdmin;
    }
}
