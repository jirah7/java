/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

public class Advanced {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int size = input.nextInt();
        
        for (int row = 1; row <= size; row++ ){
            for (int column = 1; column <= row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
