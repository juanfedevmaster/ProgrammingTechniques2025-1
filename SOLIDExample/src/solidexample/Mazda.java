/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solidexample;

/**
 *
 * @author jufeq
 */
public class Mazda implements ProductoEncendidoApagado{

    @Override
    public void aplicarEncendido() {
        System.out.println("Aplique el encendido de vehículo");
    }

    @Override
    public void aplicarApagado() {
        System.out.println("Aplique el apagado de vehículo");
    }
   
}
