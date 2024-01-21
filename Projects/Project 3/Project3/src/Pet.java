/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chrisf
 */ 
/* the pet class represents a pet at a pet store
*/
public abstract class Pet implements Comparable {
    private String name;
    private String sex;
    private int age;
    private double weight;
    private int ID;
    private double price;
    
    /** Creates a pet object with parameters name, sex, age, weight, ID, and price
     * @param name
     * @param sex
     * @param age
     * @param weight
     * @param ID
     * @param price
     */ 
    public Pet(String name, String sex, int age, double weight, int ID, double price) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.ID = ID;
        this.price = price;
    }
    
    /** Creates a pet object with parameters name, sex, age, and weight
     * @param name
     * @param sex
     * @param age
     * @param weight
     */ 
    public Pet(String name, String sex, int age, double weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
    }
    
    /** returns a pets ID
     * 
     * @return 
     */
    public int getID() {
        return ID;
    }
    
    /** sets a pets ID
     * 
     * @param ID 
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /** returns a pets Price
     * 
     * @return 
     */
    public double getPrice() {
        return price;
    }

    /** sets a pets price
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /** returns a pets Name
     * 
     * @return 
     */
    public String getName() {
        return name;
    }
    
    /** sets a pets name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /** returns a pets sex
     * 
     * @return 
     */
    public String getSex() {
        return sex;
    }
    
    /** sets a pets sex
     * 
     * @param sex 
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    /** returns a pets age
     * 
     * @return 
     */
    public int getAge() {
        return age;
    }

    /** sets a pets age
     * 
     * @param age 
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    /** returns a pets weight
     * 
     * @return 
     */
    public double getWeight() {
        return weight;
    }
    
    /** sets a pets weight
     * 
     * @param weight 
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    /** compares the prices of two pets 
     * 
     * @param pet
     * @return 
     */
    @Override
    public int compareTo(Pet pet){
        if (this.getPrice() > pet.getPrice()){
            return 1;
        }
        else if (this.getPrice() < pet.getPrice()){
            return -1;
        }
        else {
            return 0;
        }
    }
}


