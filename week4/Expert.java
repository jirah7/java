/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

public class Expert {
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in);
        
        int[][] warehouse = {
            {15, -1, 20},
            {30, 2, 12},
            {40, 10, -1}      
        };
        
        int lowStock = 3;
        int choice; 
        do{
            System.out.println("============================");
            System.out.println("WAREHOUSE INVENTORY");
            System.out.println("1. Show total inventory");
            System.out.println("2. Find low shelf");
            System.out.println("3. Restock a shelf");
            System.out.println("4. Exit");
            System.out.print("Choose (1-4): ");
            choice = input.nextInt();
            
            
            
         switch(choice){
             case 1: 
                 int total = 0;
                    for (int i = 0; i < warehouse.length; i++){
                        for (int j = 0; j < warehouse[i].length; j++){
                            if (warehouse[i][j] == -1){
                                continue;
                            }
                            total += warehouse[i][j];
                        }
                    }
                 System.out.println("Total Inventory: " + total);
                 break;
             case 2: 
                 boolean found = false; 
                 for(int i = 0; i < warehouse.length; i++){
                     for (int j = 0; j < warehouse[i].length; j++){
                         if(warehouse[i][j] != -1 && warehouse[i][j] < lowStock ){
                             System.out.println("First low shelf: row " + i + ", column " + j + " (Count: " + warehouse[i][j] + ")");
                             found = true; 
                             break;
                         }
                     }
                     if (found) {
                         break;
                     }
                 }
                 if (!found) {
                     System.out.println("No critically low shelves");
                 }
                 break;
             case 3:
                 restock (warehouse, input);
                 break;
             case 4:
                 System.out.println("Exit!");
                 break;
             default: 
                 System.out.println("Invalid choice. Choose between (1-4)");
                 break;
         }
        
        } while (choice != 4);
        input.close();
    }
        
    public static void restock(int[][] warehouse, Scanner input){
    System.out.print("Enter row (0-" + (warehouse.length -1)+ "): ");
    int row = input.nextInt();
    while (row < 0 || row >= warehouse.length){
        System.out.print("Invalid row. Enter again: ");
        row = input.nextInt();
    }
    System.out.print("Enter column (0-" + (warehouse[row].length - 1) + "): ");
    int col = input.nextInt();
    while (col < 0 || col >= warehouse[row].length) {
    System.out.print("Invalid column. Enter again: ");
    col = input.nextInt();
    }
    
    if(warehouse[row][col] == -1){
        System.out.println("That shelf is damaged and cannot be restocked");
        return;
    }
    
        System.out.print("Enter amount to add: ");
        int amount = input.nextInt();
        while (amount <= 0){
            System.out.print("Amount must be not be 0. Enter again: ");
            amount = input.nextInt();
        }
        
        warehouse[row][col] += amount;
        System.out.println("Restocked. New count at row " + row + ", column " + col
                + ": " + warehouse[row][col]);
    
    }
  
}
