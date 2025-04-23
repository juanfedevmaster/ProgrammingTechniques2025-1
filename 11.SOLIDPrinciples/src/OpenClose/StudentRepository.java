/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OpenClose;

/**
 *
 * @author jufeq
 */
public class StudentRepository {

    public void saveStudent(Student student) {
        IRepository repo;
        switch (student.getCareer()) {
            case "Engineer" ->
                repo = new SqlRepository();
            case "Medicine" ->
                repo = new OracleRepository();
            case "Psicology" ->
                repo = new MySqlRepository();
            default ->
                repo = new MongoDbRepository();
        }

        repo.saveStudent(student);
    }
}
