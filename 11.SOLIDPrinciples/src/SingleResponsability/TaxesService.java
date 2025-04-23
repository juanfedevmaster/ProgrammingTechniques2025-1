/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleResponsability;

/**
 *
 * @author jufeq
 */
public class TaxesService {
    public double calculateTaxes(Employee employee){
        return employee.getSalary() * 0.15;
    }
}
