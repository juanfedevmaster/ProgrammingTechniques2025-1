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
public class EmpleadoOracleSQL implements IRepositorio {

    @Override
    public void guardarEmpleado(Empleado empleado) {
        //1. Conexión a Base de datos.
        //2. Serializacion del Objeto en un Json
        //3. Almacenar Empleado como JSON. 
        System.out.println("Empleado a sido guardado en la base de datos de MongoDB.");
    }

}
