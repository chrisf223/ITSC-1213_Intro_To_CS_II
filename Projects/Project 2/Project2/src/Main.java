/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util. *;

/**
 *
 * @author Adam Whaley and DeCristo Franceschini
 */
/* the Main class acts as a "website" for a pet store 
*/
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System. in); 
        PetStore ps = new PetStore("PetCo");
        System.out.println("**** Welcome to " + ps.getStoreName() + "****");
        
        while (true) { 

            System.out.println("Please select from one of the following menu options");
            System.out.println("\t1. Buy a new pet");
            System.out.println("\t2. Register a new member");
            System.out.println("\t3. Start adoption drive (add new pets)");
            System.out.println("\t4. Check current inventory");
            System.out.println("\t5. Register new pet to Owner profile");
            System.out.println("\t6. Compare Prices");
            System.out.println("\t7. Exit");

            int choice1 = scnr.nextInt();

            switch (choice1) {
                case 1:
                    System.out.println("-----------------------------------");
                    purchase(ps, scnr, new ArrayList<Pet>());
                    System.out.println("-----------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------");
                    registerNewMember(ps, scnr);
                    System.out.println("-----------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------");
                    System.out.print("How many pets would you like to add: ");
                    int numOfPets = scnr.nextInt();
                    ps.addPets(numOfPets);
                    System.out.println("-----------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------");
                    ps.adoptionDrive(ps.getAvailablePets());
                    System.out.println("Total Inventory Value: " + ps.inventoryValue());
                    System.out.println("-----------------------------------");
                    break; 
                case 5: 
                    System.out.println("-----------------------------------");
                    registerNewPet(ps, scnr);
                    break;
                case 6:
                    System.out.println("-----------------------------------");
                    compareTwoPets(ps);
                    System.out.println("-----------------------------------");
                    break;
                case 7:
                    System.out.println("Thanks for visiting!");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
    
    /** method for a customer to complete a purchase
     * @param petStore
     * @param scnr
     * @param cart 
     */
    private static void purchase(PetStore petStore, Scanner scnr, ArrayList<Pet> cart) {
        System.out.println("What type of pet are you here to purchase?");
        System.out.println("\t1. Dogs");
        System.out.println("\t2. Cats"); 
        System.out.println("\t3. Exotic Pets");

        int petTypeChoice = scnr.nextInt();

        // display inventory menu
        int itemNum = 1;
        if (petTypeChoice == 1) {
            ArrayList<Dog> inventory = petStore.getAvailableDogs();
            if (!inventory.isEmpty()) {

                System.out.println("Which of the following dogs would you like to purchase?:");

                for (Dog pet : inventory) {
                    System.out.println(
                        "\t" + itemNum + ". $" + pet.getPrice() + " - " + pet.getBreed() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum++;
                }
                // get user selection for product to add arraylist (cart)
                int choice = scnr.nextInt();
                if (choice <= inventory.size()) {
                    cart.add(inventory.get(choice - 1));
                    //update inventory for this item
                    petStore.removePet("dog", choice - 1);
                    //cart summary
                    System.out.println(
                        "You have " + cart.size() + " items in your cart. Are you done shopping?"
                    );
                    System.out.println("\t1. Yes");
                    System.out.println("\t2. No");

                    int doneShopping = scnr.nextInt();
                    if (doneShopping == 1) {
                        //System.out.println("TO DO - CHEKOUT ");
                        checkout(petStore, scnr, cart);
                    } else if (doneShopping == 2) { // more shopping
                        purchase(petStore, scnr, cart); // recursively call purchase(...) until done
                    } else {
                        System.out.println("Invalid Choice.");
                    }
                } else {
                    System.out.println("Please enter a valid product number. Try again");
                    purchase(petStore, scnr, cart);
                }
            } else {
                System.out.println("Sorry! we currently have no dogs available.");
            }

        }
        if (petTypeChoice == 2) {
            ArrayList<Cat> inventory = petStore.getAvailableCats();
            if (!inventory.isEmpty()) {

                System.out.println("Which of the following cats would you like to purchase?:");

                for (Cat pet : inventory) {
                    System.out.println(
                        "\t" + itemNum + ". $" + pet.getPrice() + " - " + pet.getBreed() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum++;
                }
                // get user selection for product to add arraylist (cart)
                int choice = scnr.nextInt();
                if (choice <= inventory.size()) {
                    cart.add(inventory.get(choice - 1));
                    //update inventory for this item
                    petStore.removePet("cat", choice - 1);
                    //cart summary
                    System.out.println(
                        "You have " + cart.size() + " items in your cart. Are you done shopping?"
                    );
                    System.out.println("\t1. Yes");
                    System.out.println("\t2. No");

                    int doneShopping = scnr.nextInt();
                    if (doneShopping == 1) {
                        //System.out.println("TO DO - CHEKOUT ");
                        checkout(petStore, scnr, cart);
                    } else if (doneShopping == 2) { // more shopping
                        purchase(petStore, scnr, cart); // recursively call purchase(...) until done
                    } else {
                        System.out.println("Invalid Choice.");
                    }
                } else {
                    System.out.println("Please enter a valid product number. Try again");
                    purchase(petStore, scnr, cart);
                }
            } else {
                System.out.println("Sorry! we currently have no cats available.");
            }
        }
        if (petTypeChoice == 3) {
            ArrayList<ExoticPet> inventory = petStore.getAvailableExoticPets();
            if (!inventory.isEmpty()) {

                System.out.println("Which of the following exotic pets would you like to purchase?:");

                for (ExoticPet pet : inventory) {
                    System.out.println(
                        "\t" + itemNum + ". $" + pet.getPrice() + " - " + pet.getSpecies() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum++;
                }
                // get user selection for product to add arraylist (cart)
                int choice = scnr.nextInt();
                if (choice <= inventory.size()) {
                    cart.add(inventory.get(choice - 1));
                    //update inventory for this item
                    petStore.removePet("exotic pet", choice - 1);
                    //cart summary
                    System.out.println(
                        "You have " + cart.size() + " items in your cart. Are you done shopping?"
                    );
                    System.out.println("\t1. Yes");
                    System.out.println("\t2. No");

                    int doneShopping = scnr.nextInt();
                    if (doneShopping == 1) {
                        //System.out.println("TO DO - CHEKOUT ");
                        checkout(petStore, scnr, cart);
                    } else if (doneShopping == 2) { // more shopping
                        purchase(petStore, scnr, cart); // recursively call purchase(...) until done
                    } else {
                        System.out.println("Invalid Choice.");
                    }
                } else {
                    System.out.println("Please enter a valid product number. Try again");
                    purchase(petStore, scnr, cart);
                }
            } else {
                System.out.println("Sorry! we currently have no exotic pets available.");
            }
        }
    }
    
    /** method for a customer to checkout their purchase
     * @param petStore
     * @param scnr
     * @param cart 
     */
    private static void checkout(PetStore petStore, Scanner scnr, ArrayList<Pet> cart) {
        // calculate total
        double total = 0;
        for (Pet pet : cart) {
            total += pet.getPrice();
        }
        System.out.println(
            "Your total comes to " + total + ". \nPlease select which member is making this" +
            " purchase."
        );

        // list members and option to register
        int num = 1;
        for (Member member : petStore.getMemberList()) {
            System.out.println(num + ". " + member.getName());
            num++;
        }
        for (PremiumMember member : petStore.getPremiumMemberList()) {
            System.out.println(num + ". " + member.getName());
            num++;
        }
        System.out.println(num + ". Register a new Member.");

        System.out.println(""); // space line
        int memberSelect = scnr.nextInt();
        Member purchaser = null;
        PremiumMember premiumPurchaser = null;

        if (memberSelect > petStore.getMemberList().size() + petStore.getPremiumMemberList().size() + 1) { // invalid selection
            System.out.println("Invalid Selection");
            checkout(petStore, scnr, cart); // recursive call if valid user input

        } else { // valid selection
            if (memberSelect == (petStore.getMemberList().size() + petStore.getPremiumMemberList().size()) + 1) { // adding a new member
                boolean premium = registerNewMember(petStore, scnr);
                if (premium) {
                    premiumPurchaser = petStore.getPremiumMemberList().get(petStore.getPremiumMemberList().size() - 1);
                    for (Pet pet : cart){
                        premiumPurchaser.addPet(pet);
                    }
                } else {
                    purchaser = petStore.getMemberList().get(petStore.getMemberList().size() - 1);
                    for (Pet pet : cart){
                        purchaser.addPet(pet);
                    }
                }
                for (Pet pet : cart){
                }
            } else if (memberSelect <= (petStore.getMemberList().size())) {
                purchaser = petStore.getMemberList().get(memberSelect - 1);
                for (Pet pet : cart){
                    purchaser.addPet(pet);
                }
            } else { // existing premium member
                premiumPurchaser = petStore.getPremiumMemberList().get(memberSelect - petStore.getMemberList().size() - 1);
                for (Pet pet : cart){
                    premiumPurchaser.addPet(pet);
                }            }

            // check if premium member and fees are due
            if (purchaser == null && premiumPurchaser != null) {
                if( !premiumPurchaser.isDuesPaid()){
                System.out.println(
                    "Premium Membership dues unpaid, $5 will be added to purchase total to cover du" +
                    "es."
                );
                total += 5;
                }
                premiumPurchaser.setDuesPaid(true);
                // update amount of purchases for this member
                premiumPurchaser.setAmountSpent(total);
                // done
                System.out.println("Your purchase total was: " + total);
                System.out.println(
                    "Congrats on your purchase " + premiumPurchaser.getName()
                );

            } else {
                // update amount of purchases for this member
                purchaser.setAmountSpent(total);
                System.out.println("Your purchase total was: " + total);
                System.out.println("Congrats on your purchase " + purchaser.getName());

            }
        }
    }
    
    /** registers a new pet to a member
     * @param petStore
     * @param scnr 
     */
    private static void registerNewPet(PetStore petStore, Scanner scnr){
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
            registerNewPet(petStore, scnr);
        }
        // prompt user to enter pets info
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
            Dog dog = new Dog(name, breed, sex, age, weight);
            addPetTolist(petStore, scnr, dog);
        }
        // prompt user to enter pets info
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
            Cat cat = new Cat(name, breed, sex, age, weight);
            addPetTolist(petStore, scnr, cat);
            }
        // prompt user to enter pets info
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
            ExoticPet exoticPet = new ExoticPet(name, species, sex, age, weight);
            addPetTolist(petStore, scnr, exoticPet);
        }
    }
    
    /** adds a pet to a members arayList
     * @param petStore
     * @param scnr
     * @param pet 
     */
    private static void addPetTolist(PetStore petStore, Scanner scnr, Pet pet){
        int num = 1;
        System.out.println("What member will" + pet.getName() + "be added to?");
        //display list of members
        for (Member member : petStore.getMemberList()) {
            System.out.println(num + ". " + member.getName());
            num++;
        }
        for (PremiumMember member : petStore.getPremiumMemberList()) {
            System.out.println(num + ". " + member.getName());
            num++;
        }
        System.out.println(""); // space line
        int memberSelect = scnr.nextInt(); // users choice of member
        Member purchaser = null;
        PremiumMember premiumPurchaser = null;

        if (memberSelect > petStore.getMemberList().size() + petStore.getPremiumMemberList().size() + 1) { // invalid selection
            System.out.println("Invalid Selection");
            addPetTolist(petStore, scnr, pet); // recursive call if valid user input
        }
        else { // if standard member
            if (memberSelect <= (petStore.getMemberList().size())) {
                purchaser = petStore.getMemberList().get(memberSelect - 1); 
                purchaser.addPet(pet);
                purchaser.displayPets(purchaser);
                
            } 
            else { // if premium member
                premiumPurchaser = petStore.getPremiumMemberList().get(memberSelect - petStore.getMemberList().size() - 1);    
                premiumPurchaser.addPet(pet);
                System.out.println(purchaser.getDogsOwned());
                premiumPurchaser.displayPets(premiumPurchaser);
             }
        }
    }
    
    /** registers a new member
     * @param petStore
     * @param scnr
     * @return 
     */
    private static boolean registerNewMember(PetStore petStore, Scanner scnr) {
        // prompt user to select membership type
        System.out.println("Let's get you registered as a new Member!");
        System.out.println( "Would you like to register as a free-tier or premium member?");
        System.out.println("\t1. Free-tier");
        System.out.println("\t2. Premium");

        // user selection
        int choice1 = scnr.nextInt();
        // if user selects a wrong choice 
        if (choice1 > 2 || choice1 < 1) {
            System.out.println("Invalid choice.");
            registerNewMember(petStore, scnr); // try again

        } else {
            // prompt user for name 
            System.out.println("Please enter your name:");
            scnr.nextLine();
            String name = scnr.nextLine();
             System.out.println("Welcome to our membership program! Thank you for registering.");
            if (choice1 == 1) { // regular membership
                petStore.addNewMember(name, false);
                return false;
            } else { // user entered 2 - premimum membership
                petStore.addNewMember(name, true);
                return true;
            }
        }
        return false;
    }
    
    /** compares the prices of two pets
     * @param petStore 
     */
    private static void compareTwoPets(PetStore petStore){
        int firstPet=1;
        int secondPet=1; 
        Scanner scnr = new Scanner(System.in);
        System.out.println("What type of pet would you like to compare first?");
        System.out.println("\t1. Dogs");
        System.out.println("\t2. Cats"); 
        System.out.println("\t3. Exotic Pets");

        int petTypeChoice1 = scnr.nextInt();

        // display inventory menu
        int itemNum = 1;
        if (petTypeChoice1 == 1) {
            ArrayList<Dog> inventory = petStore.getAvailableDogs();
            if (!inventory.isEmpty()) {
                System.out.println("Which of the following dogs would you like to compare?:");
                for (Dog pet : inventory) {
                    System.out.println(
                        "\t" + itemNum + ". $" + pet.getPrice() + " - " + pet.getBreed() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum++;
                }
                int choice1 = scnr.nextInt();
                firstPet = choice1-1;
                // if invalid choice
                if (choice1 > inventory.size()) {
                    System.out.println("Please enter a valid product number. Try again");
                    compareTwoPets(petStore);             
                }
            }
        }
        if (petTypeChoice1 == 2) {
            ArrayList<Cat> inventory = petStore.getAvailableCats();
            if (!inventory.isEmpty()) {
                System.out.println("Which of the following cats would you like to compare?:");
                for (Cat pet : inventory) {
                    System.out.println(
                        "\t" + itemNum + ". $" + pet.getPrice() + " - " + pet.getBreed() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum++;
                }
                int choice1 = scnr.nextInt();
                firstPet = choice1-1;
                // if invalid choice
                if (choice1 > inventory.size()) {
                    System.out.println("Please enter a valid product number. Try again");
                    compareTwoPets(petStore);             
                }
            }
        }
        if (petTypeChoice1 == 3) {
            ArrayList<ExoticPet> inventory = petStore.getAvailableExoticPets();
            if (!inventory.isEmpty()) {
                System.out.println("Which of the following exotic pets would you like to compare?:");
                for (ExoticPet pet : inventory) {
                    System.out.println(
                        "\t" + itemNum + ". $" + pet.getPrice() + " - " + pet.getSpecies() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum++;
                }
                int choice1 = scnr.nextInt();
                firstPet = choice1-1;
                // if invalid choice
                if (choice1 > inventory.size()) {
                    System.out.println("Please enter a valid product number. Try again");
                    compareTwoPets(petStore);             
                }
            }
        }
        System.out.println("What type of pet would you like to compare second?");
        System.out.println("\t1. Dogs");
        System.out.println("\t2. Cats"); 
        System.out.println("\t3. Exotic Pets");
        int petTypeChoice2 = scnr.nextInt();
        // display inventory menu
        int itemNum1 = 1;
        if (petTypeChoice2 == 1) {
            ArrayList<Dog> inventory = petStore.getAvailableDogs();
            if (!inventory.isEmpty()) {
                System.out.println("Which of the following dogs would you like to compare?:");
                for (Dog pet : inventory) {
                    System.out.println(
                        "\t" + itemNum1 + ". $" + pet.getPrice() + " - " + pet.getBreed() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum1++;
                }
                int choice2 = scnr.nextInt();
                secondPet = choice2-1;
                // if invalid choice
                if (choice2 > inventory.size()) {
                    System.out.println("Please enter a valid product number. Try again");
                    compareTwoPets(petStore);             
                }
            }
        }
        if (petTypeChoice2 == 2) {
            ArrayList<Cat> inventory = petStore.getAvailableCats();
            if (!inventory.isEmpty()) {
                System.out.println("Which of the following cats would you like to compare?:");
                for (Cat pet : inventory) {
                    System.out.println(
                        "\t" + itemNum1 + ". $" + pet.getPrice() + " - " + pet.getBreed() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum1++;
                }
                int choice2 = scnr.nextInt();
                secondPet = choice2-1;
                // if invalid choice
                if (choice2 > inventory.size()) {
                    System.out.println("Please enter a valid product number. Try again");
                    compareTwoPets(petStore);             
                }
            }
        }
        if (petTypeChoice2 == 3) {
            ArrayList<ExoticPet> inventory = petStore.getAvailableExoticPets();
            if (!inventory.isEmpty()) {
                System.out.println("Which of the following exotic pets would you like to compare?:");
                for (ExoticPet pet : inventory) {
                    System.out.println(
                        "\t" + itemNum1 + ". $" + pet.getPrice() + " - " + pet.getSpecies() + "(" + pet.getName() +
                        ")"
                    );
                    itemNum1++;
                }
                int choice2 = scnr.nextInt();
                secondPet = choice2-1;
                // if invalid choice
                if (choice2 > inventory.size()) {
                    System.out.println("Please enter a valid product number. Try again");
                    compareTwoPets(petStore);             
                }
            }
        }  
        // compares the prices of the two pets
        int compare = petStore.getPet(firstPet, petTypeChoice1).compareTo(petStore.getPet(secondPet, petTypeChoice2));
        if (compare == 1){
            System.out.println(petStore.getPet(firstPet,petTypeChoice1).getName() + " is more expensive than " 
                    + petStore.getPet(secondPet,petTypeChoice2).getName() + ".");
        }
        else if (compare == -1){
            System.out.println(petStore.getPet(secondPet,petTypeChoice2).getName() + " is more expensive than " 
                    + petStore.getPet(firstPet,petTypeChoice1).getName() + ".");
        }
        else {
            System.out.println("They are the same price!");
        }
    }
}

