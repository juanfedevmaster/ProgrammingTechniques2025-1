/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanfedevmaster.Repository;

import com.juanfedevmaster.Entities.Login;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Updates.*;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author jufeq
 */
public class LoginRepository {

    private final MongoDatabase database;
    private final MongoCollection<Document> logincollection;

    public LoginRepository() {
        var client = MongoClients.create("mongodb+srv://juanfedevmaster:admin@clusterfree.qhsbza7.mongodb.net/");
        database = client.getDatabase("EnsambladoraDeVehiculos");
        logincollection = database.getCollection("Auth");
    }

    public ArrayList<Login> getLogins() throws Exception {
        var loginDocuments = logincollection.find();
        ArrayList<Login> logins = new ArrayList<>();
        try {
            for (Document doc : loginDocuments) {
                var username = (String) doc.get("username");
                var password = (String) doc.get("password");

                var login = new Login(username, password);
                logins.add(login);
            }

            return logins;
        } catch (Exception exe) {
            throw new Exception("Ha ocurrido un error, contacte al Admin: " + exe.getMessage());
        }
    }

    public Login getLogin(String username) {
        Document docLogin = logincollection.find(Filters.eq("username", username)).first();
        return docLogin != null ? Login.fromDocument(docLogin) : null;
    }

    public boolean registerUser(Login login) {
        try {
            logincollection.insertOne(login.toDocument());
            System.out.println("Login added: " + login.getUsername());
            return true;
        } catch (Exception exe) {
            System.out.println("Error: " + exe.getMessage());
            return false;
        }
    }
    
    public void updateUser(Login login){
        logincollection.updateOne(Filters.eq("username",login.getUsername()),
                combine(set("password",login.getPassword())));
        
        System.out.println("Login updated: " + login.getUsername());
    }
    
    public void deleteUser(Login login){
        logincollection.deleteOne(Filters.eq("username",login.getUsername()));
        System.out.println("Login deleted: " + login.getUsername());
    }
}