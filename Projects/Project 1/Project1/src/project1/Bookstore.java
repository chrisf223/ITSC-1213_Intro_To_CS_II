/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
/* The Bookstore class represents a list of customers at a bookstore
*/

public class Bookstore {
    Scanner scnr = new Scanner(System.in);
    private ArrayList<Customer> customerList = new ArrayList<Customer>();
    private static int nextCustomerNum = 1;
      
    /** populates Bookstore with 3 initial customers */
    public Bookstore(){
        Customer customer1 = new Customer("Sam Winchester",1,true,97.0);
        incrementNextCustomerNum();
        customerList.add(customer1);
        Customer customer2 = new Customer("Dean Winchester",2,false,13.0);
        incrementNextCustomerNum();
        customerList.add(customer2);
        Customer customer3 = new Customer("Castiel",3,true,111.0);
        incrementNextCustomerNum();
        customerList.add(customer3);
    }
    
    /** returns the next customer number 
     * @return next customers number
     */
    public int getNextCustomerNum(){
        return nextCustomerNum; 
    }
    /** adds 1 to the next order number
     */
    public static void incrementNextCustomerNum(){
        nextCustomerNum ++;
    }
    
    /** adds a customer to customerList
     * @return customer number
     * @param name
     */ 
    public int addCustomer(String name){
          Scanner sc = new Scanner(System.in);
          boolean premium = true; 
          System.out.print("Would you like to purchase a premium membership for just $5 a month? Enter 1 for Yes or 2 for No: ");
          int yesOrNo = sc.nextInt();
          if (yesOrNo == 1){
              premium = true; 
          }
          else {
              premium = false; 
          }
          
          Customer customer4 = new Customer(name,nextCustomerNum,premium,0.0);
          customerList.add(customer4);
          int x = nextCustomerNum;
          System.out.println("Your membership ID is: " + x);
          if (premium){             
            System.out.print("Would you like to pay the membership fee now? Enter 1 for Yes or 2 for No: ");
            int y = scnr.nextInt();
            if (y==1){
              for (Customer customer : customerList){  
                if (customer.getCustomerNumber() == x){
                    customer.setPayedForMembership(true);
                    }
                }
            }
          }
          incrementNextCustomerNum();
          return x; 
    }
    
    /** returns the size of customerList
     * @return customerList size    
     */ 
    public int getNumOfMembers(){
        return customerList.size();
    }
    /** sets a members payment method
     * @param customerID   
     */ 
    public void paymentMethod(int customerID){
        for (Customer customer : customerList){ 
            int y = customerID; 
            if (customer.getCustomerNumber() == y){
                if (customer.getPremiumMember()){
                    if (customer.getPaymentMethod() == "x"){ 
                        System.out.println("How would you like to pay?: ");
                        String pay = scnr.next();
                        customer.setPaymentMethod(pay);
                    }
                    else {
                        System.out.println("Would you like to pay with " + customer.getPaymentMethod() + " again? Enter 1 for Yes or 2 for No: ");
                        int n = scnr.nextInt();
                        if (n == 2){
                            System.out.println("How would you like to pay?: ");
                            String pay = scnr.next();
                            customer.setPaymentMethod(pay);
                        }
                    }
                }
            }
        }
        
    }
    
    /** updates a members purchase history
     * @param customerID
     * @param purchase
     */ 
    public void addPayment(int customerID, Double purchase){
        for (Customer customer : customerList){
            int y = customerID; 
            if (customer.getCustomerNumber() == y){
                customer.addPurchaseHistory(purchase);
            }
        }
    }
    
    /** prints out customer information 
     * @param customerID
     */ 
    public void printCustomer(int customerID){
        for (Customer customer : customerList){
            int y = customerID; 
            if (customer.getCustomerNumber() == y){
                customer.printCustomer();
            }
        }
     }
    

}

