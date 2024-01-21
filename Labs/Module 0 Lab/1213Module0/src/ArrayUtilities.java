/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chrisf
 */
public class ArrayUtilities {
    public static void main(String[] args) {
        
        //Lab 1 Part C
        String message = "Welcome to ITSC1213 ArrayUtilities Program!";
        int n = 5;
        
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
        
        int[] numArray = {0,2,4,6,17,20,4};
        System.out.println("The sum of this array is: " + sum(numArray));
        System.out.println("The largest number in this array is: " + findMax(numArray));
        System.out.println("The first odd number in this array is: " + findFirstOdd(numArray));
    }
    
    public static int sum(int[] numbers) {
        
        int total = 0;
        
        for (int num : numbers) {
            total += num;
        }
        
        return total;
    }
    
    public static int findMax(int[] numbers) {
        
        int max = 0;
                
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
        
    }
    
    public static int findFirstOdd(int[] numbers) {
        
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i]%2 ==1) {
                return numbers[i];
            }
            i++;
        }
        return 0;       
    }

}
