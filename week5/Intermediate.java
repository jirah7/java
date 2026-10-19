/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;


public class Intermediate {
    public static void main(String[] args) {
        
        int[] scores = {80, 85, 77, 75, 73, 89,90, 95};
        
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
             
            if(scores[i] > highest){
                highest = scores[i];
                }
                if(scores[i] < lowest){
                    lowest = scores[i];
                }
            
            
        }
        
        double average = (double) sum / scores.length;
            
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
            
        
    }
}
