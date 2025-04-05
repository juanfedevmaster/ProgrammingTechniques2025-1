/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solidexample;

/**
 *
 * @author jufeq
 */
public class ServicioDeImpuestos {
    
    public void calcularImpuesto(Empleado empleado){
        var impuesto = empleado.getSalario() * 0.15;
        System.out.println("El impuesto al salario del emplado es de: " + impuesto);
    }
}
