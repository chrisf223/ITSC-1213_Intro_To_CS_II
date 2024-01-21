
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author chrisf
 */
public class Module3Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastFoodKitchen kitchen = new FastFoodKitchen();
        
        //Part A
//        int orderPosition = kitchen.findOrderSeq(2);
//        System.out.println("Using sequential search>> order position is: " + orderPosition);
//        
//        //Part B
//        kitchen.selectionSort();
//        ArrayList<Order> sortedOrders = kitchen.getOrderList();
//        int orderSize = 0; 
//        for (Order order : sortedOrders){
//            orderSize = order.getNumBurgers();
//            System.out.println(order.getOrderNum()+ " has " + orderSize + " burgers.");
//        }

         //Part C
//        kitchen.insertionSort();
//        System.out.println(kitchen);
//        ArrayList<Order> sortedOrders = kitchen.getOrderList();
//        int orderSize = 0; 
//        for (Order order : sortedOrders){
//            orderSize = order.getNumBurgers();
//            System.out.println(order.getOrderNum()+ " has " + orderSize + " burgers.");
//        }
        
        //Part D
        int orderPosition = kitchen.findOrderBin(1);
        System.out.println("Using binary search>> order position is: " + orderPosition);
 
    }
    
}
