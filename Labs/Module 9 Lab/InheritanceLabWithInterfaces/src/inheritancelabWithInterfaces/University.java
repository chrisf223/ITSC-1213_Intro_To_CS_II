/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancelabWithInterfaces;
import java.util.*;
/**
 *
 * @author chrisf
 */
public class University implements UniversitySpecification {
    private ArrayList<Person> personnel = new ArrayList();
    

    private String name; 
    
    public University(String name){
        this.name = name; 
    }
    public ArrayList<Person> getPersonnel(){
        return personnel;
    }

    @Override
    public void setUp(ArrayList<Person> personnel) {
        for (Person p : personnel){
            this.personnel.add(p);
    }
    }

    @Override
    public ArrayList<Student> getStudents() {
        ArrayList<Student> students = new ArrayList(); 
        for (Person p : personnel){
            if (p instanceof Student){
                students.add((Student)p);
            }
        }
        return students; 
    }

    @Override
    public ArrayList<Professor> getProfessors() {
        ArrayList<Professor> professors = new ArrayList(); 
        for (Person p : personnel){
            if (p instanceof Professor){
                professors.add((Professor)p);
            }
        }
        return professors;
    }

    @Override
    public void newStudent(Student s) {
        personnel.add(s);
    }

    @Override
    public void newProfessor(Professor p) {
        personnel.add(p);
    }
    
}
