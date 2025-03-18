/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.reactiveparadigmpattersuscriber;

import Entitities.NewsChannel;
import Entitities.Subscriber;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import pkg4.reactiveparadigmpatternsuscriber.Interfaces.Observer;

/**
 *
 * @author jufeq
 */
public class ReactiveParadigmPatronSuscriber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AuthorizedUTF8();
        
        // Creamos un canal de noticias
        NewsChannel techNews = new NewsChannel();

        // Creamos suscriptores
        Observer user1 = new Subscriber("Juan");
        Observer user2 = new Subscriber("María");
        
        // Suscribimos usuarios al canal
        techNews.subscribe(user1);
        techNews.subscribe(user2);

        // Iniciar transmisión de noticias infinitas
        techNews.startNewsBroadcast();

    }
    
    public static void AuthorizedUTF8(){
        try {
            // Configurar la salida para que use UTF-8
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
