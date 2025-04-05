/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solidexample;

/**
 *
 * @author jufeq
 */
public abstract class Empleado {
    private int id;
    private String nombre;
    private String cedula;
    private double salario;

    public Empleado(){
    }
    
    public Empleado(int id, String nombre, String cedula, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    abstract void calcularSalarioConRetencion();
}
