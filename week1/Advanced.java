/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author User
 */
public class Advanced {
    public static void main(String[] args) {
    
    double centimeters = 287.7; 
    
    int wholemeters = (int) (centimeters / 100);
    double remaining = centimeters - (wholemeters * 100);
    
        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole meters: " + wholemeters);
        System.out.println("Remaining: "  + remaining );
        
        
        System.out.println("\nImplicit Widening");    
    int smallNum = 7; 
    double widened = smallNum; 
        System.out.println("Integer: " + smallNum);
        System.out.println("Becomes double: " + widened);
        
         System.out.println("\nExplicit Narrowing");
    double decimalNum = 10.99;
    int narrowed = (int) decimalNum;
        System.out.println("Double: " + decimalNum);
        System.out.println("Becomes int: " + narrowed);
        
    }
}
