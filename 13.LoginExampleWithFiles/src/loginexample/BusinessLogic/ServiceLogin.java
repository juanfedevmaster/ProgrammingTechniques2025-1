/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginexample.BusinessLogic;

import logicexample.Repository.LogicRepository;

/**
 *
 * @author jufeq
 */
public class ServiceLogin {
    private LogicRepository logicRepository;

    public ServiceLogin() {
        logicRepository = new LogicRepository();
    }
    
    public boolean validateUserAndPassword(String username, String password){
        var logins = logicRepository.getLogins();
        
        for(var login : logins){
            if(login.getUsername().equals(username) && login.getPassword().equals(password)){
                return true;
            }
        }
        
        return false;
    }
}
