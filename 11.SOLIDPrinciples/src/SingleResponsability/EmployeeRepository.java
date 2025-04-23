/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleResponsability;

/**
 *
 * @author jufeq
 */
public class EmployeeRepository {

    public void saveEmployee(Employee employee) {
        System.out.println("The employee " + employee.getName() + " is saved");
    }
    
    public Employee getEmployeeFromDataBase(int id){
        // Get the information of the Employee from Oracle
        return new Employee();
    }
}
