/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSustitution;

/**
 *
 * @author jufeq
 */
public class Circle extends Figure {

    private double radio;

    public Circle() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(this.radio, 2);
        System.out.println("The area of the Circle is: " + area);
    }

    @Override
    public void calculaterPerimeter() {
        double perimetro = 2 * Math.PI * this.radio;
        System.out.println("The Perimeter of the Circle is: " + perimetro);
    }
}
