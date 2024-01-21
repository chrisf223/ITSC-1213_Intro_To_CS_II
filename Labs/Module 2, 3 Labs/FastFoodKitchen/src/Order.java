/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chrisf
 */
public class Order {
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false; 
    private int orderNum = 1;
    
    public int getNumHamburgers(){
        return numHamburgers;
    } 
    public void setNumHamburgers(int N){
        if (N >= 0){
        numHamburgers = N;
        }
        else {
        System.out.println("Invalid. Number cannot be negative");
        }
    }
    
    public int getNumCheeseburgers(){
        return numCheeseburgers;
    }    
    public void setCheeseburgers(int N){
        if (N >= 0){
        numCheeseburgers = N;
        }
        else {
        System.out.println("Invalid. Number cannot be negative");
        }
    }
    
    public int getNumVeggieburgers(){
        return numVeggieburgers;
    }     
    public void setVeggieHamburgers(int N){
        if (N >= 0){
        numVeggieburgers = N;
        }
        else {
        System.out.println("Invalid. Number cannot be negative");
        }
    }
    
    public int getNumBurgers(){
        return numHamburgers + numVeggieburgers + numCheeseburgers;
    }
    
    public int getNumSodas(){
        return numSodas;
    }     
    public void setNumSodas(int N){
        if (N >= 0){
        numSodas = N;
        }
        else {
        System.out.println("Invalid. Number cannot be negative");
        }
    }
    
    public boolean isOrderToGo(){
        return orderToGo;
    }
    public void setOrderToGo(String y){
        if (y == "Y") {
            orderToGo = true;
        }
        else if (y == "N") {
            orderToGo = false; 
        }
        else {
            System.out.println("Error! PLease enter Y for yes or N for No");
        }
    }
    
    public int getOrderNum(){
        return orderNum;
    } 
    public void setOrderNum(int N){
        if (N >= 1){
        orderNum = N;
        }
        else {
        System.out.println("Invalid. Number cannot be negative");
        }
    }
    
    public Order(int H,int C,int V,int S,boolean T,int N){
        numHamburgers = H;
        numCheeseburgers = C;
        numVeggieburgers = V;
        numSodas = S;
        orderToGo = T;
        orderNum = N;
    }
    
    
}

