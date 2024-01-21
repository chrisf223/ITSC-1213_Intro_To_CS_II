/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adam Whaley and DeCristo Franceschini
 */
/* the ExoticPet class represents an animal that is not a dog or cat at a pet store
*/
public class ExoticPet extends Pet { 
    
    private String species;
    
    /** creates an exotic pet object with parameters name, species, sex, age, weight, ID, and price
     * @param name
     * @param species
     * @param sex
     * @param age
     * @param weight
     * @param ID
     * @param price 
     */
    public ExoticPet(String name, String species, String sex, int age, double weight, int ID, double price) {
        super(name, sex, age, weight, ID, price);
        this.species = species; 
    }
    
    /** creates an exotic pet object with parameters name, species, sex, age, and weight
     * @param name
     * @param species
     * @param sex
     * @param age
     * @param weight
     */
    public ExoticPet(String name, String species, String sex, int age, double weight) {
        super(name, sex, age, weight);
        this.species = species; 
    }
    
    /** returns the species of the exotic pet
     * @return 
     */
    public String getSpecies(){
        return species; 
    }
    
    /** sets the species of an exotic pet
     * @param species 
     */
    public void setSpecies(String species){
        this.species = species; 
    }
}

