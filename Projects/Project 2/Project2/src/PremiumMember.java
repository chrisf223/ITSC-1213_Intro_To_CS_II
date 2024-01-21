/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
/**
 *
 * @author Adam Whaley and DeCristo Franceschini
 */
/* the PremiumMember class represents a premium member of a bookstore
*/
public class PremiumMember {
    
    private String name;
    private int memberID;
    private boolean newsletterSubscribed;
    private ArrayList<Dog> dogsOwned = new ArrayList();
    private ArrayList<Cat> catsOwned = new ArrayList();
    private ArrayList<ExoticPet> exoticPetsOwned = new ArrayList();
    private boolean duesPaid;
    private double amountSpent = 0;

     /** creates a PremiumMember object with parameters name, memberID, newsletterSubsribed, and duesPaid
     * @param name
     * @param memberID
     * @param newsletterSubscribed 
     * @param duesPaid 
     */
    public PremiumMember(String name, int memberID, boolean newsletterSubscribed, boolean duesPaid) {
        this.name = name;
        this.memberID = memberID;
        this.newsletterSubscribed = newsletterSubscribed;
        this.duesPaid = duesPaid;
    }
    
    /** returns whether or not the membership fees have been paid
     * @return 
     */
    public boolean isDuesPaid() {
        return duesPaid;
    }
    
    /** sets whether or not the membership fees have been paid
     * @param duesPaid 
     */
    public void setDuesPaid(boolean duesPaid) {
        this.duesPaid = duesPaid;
    }
    
    /** returns the name of a premium member
     * @return 
     */
    public String getName() {
        return name;
    }
    
     /** returns the ID of a premium member
     * @return 
     */
    public int getMemberID() {
        return memberID;
    }
    
    /** returns the news letter subscription status of a premium member
     * @return 
     */
    public boolean isNewsletterSubscribed() {
        return newsletterSubscribed;
    }
    
    /** returns an arrayList of the dogs a premium member owns
     * @return 
     */
    public ArrayList<Dog> getDogsOwned() {
        return dogsOwned;
    }
    
    /** returns an arrayList of the cats a premium member owns
     * @return 
     */
    public ArrayList<Cat> getCatsOwned() {
        return catsOwned;
    }
        
    /** returns an arrayList of the exotic pets a premium member owns
     * @return 
     */
    public ArrayList<ExoticPet> getExoticPetsOwned() {
        return exoticPetsOwned;
    }
    
    /** returns the amount that a premium member has spent
     * @return 
     */
    public double getAmountSpent() {
        return amountSpent;
    }
    
    /** sets a premium members name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /** sets a premium members ID
    * @param memberID
    */
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    
    /** sets a premium members newsletter subscription status
     * @param newsletterSubscribed 
     */
    public void setNewsletterSubscribed(boolean newsletterSubscribed) {
        this.newsletterSubscribed = newsletterSubscribed;
    }
    
    /** sets the amount a premium member has spent
     * @param amountSpent 
     */
    public void setAmountSpent(double amountSpent) {
        this.amountSpent = this.amountSpent + amountSpent;
    }   
    
    /** adds a dog to a premium members arrayList of dogs
     * @param dog 
     */
    public void addDog(Dog dog) {
         dogsOwned.add(dog);
     }
    
    /** adds a cat to a premium members arrayList of cats
     * @param cat 
     */
    public void addCat(Cat cat) {
         catsOwned.add(cat);
     }
    
    /** adds an exotic pet to a premium members arrayList of exotic pets
     * @param exoticPet 
     */
    public void addExoticPet(ExoticPet exoticPet) {
         exoticPetsOwned.add(exoticPet);
     }
    
    /** adds a pet to the appropriate premium members arrayList
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
    
    /** displays all of a premium members pets
     * @param member 
     */
    public void displayPets(PremiumMember member){
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

