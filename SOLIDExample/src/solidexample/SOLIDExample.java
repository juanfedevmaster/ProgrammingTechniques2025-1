/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solidexample;

import solidexample.Interfaces.IRepositorio;

/**
 *
 * @author jufeq
 */
public class SOLIDExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 1. Aplicando Liskop con Herencia a traves de clases Abstractas.
        Empleado emp = new Gerente();
        emp.calcularSalarioConRetencion();

        // 2. Aplicando Liskop con Herencia a traves de su tipo de clase
        // Primera forma: Hacemos un Cast Directo
        ((Gerente) emp).getPersonasACargo();

        // Segunda Forma con instanceof: Sabes la instancia del Objeto para 
        // hacer un cast.
        if (emp instanceof Gerente gerente) {
            gerente.getPersonasACargo();
        }
        
        // 3. Aplicando Liskop con Interfaces.
        IRepositorio repo1 = new EmpleadoMongoDB();
        IRepositorio repo2 = new EmpleadoRepositorioSQL();
        IRepositorio repo3 = new EmpleadoOracleSQL();
        
        

        /*IRepositorio repo = new EmpleadoMongoDB();
        repo.guardarEmpleado(new Empleado());*/
    }
}
