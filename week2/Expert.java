/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author User
 */
public class Expert {
    public static void main(String[] args) {
        
        int num1 = 2;
        int num2 = 5;
        int num3 = 8;
        int num4 = 29;
        boolean j = true;
        boolean i = false;
        
        // First is arithmetic and relational 
        // Prediction: true because ( num2 * num3 = 40, then 2 + 40 = 42, and 42 > 29)
        System.out.println("Expression 1: " + (num1 + num2 * num3 > num4));
        
        // Second is logical operators without parentheses 
        // Predcition: true because the && sign that a higher precedence than || 
        System.out.println("Expression 2: " + ( j || i && i));
        
        // Third is arithmetic and increment
        // Prediction 3: 8 because num1 will increment first before it multiplies it self to 2 
        // the after multiplication it will just add the incremented num1 and multiplied 2 
        
        System.out.println("Expression 3: " + (num1++ * 2 + num1));

        
     
    }
}
