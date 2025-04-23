/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OpenClose;

/**
 *
 * @author jufeq
 */
public class SqlRepository implements IRepository{

    @Override
    public void saveStudent(Student student) {
        System.out.println("The student is saved in SQL Server");
    }
    
}
