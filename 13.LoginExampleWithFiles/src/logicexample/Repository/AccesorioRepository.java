/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicexample.Repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import loginexample.Entities.Accesorio;

/**
 *
 * @author jufeq
 */
public class AccesorioRepository {
    private final String path = "C:\\UdeA Proyectos\\GIT\\ProgrammingTechniques2025-1\\13.LoginExampleWithFiles\\Accesorios.json";
    private FileReader reader;
    
    public AccesorioRepository() throws FileNotFoundException{
        this.reader = new FileReader(path);
    }
    
    public ArrayList<Accesorio> leerAccesorios() throws Exception{
        try{
            Gson gson = new Gson();
            ArrayList<Accesorio> lstAccesorios =
                    gson.fromJson(reader, new TypeToken<ArrayList<Accesorio>>(){
                    }.getType());
            
            return lstAccesorios;
        }catch(Exception exe){
            throw new Exception("Ocurrio un error, contacta al administrador");
        }
    }
}
