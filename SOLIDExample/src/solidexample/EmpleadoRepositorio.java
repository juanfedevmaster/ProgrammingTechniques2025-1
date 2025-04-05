/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solidexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jufeq
 */
public class EmpleadoRepositorio {

    public void guardarEmpleado(Empleado empleado, int baseDatos) {

        if (baseDatos == 1) {
            //1. Conexión a Base de datos.
            //2. Almacenar Empleado.        
            System.out.println("Empleado a sido guardado en la base de datos de oracle.");

        } else if (baseDatos == 2) {
            //1. Conexión a Base de datos.
            //2. Serializacion del Objeto en un Json
            //3. Almacenar Empleado como JSON. 
            System.out.println("Empleado a sido guardado en la base de datos de MongoDB.");
        } else {
            //1. Conexión a Base de datos.
            //2. Almacenar Empleado.        
            System.out.println("Empleado a sido guardado en la base de datos de SQL Server.");
        }
    }

    public List<Empleado> getEmpleados(double filtroSalario) {
        //1. Conexión a Base de datos.
        //2. Consultar los usuarios con el filtro de salario.   

        return new ArrayList<Empleado>();
    }
}
