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

public class Student extends Person {
    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private ArrayList<String> enrolledCourses = new ArrayList<String>(); 
    
    public Student(String fName, String lName, int id, String major,
            double gpa, int credits){
        super(fName,lName,id);
        this.major = major; 
        this.gpa = gpa;
        this.credits = credits;
        balance = 0;
        enrolledCourses = new ArrayList();        
    }    
    public String getMajor(){
        return major;
    }
    public double getGPA(){
        return gpa;
    }
    public int getCredits(){
        return credits;
    }
    public boolean isTransfer(){
        return transfer;
    }
    public double getBalance(){
        return balance;
    }
    @Override
    public int getID(){
        return super.getID(); 
    }
    public ArrayList<String> getEnrolledCourses(){
        return enrolledCourses;
    }
    public void setMajor(String m){
        major = m;
    }
    public void setGPA(double g){
        gpa = g;
    }
    public void setCredits(int c){
        credits = c;
    }
    public void setTransfer(boolean t){
        transfer = t;
    }
    public void setBalance(double b){
        balance = b;
    }
    public void addCourse(String course){
        enrolledCourses.add(course);
    }
    public boolean dropCourse(String c){
        for (String course : enrolledCourses){
            if (course.equals(c)){
                enrolledCourses.remove(course);
                return true; 
            } 
        }
        return false; 
    }
    @Override
    public void display(){
         System.out.println("Major: " + major);
         System.out.println("GPA: " + gpa );
         System.out.println("Credits: " + credits );
         System.out.println("Enrolled Classes: ");  
         for (int i = 0;i<enrolledCourses.size();i++){
             System.out.println("\t"+enrolledCourses.get(i));
        }        
    }
    @Override
    public String toString(){
        return "Student - "+this.getFirstName()+ " " + this.getLastName();
    }

    public int compareTo(Student o){
        double sGPA = this.getGPA();
        double oGPA = o.getGPA();
        System.out.println("Students GPA: " + sGPA + " and " + oGPA);
        if (sGPA > oGPA){
            return 1;
        }
        else if (sGPA < oGPA){
            return -1;
        }
        else {
            return 0;
        }
        
    }

    int getId() {
        return super.getID();    
    }

}
