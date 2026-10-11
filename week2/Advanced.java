/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author User
 */
public class Advanced {
    public static void main(String[] args) {
        double balance = 1000.00;
        
        System.out.println("Starting Balance: " + balance);
        
        balance += 800;
        System.out.println("Active balance: " + balance);
        
        balance *= 1.05;
        System.out.println("With 5% interest: " + balance);
        
        balance += 200; 
        System.out.println("After 200 deposit: " + balance);
        
        int count = 5;
        System.out.println("count++ prints: " + count++);
        System.out.println("count after: " + count);
        
        count = 5;
        System.out.println("++count prints: " + ++count);
        System.out.println("count after: " + count);
    }
}
