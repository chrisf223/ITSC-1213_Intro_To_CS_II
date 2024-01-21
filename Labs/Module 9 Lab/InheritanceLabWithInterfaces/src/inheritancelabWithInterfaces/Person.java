/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancelabWithInterfaces;

/**
 *
 * @author chrisf
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private int ID; 
    
    public Person(String first, String last, int id){
        firstName = first;
        lastName = last;
        ID = id; 
    }    
    public String getFirstName(){
        return firstName; 
    }
    public String getLastName(){
        return lastName; 
    }
    public int getID(){
        return ID; 
    }
    public abstract void display();
    
    @Override
    public boolean equals(Object other){
        if (other == null){
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        
        return this.getID() == ((Person) other).getID();
    }
    
    
    
}
