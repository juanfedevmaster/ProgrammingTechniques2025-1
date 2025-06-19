/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Vehiculo;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import static com.mongodb.client.model.Updates.combine;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author jufeq
 */
public class VehiculoRepositorio {

    private final MongoDatabase database;
    private final MongoCollection<Document> vehiculoCollection;

    public VehiculoRepositorio() {
        var client = MongoClients.create("mongodb://localhost:27017");
        database = client.getDatabase("ManejoVehiculos");
        vehiculoCollection = database.getCollection("Vehiculos");
    }

    public ArrayList<Vehiculo> getVehiculos() throws Exception {
        var vehiculoDocuments = vehiculoCollection.find();
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

    public boolean addVehiculo(Vehiculo vehiculo) throws Exception {
        try {
            var document = vehiculo.toDocument();
            vehiculoCollection.insertOne(document);
            return true;
        } catch (Exception exe) {
            throw new Exception("Ha ocurrido un error, contacte al Admin: " + exe.getMessage());
        }
    }

    public boolean updateVehiculo(Vehiculo vehiculo, Vehiculo vehiculoOriginal) throws Exception {
        try{
            
            
            vehiculoCollection.updateOne(Filters.eq("name",vehiculoOriginal.getName()),
                    combine(Updates.set("name",vehiculo.getName())
                            ,Updates.set("brand",vehiculo.getBrand())
                            ,Updates.set("type",vehiculo.getType())
                            ,Updates.set("yearIntroduced",vehiculo.getYearIntroduced())));
            
            System.out.println("El vehículo se actualizo correctamente");            
            
        } catch (Exception exe) {
            throw new Exception("Ha ocurrido un error, contacte al Admin: " + exe.getMessage());
        }
        return true;
    }
}
