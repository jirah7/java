/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;

/**
 *
 * @author User
 */
public class Basic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int no1 = 17;
        int no2 = 5; 
        
        int sum = no1 + no2;
        int difference = no1 - no2;
        int product = no1 * no2;
        int quotient = no1 / no2;
        int modulo = no1 % no2;
        
        System.out.println("The sum of 17 + 5 is: " + sum );
        System.out.println("The difference between 17 - 5 is: " + difference);
        System.out.println("The product of 17 x 5 is: " + product);
        System.out.println("The quotient of 17 / 5 is: " + quotient);
        System.out.println("The modulo of 17 % 5 is: " + modulo);
        
        // +, - and * works normally with the negative numbers
        // / and % behave differently: integer division cuts off the decimal cuts off the decimal toward zero
    }
    
}
