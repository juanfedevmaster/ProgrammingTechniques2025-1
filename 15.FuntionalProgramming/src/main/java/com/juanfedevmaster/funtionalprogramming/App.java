/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.juanfedevmaster.funtionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author jufeq
 */
public class App {

    public static void main(String[] args) {
        Function<String, Integer> function1 = (String a) -> {
            return a.length();
        };

        var sizeOf = new SizeOf();

        System.out.println("Cantidad de caracteres: "
                + function1.apply("Hola Mundo"));

        System.out.println("=========================");

        System.out.println("Cantidad de caracteres: "
                + sizeOf.apply("Hola Mundo en una instancia"));

        System.out.println("=========================");

        List<String> nombres = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            nombres.add("Nombre" + i);
        }

        var nombreBuscado = nombres.stream()
                .filter(x->x.equals("Nombre25"))
                .findFirst();
        
        System.out.println(nombreBuscado.get());

        List<Persona> personas = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            personas.add(new Persona("Nombre" + i, "Apellido" + i, i));
        }
        
        var persona = personas.stream()
                .filter(x->x.getId() >= 25)
                .collect(Collectors.toList());
        
        for(Persona p : persona){
            System.out.println(p.toString());
        }
    }
}
