/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        
        int total = 0;
        
        System.out.print("Enter a positive number (-1 stop): ");
        int num1 = input.nextInt();
        
        while (num1 != -1){
            total+=num1;
            System.out.print("Enter next number: ");
            num1 = input.nextInt();
            
        }
        System.out.println("Total: " + total);
    }
}
