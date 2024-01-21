/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;

/**
 *
 * @author Chris
 */
/* The inventory class represents the inventory of a bookstore.
*/

public class Inventory {
    private int numDVDs = 0;
    private Double priceOfDVDs = 0.0; 
    private int inventoryOfDVDs = 0;    
    private int numCDs = 0;
    private Double priceOfCDs = 0.0;
    private int inventoryOfCDs = 0;    
    private int numBooks = 0;
    private Double priceOfBooks = 0.0; 
    private int inventoryOfBooks = 0;
    private Double costOfPurchase = 0.0;
    
    /** returns the number of DVDs that are being purchased
     * @return number of DVDs to be purchased
     */
    public int getNumDVDs() {
        return numDVDs;
    }
    /** sets the number of DVDs that are being purchased
     * @param N
     */
    public void setNumDVDs(int N){
        if (N >=0){ 
            numDVDs = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    /** returns the price of DVDs 
     * @return DVD price
     */
    public Double getPriceOfDVDs(){
        return priceOfDVDs;
    }
    /** sets the price of DVDs
     * @param N
     */
    public void setPriceOfDVDs(Double N){
        if (N >=0){
            priceOfDVDs = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    /** returns the inventory of DVDs
     * @return DVD inventory 
     */
    public int getInventoryOfDVDs() {
        return inventoryOfDVDs;
    }
    /** sets the inventory of DVDs
     * @param N
     */
    public void setInventoryOfDVDs(int N){
        if (N >=0){
            inventoryOfDVDs = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    /** resizes the DVDs inventory
     */
    public void resizeDVDInventory() {
        inventoryOfDVDs = inventoryOfDVDs - numDVDs; 
    }
    
    /** returns the number of CDs that are being purchased
     * @return number of CDs to be purchased
     */
    public int getNumCDs() {
        return numCDs;
    }  
    /** sets the number of CDs that are being purchased
     * @param N
     */
    public void setNumCDs(int N){
        if (N >=0){
            numCDs = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    /** returns the price of CDs
     * @return CD price
     */
    public Double getPriceOfCDs(){
        return priceOfCDs;
    }
    /** sets the price of CDs
     * @param N
     */
    public void setPriceOfCDs(Double N){
        if (N >=0){
            priceOfCDs = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    /** returns the inventory of CDs
     * @return CD inventory
     */
    public int getInventoryOfCDs() {
        return inventoryOfCDs;
    }
    /** sets the inventory of CDs
     * @param N
     */
    public void setInventoryOfCDs(int N){
        if (N >=0){
            inventoryOfCDs = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    /** resizes the CDs inventory
     */
    public void resizeCDInventory() {
        inventoryOfCDs = inventoryOfCDs - numCDs; 
    }
    
    /** returns the number of Books that are being purchased
     * @return number of Books to be purchased
     */
    public int getNumBooks() {
        return numBooks;
    }    
    /** sets the number of Books that are being purchased
     * @param N
     */
    public void setNumBooks(int N){
        if (N >=0){
            numBooks = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    /** returns the price of Books
     * @return Book price
     */
    public Double getPriceOfBooks(){
        return priceOfBooks;
    }
    /** sets the price of Books
     * @param N
     */
    public void setPriceOfBooks(Double N){
        if (N >=0){
            priceOfBooks = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    /** returns the inventory of Books
     * @return Book inventory
     */
    public int getInventoryOfBooks() {
        return inventoryOfBooks;
    }
    /** sets the inventory of Books
     * @param N
     */
    public void setInventoryOfBooks(int N){
        if (N >=0){
            inventoryOfBooks = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    /** resizes the inventory of Books
     */
    public void resizeBookInventory() {
        inventoryOfBooks = inventoryOfBooks - numBooks; 
    }
    /** resizes the inventory 
     */
    public void resizeInventory() {
        inventoryOfBooks = inventoryOfBooks - numBooks; 
        inventoryOfCDs = inventoryOfCDs - numCDs; 
        inventoryOfDVDs = inventoryOfDVDs - numDVDs; 
    }
    /** adds DVDs, CDs, and Books to the inventory
     * @param D
     * @param C
     * @param B 
     */
    public void addToInventory(int D,int C,int B){
        if (D >=0){
            inventoryOfDVDs = inventoryOfDVDs+D;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
        if (C >=0){
            inventoryOfCDs = inventoryOfCDs+C;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
        if (B >=0){
            inventoryOfBooks = inventoryOfBooks+B;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    
    /** returns the cost of purchase
     * @return cost of purchase
     */
    public Double getCostOfPurchase() {
        return costOfPurchase;
    }
    /** sets the cost of purchase
     * @param N
     */
    public void setCostOfPurchase(Double N){
        if (N >=0){
            costOfPurchase = N;
        }
        else {
            System.out.println("Invalid. Number cannot be negative");
        }
    }
    
    /** sets the purchase
     * @param D
     * @param C
     * @param B
     */
    public void setPurchase(int D, int C, int B){
        numDVDs = D;
        numCDs = C;
        numBooks = B;
    }
    /** sets the price and cost of CDs,DVDs, and books
     * @param DI
     * @param DP
     * @param CI
     * @param CP 
     * @param BI
     * @param BP
     */
    public Inventory(int DI, Double DP, int CI, Double CP,  int BI, Double BP ){
        priceOfDVDs = DP; 
        inventoryOfDVDs = DI; 
        priceOfCDs = CP; 
        inventoryOfCDs = CI; 
        priceOfBooks = BP; 
        inventoryOfBooks = BI; 
    }
}
