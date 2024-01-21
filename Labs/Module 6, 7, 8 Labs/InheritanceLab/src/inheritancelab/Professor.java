/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancelab;
import java.util.*;

/**
 *
 * @author chrisf
 */
public class Professor extends Person{
    private String department;
    private double salary;
    private ArrayList<Student> advisees = new ArrayList<Student>();
    
    public Professor(String fName, String lName, int id, String department,
            double salary){
        super(fName,lName,id);
        this.department = department; 
        this.salary = salary;
        advisees = new ArrayList();  
    }    
    public String getDepartment(){
         return department;
    }   
    public double getSalary(){
        return salary;
    }
    public ArrayList<Student> getAdvisees(){
        return advisees;
    } 
    public void setDepartment(String d){
        department = d;
    }
    public void setSalary(Double s){
        salary = s;
    }
    public void addAdvisee(Student s){
        advisees.add(s);
    }
    public boolean removeAdvisee(int id){
        for (Student advisee : advisees){
            if (advisee.getID() == id){
                advisees.remove(advisee);
                return true; 
            }
        }
        return false; 
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Department: "+ department);
        System.out.println("Salary: "+ salary);
        for (Student s : advisees){
            System.out.println("\t"+s.getFirstName()+" "+s.getLastName()); 
        }
    }
    @Override
    public String toString(){
        return "Professor - "+this.getFirstName()+ " " + this.getLastName();
    }
}
