/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;
import java.util.Scanner;

/**
 *
 * @author chrisf
 */
/* The project1 class acts an interface for a bookstore
*/
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Bookstore bookstore = new Bookstore();
        Inventory inventory = new Inventory(150,15.0,200,12.0,450,12.50); 
        int x = 0;
        
        System.out.println("Welcome to our bookstore!");
        while (x == 0) {
                // see what the user wants to do
                System.out.println("*************************************************************************");
                System.out.println("Please select from the following menu of options, by typing a number:");
                System.out.println("\t 1. Complete a purchase");
                System.out.println("\t 2. Register for membership");
                System.out.println("\t 3. Current Inventory");   
                System.out.println("\t 4. Adjust Inventory"); 
                System.out.println("\t 5. Adjust Pricing"); 
                System.out.println("\t 6. Check Membership Status");              
                System.out.println("\t 7. Exit");
                System.out.println("*************************************************************************");

                int num = scnr.nextInt(); 
                switch (num) { 
                    /* Completes a purchase                   
                    */
                    case 1:
                        System.out.print("Do you have a membership with us? Enter 1 for Yes or 2 for No: ");
                        int yOrN = scnr.nextInt();
                        if (yOrN  == 2) {
                            System.out.print("How many DVDs would you like?: ");
                            int DVD = scnr.nextInt();
                            System.out.print("How many CDs would you like?: ");
                            int CD = scnr.nextInt();
                            System.out.print("How many Books would you like?: ");
                            int Book = scnr.nextInt();
                            Order order = new Order(DVD,CD,Book);
                            System.out.println();
                            inventory.setPurchase(DVD,CD,Book);
                            inventory.resizeInventory();
                            Double cost = (inventory.getPriceOfBooks()*Book)+(inventory.getPriceOfCDs()*CD)+(inventory.getPriceOfDVDs()*DVD);
                            inventory.setCostOfPurchase(cost);
                            System.out.println("The total is going to be " + inventory.getCostOfPurchase());
                            System.out.println("Thank you for your purchase!");                            
                        }
                        else if (yOrN == 1)
                        {
                            System.out.print("What is your membership ID number?: ");
                            int ID = scnr.nextInt();
                            System.out.print("How many DVDs would you like?: ");
                            int DVD = scnr.nextInt();
                            System.out.print("How many CDs would you like?: ");
                            int CD = scnr.nextInt();
                            System.out.print("How many Books would you like?: ");
                            int Book = scnr.nextInt();
                            Order order = new Order(DVD,CD,Book);
                            System.out.println();
                            inventory.setPurchase(DVD,CD,Book);
                            inventory.resizeInventory();
                            Double cost = (inventory.getPriceOfBooks()*Book)+(inventory.getPriceOfCDs()*CD)+(inventory.getPriceOfDVDs()*DVD);
                            inventory.setCostOfPurchase(cost);   
                            System.out.println("The total is going to be " + inventory.getCostOfPurchase());
                            bookstore.paymentMethod(ID);       
                            bookstore.addPayment(ID,cost);
                            System.out.println("Thank you for shopping with us!");
                        }
                        break;
                    /* Registers a new member                   
                    */    
                    case 2:
                        System.out.print("What is your name?: ");
                        String customerName = scnr.next(); 
                        bookstore.addCustomer(customerName); 
                         break; 
                    /* Prints out the current inventory                  
                    */     
                    case 3:
                        System.out.println("DVDs: "+inventory.getInventoryOfDVDs());
                        System.out.println("CDs: "+ inventory.getInventoryOfCDs());                     
                        System.out.println("Books: "+inventory.getInventoryOfBooks());   
                        break;
                    /* Adjusts the inventory                   
                    */    
                    case 4:
                        System.out.print("How many DVDs would you like to add?: ");
                        int DVD = scnr.nextInt();
                        System.out.print("How many CDs would you like to add?: ");
                        int CD = scnr.nextInt();
                        System.out.print("How many Books would you like to add?: ");
                        int Book = scnr.nextInt();  
                        inventory.addToInventory(DVD, CD, Book);
                        System.out.println("The inventory is now: ");
                        System.out.println("DVDs: "+inventory.getInventoryOfDVDs());
                        System.out.println("CDs: "+ inventory.getInventoryOfCDs());                     
                        System.out.println("Books: "+inventory.getInventoryOfBooks());   
                        break;
                    /* Adjusts the price of teh DVDs, CDs, and Books                 
                    */
                    case 5:
                        System.out.print("New DVD Price: ");
                        Double D = scnr.nextDouble();
                        inventory.setPriceOfDVDs(D);
                        System.out.print("New CD Price: ");
                        Double C = scnr.nextDouble(); 
                        inventory.setPriceOfCDs(C);
                        System.out.print("New Book Price: ");
                        Double B = scnr.nextDouble();
                        inventory.setPriceOfBooks(B);
                        break;
                    /* Prints out membership information                  
                    */
                    case 6:
                        System.out.print("What is your membership ID?: ");
                        int ID = scnr.nextInt();
                        bookstore.printCustomer(ID);
                        break;
                    /* Exits the interface                   
                    */
                    case 7:
                        x = 1;
                        break;
                    /* Repeats loop in the vent of a typo                  
                    */
                    default:
                        System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");   
                }
        }
                         
    }
    
}
