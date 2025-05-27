/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicexample.Repository;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import org.bson.Document;
import loginexample.Entities.Login;

/**
 *
 * @author juan.quintanag
 */
public class LoginRepositoryMongoDb {
    private MongoDatabase database;
    private MongoCollection<Document> loginCollection;
    
    public LoginRepositoryMongoDb() {
        var client = MongoClients.create("mongodb://localhost:27017");
        database = client.getDatabase("Auth");
        loginCollection = database.getCollection("Login");
    }
    
    public ArrayList<Login> getLogins(){
        var logins = loginCollection.find();
        ArrayList<Login> loginsToReturn = new ArrayList<>();
        for(Document document : logins){
            Login login = new Login();
            login.setUsername((String)document.get("username"));
            login.setPassword((String)document.get("password"));
            loginsToReturn.add(login);
        }
        
        return loginsToReturn;
    }
    
    public boolean createLogin(Login login) {
        loginCollection.insertOne(login.toDocument());
        System.out.println("Login added: " + login);
        return true;
    }
}
