/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginexample.BusinessLogic;

import java.io.IOException;
import logicexample.Repository.LogicRepository;
import logicexample.Repository.LoginRepositoryMongoDb;
import loginexample.Entities.Login;

/**
 *
 * @author jufeq
 */
public class ServiceLogin {

    private LogicRepository logicRepository;
    private LoginRepositoryMongoDb loginRepository;

    public ServiceLogin() throws IOException {
        logicRepository = new LogicRepository();
        loginRepository = new LoginRepositoryMongoDb();
    }

    public boolean validateUserAndPassword(String username, String password) {
        //var logins = logicRepository.getLogins();
        var logins = loginRepository.getLogins();

        for (var login : logins) {
            if (login.getUsername().equals(username) && login.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public boolean registerUser(Login login) throws IOException, Exception {
        //var logins = logicRepository.getLogins();
        var logins = loginRepository.getLogins();
        var userExist = false;

        for (var loginTmp : logins) {
            if (loginTmp.getUsername().equals(login.getUsername())) {
                return false;
            }
        }

        return loginRepository.createLogin(login);
    }

    public boolean userExistInTheDataBase(String userName) {
        var logins = logicRepository.getLogins();
        for (var loginTmp : logins) {
            if (loginTmp.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }
}
