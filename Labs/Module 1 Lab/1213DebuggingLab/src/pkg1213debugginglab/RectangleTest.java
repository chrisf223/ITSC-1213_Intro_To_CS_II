/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1213debugginglab;
import java.awt.Rectangle;
/**
 *
 * @author DeCristo Franceschini
 */

//Part A
//1. It is located in the awt package
//2. To use the rectangle package i need to type import java.awt.Rectangle 
//3. 7 constructors
//4. Should be 
//  Rectangle r = new Rectangle();
//  “Hello” should be an int not a String 



public class RectangleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(10,10,40,30);
        Rectangle box2 = new Rectangle(100,50);
        box1.setLocation(20,20);
        box2.resize(50,30);
        System.out.println("box1 properties: "+box1);
        Rectangle box3 = box1.union(box2);
        System.out.println("The width and heiht of box3 is: " + box3.getWidth()+", "+box3.getHeight());
        System.out.println("The area of box3 is: " + box3.getWidth()*box3.getHeight());
        
        
        System.out.println("box1 properties: "+box1);
        System.out.println("box2 properties: "+box2);
        System.out.println("box3 properties: " + box3);

        
    }
    
}
