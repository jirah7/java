/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 6000 = 15% discount 
        // 3000 = 10% discount
        // 1000 = 5% discount
        // below 500 = 0% discount
        
        double amount; 
        double discount;
        double total;
        
        System.out.print("Enter Amount: ");
        amount = input.nextDouble();
        
        if(amount >= 6000){
        discount = 15;
        } else if (amount >= 3000){
        discount = 10;
        } else if (amount >= 1000){
        discount = 5;
        } else {
        discount = 0;
        }
        
        total = amount - (amount * discount /100);
        
        System.out.println("Your discount is: " + discount+"%");
        System.out.println("Total: " + total);
        
    }
}
