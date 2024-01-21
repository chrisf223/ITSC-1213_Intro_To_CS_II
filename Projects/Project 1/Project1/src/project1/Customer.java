/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

/**
 *
 * @author chrisf
 */
public class Customer {
    private boolean premiumMember = false; 
    private String customerName = "";
    private int customerNumber = 0;
    private Double purchaseHistory = 0.0;
    private String paymentMethod = "x";
    private boolean payedForMembership = false; 
    
    /** returns the payment status of membership
     * @return payment status
     */ 
    public boolean getPayedForMembership() {
        return premiumMember;
    }
    /** sets the payment status of membership
     * @param t
     */ 
    public void setPayedForMembership(boolean t){
        premiumMember = t;
    }
    /** returns the membership status 
     * @return membership status
     */ 
    public boolean getPremiumMember() {
        return premiumMember;
    }
    /** sets the membership status 
     * @param t
     */ 
    public void setPremiumMember(boolean t){
        premiumMember = t;
    }
    /** returns the customer name 
     * @return customer name
     */ 
    public String getCustomerName(){
        return customerName;
    }
    /** sets the customer name 
     * @param N
     */ 
    public void setCustomerName(String N){
        customerName = N;
    }
    
    /** returns the customer number 
     * @return customer number
     */ 
    public int getCustomerNumber(){
        return customerNumber;
    }
    /** sets the customer number 
     * @param N
     */ 
    public void setCustomerNumber(int N){
        if (N >=0){
            customerNumber = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    
    /** sets the payment method  
     * @param P
     */ 
    public void setPaymentMethod(String P){
        paymentMethod = P; 
    }
    /** returns the payment method 
     * @return payment method 
     */ 
    public String getPaymentMethod(){
        return paymentMethod;
    }
    
    /** updates customer purchase history 
     * @param N 
     */ 
    public void addPurchaseHistory(Double N){
        purchaseHistory = purchaseHistory + N;
    } 
    /** adds a new customer  
     * @param N
     * @param C
     * @param P
     * @param T
     */ 
    public void addCustomer(String N,int C,boolean P,Double T){
        customerName = N;
        customerNumber = C;
        premiumMember = P;
        purchaseHistory = T;
    }  
    /** prints out customer information 
     */ 
    public void printCustomer(){
        System.out.println("Name: " + customerName);
        System.out.println("Number: " + customerNumber);
        System.out.println("Premium Status: " + premiumMember);
        System.out.println("Purchase History: " + purchaseHistory);
        if (premiumMember){
            if (payedForMembership){
                System.out.println("Your membership payment is not due yet.");
            }
            else {
                System.out.println("Your membership payment is due!");
            }
        }

    }
    /** sets the customers name, ID, premium status, and purchase history  
     * @param N
     * @param C
     * @param P
     * @param T
     */ 
    public Customer(String N,int C,boolean P,Double T){
        customerName = N;
        customerNumber = C;
        premiumMember = P;
        purchaseHistory = T;
    }
    
}
