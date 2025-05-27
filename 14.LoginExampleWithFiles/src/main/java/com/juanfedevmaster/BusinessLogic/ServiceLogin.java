/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juanfedevmaster.BusinessLogic;

import com.juanfedevmaster.Entities.Login;
import com.juanfedevmaster.Repository.LoginRepository;
import java.io.IOException;

/**
 *
 * @author jufeq
 */
public class ServiceLogin {

    private LoginRepository loginRepository;

    public ServiceLogin() {
        loginRepository = new LoginRepository();
    }

    public boolean validateUserAndPassword(String username, String password) throws Exception {
        var login = loginRepository.getLogin(username);

        if (login != null && login.getPassword().equals(password)) {
            return true;
        }

        return false;

        /*var logins = loginRepository.getLogins();

        for (var login : logins) {
            if (login.getUsername().equals(username) && login.getPassword().equals(password)) {
                return true;
            }
        }

        return false;*/
    }

    public boolean registerUser(Login login) throws IOException, Exception {
        return loginRepository.registerUser(login);
    }

    public boolean userExistInTheDataBase(String userName) {
        var login = loginRepository.getLogin(userName);

        if (login != null) {
            return login.getUsername().equals(userName);
        }
        
        return false;

    }
}
