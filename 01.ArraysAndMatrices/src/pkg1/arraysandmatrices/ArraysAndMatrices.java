/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.arraysandmatrices;

/**
 *
 * @author jufeq
 */
public class ArraysAndMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrizExample();
    }

    public static void matrizExample() {
        int matriz[][] = {
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 1}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

    }

    public static void arraysExample() {
        int array[] = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            int j = 2;
            while (j < array[i] && isPrime == true) {
                if (array[i] % j == 0) {
                    isPrime = false;
                }
                j++;
            }

            if (isPrime) {
                System.out.println("The number: " + array[i] + " is Prime number");
            } else {
                System.out.println("The number: " + array[i] + " is not a Prime number");
            }
        }
    }

}
