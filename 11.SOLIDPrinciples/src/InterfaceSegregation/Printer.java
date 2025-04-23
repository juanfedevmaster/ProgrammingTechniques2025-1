/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaceSegregation;

/**
 *
 * @author jufeq
 */
public class Printer implements IPrinter {

    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

}
