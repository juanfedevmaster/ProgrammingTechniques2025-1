/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginexample.Entities;

import org.bson.Document;

/**
 *
 * @author jufeq
 */
public class Login {
    private String username;
    private String password;

    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Document toDocument() {
        return new Document("username", this.username)
                .append("password", this.password);
    }

    public static Login fromDocument(Document doc) {
        return new Login(
                doc.getString("username"),
                doc.getString("password")
        );
    }
}
