/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adam Whaley and DeCristo Franceschini
 */
/* the Dog class represents a cat at a pet store
*/
public class Dog extends Pet {
    
    
    private String breed;
    
    /** creates a dog object with parameters name, breed, sex, age, weight, ID, and price
     * @param name
     * @param breed
     * @param sex
     * @param age
     * @param weight
     * @param ID
     * @param price 
     */
    public Dog(String name, String breed, String sex, int age, double weight, int ID, double price) {
        super(name, sex, age, weight, ID, price);
        this.breed = breed; 
    }
    
    /** creates a dog object with parameters name, breed, sex, age, weight
     * @param name
     * @param breed
     * @param sex
     * @param age
     * @param weight 
     */
    public Dog(String name, String breed, String sex, int age, double weight) { 
        super(name, sex, age, weight);
        this.breed = breed; 
    }
    
    /** returns the breed of the dog
     * @return 
     */
    public String getBreed(){
        return breed; 
    }   
    
     /** sets the breed of a dog
     * @param breed 
     */
    public void setBreed(String breed){
        this.breed = breed; 
    }
}
