/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;
        
public class Expert {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String correctUserName = "Jirah";
        int correctPin = 1216;
        double balance = 200000.00;
        String tier;
        double percent;
        double limit;
        double fee; 
        double charge; 
        double amount;

        
        System.out.print("Enter Username: ");
        String userName = input.next();
        
        System.out.print("Enter 4-digit PIN: ");
        int pin = input.nextInt();
        
        System.out.print("Enter withdrawal amount: ");
        amount = input.nextDouble();
        
        if (userName.equals(correctUserName)){
            if (pin == correctPin){
                if (balance >= 100000){
                    tier = "Platinum";
                } else if (balance >= 50000){
                    tier = "Gold";
                } else if (balance >= 10000){
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }
                
        switch (tier) {
            case "Platinum":
                percent = 0;
                limit = 50000;
                break;
            case "Gold": 
                percent = 5;
                limit = 25000;
                break;
            case "Silver": 
                percent = 10;
                limit = 15000;
                break;
            case "Bronze": 
                percent = 15; 
                limit = 10000;
                break; 
            default: 
                percent = 0;
                limit = 0;
                break;
        }        
        
            fee = amount * percent/100;
            charge = amount + fee; 
            if (charge <= balance){
                if (amount <= limit) {
                    System.out.println("APPROVED");
                } else {
                    System.out.println("DENY: Exceeds Daily Limit");
                }
            } else {
                System.out.println("DENY: Insufficient Balance");
            }
            
            } else {
                System.out.println("DENIED: WRONG PIN");
            }
            
        } else {
            System.out.println("DENIED: WRONG USERNAME");
        }
        
        
    }
}
