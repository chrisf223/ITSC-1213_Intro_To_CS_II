
import java.util.ArrayList;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chrisf
 */
/*
 * ITSC 1213 
 * The FastFoodKitchen class represents a list of orders at a fast food restaurant.
 */
public class FastFoodKitchen {
    private ArrayList<Order> orderList = new ArrayList<Order>();
    private static int nextOrderNum = 1; 
    
    /** returns the next order number 
     * @return next orders number
     */
    public int getNextOrderNum(){
        return nextOrderNum; 
    }
    
    /** adds 1 to the next order number
     */
    private static void incrementNextOrderNum(){
        nextOrderNum ++;
    }
    
    /** populates orderList with 3 initial orders */
    public FastFoodKitchen(){
        Order order1 = new Order(3,5,4,10,true,1);
        Order order2 = new Order(0,0,3,3,false,2);       
        Order order3 = new Order(1,1,0,2,false,3);
        orderList.add(order1);
        incrementNextOrderNum();
        orderList.add(order2);
        incrementNextOrderNum();
        orderList.add(order3);
        incrementNextOrderNum();        
    }
    
    /** adds an order to orderList
     * @return order number     
     */    
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
        Order order4 = new Order(ham,cheese,veggie,soda,toGo,nextOrderNum);
        orderList.add(order4);
        int x = nextOrderNum;
        incrementNextOrderNum();
        return x;        
    }
    
    /** cancels the most recently placed order
     * @return true if order is canceled and false if not
     */
    public boolean cancelLastOrder(){
        if (orderList.size() > 0){
            nextOrderNum--;
            orderList.remove(nextOrderNum-1);
            return true;
        }
        else {
            return false; 
        }
    }
    
    /** returns the number of orders in orderList
     * @return number of orders 
     */
    public int getNumOrdersPending(){
        return orderList.size();        
    }
    
    public boolean isOrderDone(int orderID){
        for (Order order: orderList){
            if (order.getOrderNum()==orderID){
                return false;
            }
            else {
                return true;
            }
        }
        return false;
    }
    
    public boolean cancelOrder(int orderID){
        for (Order order: orderList){
            if (order.getOrderNum()==orderID){
                orderList.remove(nextOrderNum);
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    
    public int findOrderSeq(int orderID){
        for (int i = 0; i < orderList.size();i++) {
         if (orderList.get(i).getOrderNum()==orderID){
             return i; 
         }
        }
     
     return -1;
      
    }
    
    public void selectionSort(){
       for (int i = 0; i < orderList.size();i++) {
           int minIndex = i;
           
           for (int k = i + 1; k < orderList.size(); k++) {
               if (orderList.get(k).getNumBurgers()<orderList.get(minIndex).getNumBurgers()){
                   minIndex = k; 
               }
            }
           Order temp = orderList.get(i);
           orderList.set(i,orderList.get(minIndex));
           orderList.set(minIndex,temp);
           
         }
    }
    
    public ArrayList<Order> getOrderList() {
        return orderList;
    }  
    
    public void insertionSort(){
        for (int j = 1; j < orderList.size();j++){
            Order temp = orderList.get(j);
            int possibleIndex = j;
            while(possibleIndex > 0 && temp.getNumBurgers() < orderList.get(possibleIndex -1).getNumBurgers()){
                orderList.set(possibleIndex,orderList.get(possibleIndex-1));
                possibleIndex--; 
            }
            orderList.set(possibleIndex,temp);
        }
    }
    
    public int findOrderBin(int orderID){
        int left = 0;
        int right = orderList.size();
        while (left <= right){
            int middle = (left + right)/2;
            if (orderID < orderList.get(middle).getOrderNum()){
                right = middle - 1; 
            }
            else if (orderID > orderList.get(middle).getOrderNum()){
                left = middle + 1;              
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
