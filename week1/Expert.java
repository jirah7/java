/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author User
 */
public class Expert {
    public static void main(String[] args) {
        
        byte num =  127; // A byte can only hold -128 to 127. Adding 1 to 127 goes past the limit
        num++; 
        System.out.println("byte: " + num);
        
        String name1 = new String ("Jirah");
        String name2 = new String ("Jirah");
        String name3 = "Jirah"; 

         /* == checks if two variables point to the same object in memory
         .equals() checks if the text is the same.*/
        System.out.println("name1  == name2: " + (name1 == name2));
        System.out.println("name1 == name3: "  + (name1 ==  name3));
        System.out.println("name2 == name3: " + (name2 == name3));
        System.out.println("name1.equals(name2): " + name1.equals(name2));
        System.out.println("name1.equals(name3): " + name1.equals(name3));
        System.out.println("name2.equals(name3): " + name2.equals(name3));
        
        String[] sports = {"basketball", "badminton", "volleyball"};
        String[] sports2 = sports;   
        
        System.out.println("\nBefore Modification");
        System.out.println("Sports[1]: " + sports[0]);
        System.out.println("Sports[2]: " + sports2[0]);
        
        sports2 [1] = "badminton"; 
        System.out.println("\nAfter Modicication");
        System.out.println("Sports: " + sports[1]);
        System.out.println("Sports: " + sports[1]);
    }
}
