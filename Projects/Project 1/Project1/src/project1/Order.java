/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

/**
 *
 * @author Chris
 */
/* The order class represents an order at a bookstore
*/
public class Order {
    private int numDVDs = 0;
    private int numCDs = 0;
    private int numBooks = 0;
    
    /** returns the number of DVDs to be purchased
    @return number of DVDs to be purchased
    */
    public int getNumDVDs() {
        return numDVDs;
    }
    /** sets the number of DVDs to be purchased
    *@param N
    */
    public void setNumDVDs(int N){
        if (N >=0){
            numDVDs = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    /** returns the number of CDs to be purchased
    @return number of CDs to be purchased
    */
    public int getNumCDs() {
        return numCDs;
    } 
    /** sets the number of CDs to be purchased
    *@param N
    */
    public void setNumCDs(int N){
        if (N >=0){
            numCDs = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    /** returns the number of books to be purchased
    @return number of books to be purchased
    */
    public int getNumBooks() {
        return numBooks;
    }   
    /** sets the number of CDs to be purchased
    *@param N
    */
    public void setNumBooks(int N){
        if (N >=0){
            numBooks = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }  
    /** sets the number of DVDs, CDs, and books 
    * @param D
    * @param C
    * @param B
    */
    public Order (int D, int C, int B){
        numDVDs = D;
        numCDs = C;
        numBooks = B;
    }
      

}
