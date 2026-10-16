/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

public class Advanced {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String userName = "Jirah";
        String password = "Javier";
        boolean locked = false;
        
        System.out.print("Enter Username: ");
        userName = input.next(); 
        
        System.out.print("Enter Password: ");
        password = input.next();
        
        if("Jirah".equals(userName)){
            if("Javier".equals(password)){
                if(!locked){
                    System.out.println("Login Success");// if all requirements are met the username and password are correct and the locked is on false so on the if state it will be true because it is "!locked"
                } else {
                    System.out.println("Account is locked"); // if I change locked variable to "true" and both username and password the output will display "Account Blocked"
                }
            } else {
                System.out.println("Wrong password"); // if I entered a different password this will be the ouput 
            } 
        } else {
            System.out.println("Wrong username"); // if I entered different username this will be the ouput 
        }
             
     
    }
}
