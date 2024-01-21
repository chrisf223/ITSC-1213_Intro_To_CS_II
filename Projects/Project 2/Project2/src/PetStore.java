/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adam Whaley and DeCristo Franceschini
 */
/* the PetStore class represents a pet store
*/
import java.util.*;

public class PetStore implements PetStoreSpecification{

    private String storeName;

    private ArrayList<Dog> availableDogs = new ArrayList();
    private ArrayList<Cat> availableCats = new ArrayList();
    private ArrayList<ExoticPet> availableExoticPets = new ArrayList();
    private ArrayList<Pet> availablePets = new ArrayList();
    private ArrayList<Member> memberList = new ArrayList();
    private ArrayList<PremiumMember> premiumMemberList = new ArrayList();
    private static int nextPetID = 1;
    private static int nextMemberID = 1;

    /** creates a PetStore object and populates with an initial ArrayList of available pets, and an initial ArrayList of members 
     * 
     * @param storeName 
     */
    public PetStore(String storeName) {
        this.storeName = storeName;
        Dog dog1 = new Dog("Waffle","German Shepherd","Female",12,85,getNextPetID(),500);
        Dog dog2 = new Dog("Poe", "Corgi", "Male", 3, 35, getNextPetID(), 450);
        Cat cat1 = new Cat("Karma","Orange Tabby","Female",6,15,getNextPetID(),200);
        Cat cat2 = new Cat("Kit", "Maine Coon", "Male", 6, 18, getNextPetID(), 150);
        ExoticPet ep1 = new ExoticPet("Pancake","Bearded Dragon","Male",6,0.8,getNextPetID(),75);
        ExoticPet ep2 = new ExoticPet("Noodle","Ball Python","Male",4,2,getNextPetID(),95);

        availableDogs.add(dog1);
        availableDogs.add(dog2);
        availableCats.add(cat1);
        availableCats.add(cat2);
        availableExoticPets.add(ep1);
        availableExoticPets.add(ep2);
        availablePets.add(dog1);
        availablePets.add(dog2);
        availablePets.add(cat1);
        availablePets.add(cat2);
        availablePets.add(ep1);
        availablePets.add(ep2);

        Member member1 = new Member("Jo", getNextMemberID(), true);
        member1.addCat(new Cat("Valjean", "White tabby", "Male", 1, 10, 0, 0));
        memberList.add(member1);

        PremiumMember member2 = new PremiumMember("Sage", getNextMemberID(), false, false);
        premiumMemberList.add(member2);
        member2.addExoticPet(
            new ExoticPet("Smaug", "Bearded Dragon", "Male", 5, 1, 0, 0)
        );

    }
    
    /** returns the ID number of the next pet
     * @return 
     */
    public static int getNextPetID() {
        nextPetID++;
        return nextPetID - 1;
    }
    
    /** returns the ID number of the next member
     * @return 
     */
    public static int getNextMemberID() {
        nextMemberID++;
        return nextMemberID - 1;
    }
    
    /** returns a Dog object from a parameter index
     * 
     * @param index
     * @return 
     */
    public Pet getDog(int index){
        return availableDogs.get(index);
    }
    
    /** returns a Cat object from a parameter index
     * 
     * @param index
     * @return 
     */
    public Pet getCat(int index){
        return availableCats.get(index);
    }
    
    /** returns an exotic pet object from a parameter index
     * @param index
     * @return 
     */
    public Pet getExoticPet(int index){
        return availableExoticPets.get(index);
    }
    
    /** returns a pet object from a parameter index and a parameter type
     * @param index
     * @return 
     */
    public Pet getPet(int index, int type){
        if (type == 1){
            return availableDogs.get(index);
        }
        else if (type == 2){
            return availableCats.get(index);
        }
        else {
            return availableExoticPets.get(index);
        }
    }
    
    /** returns the name of a PetStore object
     * @return 
     */
    public String getStoreName() {
        return storeName;
    }
    
    /** sets the name of a PetStore object
     * @param storeName 
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    
    /** returns an arrayList of the available dogs
     * @return 
     */
    public ArrayList<Dog> getAvailableDogs() {
        return availableDogs;
    }
    
    /** sets an arrayList of the available dogs
     * @param availableDogs 
     */
    public void setAvailableDogs(ArrayList<Dog> availableDogs) {
        this.availableDogs = availableDogs;
    }
    
    /** returns an arrayList of the available cats
     * @return 
     */
    public ArrayList<Cat> getAvailableCats() {
        return availableCats;
    }

     /** sets an arrayList of the available cats
     * @param availableCats 
     */
    public void setAvailableCats(ArrayList<Cat> availableCats) {
        this.availableCats = availableCats;
    }
    
    /** returns an arrayList of the available exotic pets 
     * @return 
     */
    public ArrayList<ExoticPet> getAvailableExoticPets() {
        return availableExoticPets;
    }
    
     /** sets an arrayList of the available exotic pets
     * @param availableExoticPets 
     */
    public void setAvailableExoticPets(ArrayList<ExoticPet> availableExoticPets) {
        this.availableExoticPets = availableExoticPets;
    }
    
    /** returns an arrayList of the available pets
     * @return 
     */
    public ArrayList<Pet> getAvailablePets() {
        return availablePets;
    }

    /** sets an arrayList of the available pets
     * @param availablePets 
     */
    public void setAvailablePets(ArrayList<Pet> availablePets) {
        this.availablePets = availablePets;
    }
    
    /** returns an arrayList of all standard members
     * @return 
     */
    public ArrayList<Member> getMemberList() {
        return memberList;
    }
    
    /** sets an arrayList of standard members
     * @param memberList 
     */
    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }
    
    /** returns an arrayList of all premium members
     * @return 
     */
    public ArrayList<PremiumMember> getPremiumMemberList() {
        return premiumMemberList;
    }
    
    /** sets an arrayList of premium members
     * @param premiumMemberList 
     */
    public void setPremiumMemberList(ArrayList<PremiumMember> premiumMemberList) {
        this.premiumMemberList = premiumMemberList;
    }
    
    /** removes a pet from the pet arrayList and the dog/ cat/ exotic pet arrayList
     * @param type
     * @param index 
     */
    public void removePet(String type, int index) {
        if (type.equals("dog")) {
            availableDogs.remove(index);
        }
        else if (type.equals("cat")) {
            availableCats.remove(index);
        }
        else if (type.equals("exoticPet")) { 
            availableExoticPets.remove(index);
        }
        availablePets.remove(index);


    }

    /** adds a new standard member or premium member to their respective ArrayLists
     * @param name
     * @param premium 
     */
    public void addNewMember(String name, boolean premium) {
        if (premium) {
            premiumMemberList.add(new PremiumMember(name,getNextMemberID(),false,false));
        } else {
            memberList.add(new Member(name,getNextMemberID(), false));
        }
    }
    
    /** displays all of the pets available for adoption
     * @param petList
     */
    @Override
     public void adoptionDrive(ArrayList<Pet> petList){
         for (Pet pet : petList){
             System.out.println("Name: " + pet.getName());
             if (pet instanceof ExoticPet){
                System.out.println("    Species: " + ((ExoticPet)pet).getSpecies()); 
            }
             else if (pet instanceof Cat){
                System.out.println("    Species: Cat");
                System.out.println("    Breed: " + ((Cat)pet).getBreed()); 
             }
             else if (pet instanceof Dog){
                System.out.println("    Species: Dog");
                System.out.println("    Breed: " + ((Dog)pet).getBreed()); 
             }
             System.out.println("    Price: " + pet.getPrice());
         }
     }
    
    /** returns the total value of all the pets currently in the inventory
     * @return 
     */
     
    @Override
     public double inventoryValue(){
         double value = 0.0; 
         for (Dog dog : availableDogs) {
             value = value + dog.getPrice();
         }
         for (Cat cat : availableCats) {
             value = value + cat.getPrice();
         }
         for (ExoticPet exotic : availableExoticPets) {
             value = value + exotic.getPrice();
         }
         return value;
     }
     
     /** adds a pet to the various adoption arrayLists
      * @param numOfPets 
      */
     public void addPets(int numOfPets){
        Scanner scnr = new Scanner(System. in);
        for (int i = numOfPets; i>0;i--){
            // prompt user to select pet type
            System.out.println("What kind of pet would you like to add?");
            System.out.println("\t1. Dogs");
            System.out.println("\t2. Cats"); 
            System.out.println("\t3. Exotic Pets");
            
            // user selection
            int petTypeChoice = scnr.nextInt();
            // if user selects wrong choice
            if (petTypeChoice != 1 && petTypeChoice != 2 && petTypeChoice != 3) {
                System.out.println("Invalid Choice");
                i++;
            }
            // if dog is chosen
            else if (petTypeChoice == 1) {
                System.out.println("What is the name of the dog?");
                String name = scnr.next();
                System.out.println("What is the breed of " + name + "?");
                String breed = scnr.next();
                System.out.println("What is the sex of " + name + "?");
                String sex = scnr.next();
                System.out.println("What is the age of " + name + "?");
                int age = scnr.nextInt();
                System.out.println("What is the weight of " + name + "?");
                int weight = scnr.nextInt();
                System.out.println("What is the price of " + name + "?");
                int price = scnr.nextInt();
                Dog dog = new Dog(name,breed,sex,age,weight,getNextMemberID(),price);
                availableDogs.add(dog);
                availablePets.add(dog);
                
            }
            // if cat is chosem
            else if (petTypeChoice == 2) {
                System.out.println("What is the name of the cat?");
                String name = scnr.next();
                System.out.println("What is the breed of " + name + "?");
                String breed = scnr.next();
                System.out.println("What is the sex of " + name + "?");
                String sex = scnr.next();
                System.out.println("What is the age of " + name + "?");
                int age = scnr.nextInt();
                System.out.println("What is the weight of " + name + "?");
                int weight = scnr.nextInt();
                System.out.println("What is the price of " + name + "?");
                int price = scnr.nextInt();
                Cat cat = new Cat(name,breed,sex,age,weight,getNextMemberID(),price);
                availableCats.add(cat);
                availablePets.add(cat);            
            }
            // if exotic pet is chosen
            else if (petTypeChoice == 3) {
                System.out.println("What is the name of the exotic pet?");
                String name = scnr.next();
                System.out.println("What is the species of " + name + "?");
                String species = scnr.next();
                System.out.println("What is the sex of " + name + "?");
                String sex = scnr.next();
                System.out.println("What is the age of " + name + "?");
                int age = scnr.nextInt();
                System.out.println("What is the weight of " + name + "?");
                int weight = scnr.nextInt();
                System.out.println("What is the price of " + name + "?");
                int price = scnr.nextInt();
                ExoticPet exoticPet = new ExoticPet(name,species,sex,age,weight,getNextMemberID(),price);
                availableExoticPets.add(exoticPet);
                availablePets.add(exoticPet);
            }
        }
    }
}

