/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author Adam Whaley and DeCristo Franceschini
 */

/* the Member class represents a standard member of a pet store
*/
public class Member {
    
    private String name;
    private int memberID;
    private boolean newsletterSubscribed;
    private ArrayList<Dog> dogsOwned = new ArrayList();
    private ArrayList<Cat> catsOwned = new ArrayList();
    private ArrayList<ExoticPet> exoticPetsOwned = new ArrayList();
    private double amountSpent = 0;
    
    /** creates a member object with parameters name, memberID, and newsletterSubsribed
     * @param name
     * @param memberID
     * @param newsletterSubscribed 
     */
    
    public Member(String name, int memberID, boolean newsletterSubscribed) {
        this.name = name;
        this.memberID = memberID;
        this.newsletterSubscribed = newsletterSubscribed;
    }
    
    /** returns the name of a member
     * @return 
     */
    
    public String getName() {
        return name;
    }
    /** returns the ID of a member
     * @return 
     */
    
    public int getMemberID() {
        return memberID;
    }
    
    /** returns the news letter subscription status of a member
     * @return 
     */
    
    public boolean isNewsletterSubscribed() {
        return newsletterSubscribed;
    }
    /** returns an arrayList of the dogs a member owns
     * @return 
     */
    
    public ArrayList<Dog> getDogsOwned() {
        return dogsOwned;
    }
    /** returns an arrayList of the cats a member owns
     * @return 
     */
    
    public ArrayList<Cat> getCatsOwned() {
        return catsOwned;
    }
    /** returns an arrayList of the exotic pets a member owns
     * @return 
     */
    
    public ArrayList<ExoticPet> getExoticPetsOwned() {
        return exoticPetsOwned;
    }
    /** returns the amount that a member has spent
     * @return 
     */
    
    public double getAmountSpent() {
        return amountSpent;
    }
    /** sets a members name
     * @param name 
     */
    
    public void setName(String name) {
        this.name = name;
    }
    /** sets a members ID
    * @param memberID
    */
    
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    /** sets a members newsletter subscription status
     * @param newsletterSubscribed 
     */
    
    public void setNewsletterSubscribed(boolean newsletterSubscribed) {
        this.newsletterSubscribed = newsletterSubscribed;
    }
    /** sets the amount a member has spent
     * @param amountSpent 
     */
    
    public void setAmountSpent(double amountSpent) {
        this.amountSpent = this.amountSpent + amountSpent;
    }
    /** adds a dog to a members arrayList of dogs
     * @param dog 
     */
    
    public void addDog(Dog dog) {
         dogsOwned.add(dog);
    }
    /** adds a cat to a members arrayList of cats
     * @param cat 
     */
    
    public void addCat(Cat cat) {
         catsOwned.add(cat);
     }
    /** adds an exotic pet to a members arrayList of exotic pets
     * @param exoticPet 
     */
    
    public void addExoticPet(ExoticPet exoticPet) {
         exoticPetsOwned.add(exoticPet);
     }
    /** adds a pet to the appropriate members arrayList
     * @param pet 
     */
    
    public void addPet(Pet pet) {
         if (pet instanceof Dog ){
         dogsOwned.add((Dog)pet);
         }
         if (pet instanceof Cat ){
         catsOwned.add((Cat)pet);
         }
         if (pet instanceof ExoticPet ){
         exoticPetsOwned.add((ExoticPet)pet);
         }
     }
    
    /** displays all of a members pets
     * @param member 
     */
    public void displayPets(Member member){
        System.out.println("Here are all of your pets that you have registered with us!: ");
        for (Dog dog : member.getDogsOwned()) {
            System.out.println("Name: " + dog.getName());
            System.out.println("    Species: Dog" ); 
            System.out.println("Breed: " + dog.getBreed());
            }
        for (Cat cat : member.getCatsOwned()) {
            System.out.println("Name: " + cat.getName());
            System.out.println("    Species: Cat" ); 
            System.out.println("Breed: " + cat.getBreed());
            } 
        for (ExoticPet ex  : member.getExoticPetsOwned()) {
            System.out.println("Name: " + ex.getName());
            System.out.println("    Species: " + ex.getSpecies()); 
            }     
     }
     
}

