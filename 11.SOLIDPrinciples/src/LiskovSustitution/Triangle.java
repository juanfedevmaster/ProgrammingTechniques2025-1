/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LiskovSustitution;

/**
 *
 * @author jufeq
 */
public class Triangle extends Figure {

    private int base;
    private int height;
    private int side;

    public Triangle() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        double area = (this.base * this.height) / 2;
        System.out.println("The area of the Triangule is: " + area);
    }

    @Override
    public void calculaterPerimeter() {
        double perimeter = this.base + this.height + this.side;
        System.out.println("The perimeter of the Triangule is: " + perimeter);
    }

}
