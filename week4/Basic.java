/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        
        for (int i = 1; i <= num; i++){
            System.out.println("Number: " + i + " Square: " + (i * i));
        }
    }
    
}
