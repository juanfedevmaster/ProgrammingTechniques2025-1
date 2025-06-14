/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Vehiculo;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author jufeq
 */
public class VehiculoRepositorio {

    private final MongoDatabase database;
    private final MongoCollection<Document> vahiculocollection;

    public VehiculoRepositorio() {
        var client = MongoClients.create("mongodb://localhost:27017");
        database = client.getDatabase("ManejoVehiculos");
        vahiculocollection = database.getCollection("Vehiculos");
    }
    
    public ArrayList<Vehiculo> getVehiculos() throws Exception {
        var vehiculoDocuments = vahiculocollection.find();
        ArrayList<Vehiculo> Vehiculos = new ArrayList<>();
        try {
            for (Document doc : vehiculoDocuments) {
                var vehiculo = Vehiculo.fromDocument(doc);
                Vehiculos.add(vehiculo);
            }

            return Vehiculos;
        } catch (Exception exe) {
            throw new Exception("Ha ocurrido un error, contacte al Admin: " + exe.getMessage());
        }
    }
    
}
