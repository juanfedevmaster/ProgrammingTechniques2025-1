/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solidexample;

import solidexample.Interfaces.IRepositorio;

/**
 *
 * @author jufeq
 */
public class EmpleadoRepositorioSQL implements IRepositorio {

    @Override
    public void guardarEmpleado(Empleado empleado) {
        //1. Conexión a Base de datos.
        //2. Almacenar Empleado.        
        System.out.println("Empleado a sido guardado en la base de datos de oracle.");

    }

}
