/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entitities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import pkg4.reactiveparadigmpatternsuscriber.Interfaces.Observer;
import pkg4.reactiveparadigmpatternsuscriber.Interfaces.Subject;

/**
 *
 * @author jufeq
 */
public class NewsChannel implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private int newsIndex = 0;
    
    private final String[] newsList = {
        "📰 Java 21 ha sido lanzado!",
        "📢 Nueva vulnerabilidad descubierta en Spring Boot.",
        "🚀 El desarrollo con React sigue dominando el mercado.",
        "🔍 IA y Machine Learning revolucionan la industria.",
        "💻 Kotlin vs Java: ¿Cuál dominará el futuro?"
    };
    
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println("Nuevo suscriptor añadido.");
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println("Un suscriptor ha sido eliminado.");
    }

    @Override
    public void notifySubscribers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Método para publicar una noticia
    public void publishNews(String news) {
        System.out.println("📢 Nueva noticia publicada: " + news);
        notifySubscribers(news);
    }

    public void startNewsBroadcast() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(() -> {
            if (newsIndex >= newsList.length) {
                newsIndex = 0; // Reiniciar noticias
            }
            String news = newsList[newsIndex++];
            System.out.println("\n📡 Publicando noticia: " + news);
            notifySubscribers(news);
        }, 0, 10, TimeUnit.SECONDS);
    }
}
