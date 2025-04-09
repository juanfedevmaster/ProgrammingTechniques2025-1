/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.classdiagramtocode;

import Entidades.Consumible;
import Entidades.Producto;
import Entidades.ProductoAseo;

/**
 *
 * @author jufeq
 */
public class ClassDiagramToCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto blanqueador = new ProductoAseo("Ajax", 123456789, 5000, 4000, new String[]{"Mantengase alejado de los niños", "Posible envenenamiento", "Posible quemadura", "No ingerir"});
        Producto cheetos = new Consumible("Cheetos x250", 234, 3000, 2000, new String[]{"Exceso de Sodio", "Grasas Saturadas"});
        
        blanqueador.imprimirInformacionExtra();
        System.out.println("==========================");
        cheetos.imprimirInformacionExtra();
    }

}
