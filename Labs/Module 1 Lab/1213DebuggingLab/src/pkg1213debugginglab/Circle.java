/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1213debugginglab;

/**
 *
 * @author DeCristo Franceschini
 */
/*
 * ITSC 1213 
 * The Circle class represents a circle with a radius and color.
 */

public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;

   // The default constructor with no argument.
   // It sets the radius and color to their default value.   
   /** Constructs a new circle whos radius is 1.0 and color is red.
   */
   public Circle() {
      radius = 1.0;
      color = "red";
   }

   // 2nd constructor with given radius and color
   /** Constructs a new circle whos radius is a double r and color is a String clr.
   */
   public Circle(double r, String clr) {
      radius = r;
      color = clr;
   }

   // A public method for retrieving the radius
   /** Returns the radius of the circle.
    * @return The radius
   */
   public double getRadius() {
     return radius;
   }

   // A public method for retrieving the area of circle
   /** Returns the area of the circle.
    * @return The area
   */
   public double getArea() {
     double area = calculateArea();
      return area;
   }

   // A private method for computing the area of circle
   private double calculateArea(){
     return radius*radius*Math.PI;
   }
}
