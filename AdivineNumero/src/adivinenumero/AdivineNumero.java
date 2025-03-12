/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinenumero;

import java.util.Scanner;

/**
 *
 * @author jufeq
 */
public class AdivineNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int numeroAdivinar = (int) (Math.random() * 100) + 1;
        System.out.println(numeroAdivinar);

        Scanner scan = new Scanner(System.in);
        boolean numeroEncontrado = false;
        int intentos = 10;
        do {
            System.out.println("Adivine el número escondido: ");
            int numeroUsuario = scan.nextInt();
            intentos--;
            if (numeroUsuario == numeroAdivinar) {
                numeroEncontrado = true;
            } else {
                System.out.println("No adivinaste");
                if (numeroUsuario > numeroAdivinar) {
                    System.out.println("Pero el numero ingresado es mayor al número mágico");
                } else {
                    System.out.println("Pero el numero ingresado es menor al número mágico");
                }
            }

        } while (!numeroEncontrado && intentos > 0);

        if (numeroEncontrado == true) {
            System.out.println("Encontraste el número: " + numeroAdivinar);
            System.out.println("Lo lograste en el intento: " + (10 - intentos));
        } else {
            System.out.println("No lograste encontrar el número");
        }
    }
}
