/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       
        int score;
      
        System.out.print("Score: ");
        score = input.nextInt();
            
        if(score >= 60){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
              
              
    }
    
}
