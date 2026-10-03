/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author User
 */
public class Intermediate {
    public static void main(String[] args) {
        
        int quantity = 3;
        double unitPrice = 39.99;
        String storeName = "Tindahan";
        double totalCost = quantity * unitPrice;
        
        
        System.out.println("Store: " + storeName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
        
        /* total cost should not  be declared as an int  because int can only
        store whole numbers, since it is a store most stores use cents or decimals
        so its important to use double so the cents wont be disregarded when 
        computing
        */
    }
}
