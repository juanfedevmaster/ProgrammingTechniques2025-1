/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicexample.Repository;

import java.io.BufferedWriter;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import loginexample.Entities.Login;

/**
 *
 * @author jufeq
 */
public class LogicRepository {

    private final File file;
    public static final String PATH = "C:\\UdeA Proyectos\\GIT\\ProgrammingTechniques2025-1\\13.LoginExampleWithFiles\\Login.txt";

    public LogicRepository() throws IOException {
        file = new File(PATH);
    }

    /**
     * Get Logis from File
     *
     * @return
     */
    public List<Login> getLogins() {
        Scanner s = null;
        List<Login> logins = new ArrayList<>();
        try {
            System.out.println("Reading the login File...");
            s = new Scanner(file);

            while (s.hasNextLine()) {
                String loginLine = s.nextLine();
                var login = new Login(loginLine.split("\\|")[0], loginLine.split("\\|")[1]);
                logins.add(login);
                System.out.println("Login obteined: " + login.getUsername());
            }

            return logins;

        } catch (Exception exe) {
            return null;
        }
    }

    public boolean registerUser(Login login) throws Exception {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))) {
            var content = login.getUsername() + "|" + login.getPassword();
            bufferedWriter.write(content);
            bufferedWriter.newLine();
        } catch (Exception exe) {
            throw new Exception(exe.getMessage());
        }

        return true;
    }
}