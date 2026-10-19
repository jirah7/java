/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Arrays;
import java.util.Scanner;

public class Advanced {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] scores = {80, 85, 77, 75, 73, 89,90, 95};
        
        int target;
        int index = -1;
        
        System.out.println("{80, 85, 77, 75, 73, 89,90, 95}");
        System.out.print("Choose a number above to find the index: ");
        target = input.nextInt();
        
        for(int i = 0; i < scores.length; i++){
            if(scores[i] == target){
                index = i;
                break; // the break here is to stop at the first match 
            }
        }
        
        if (index != -1){
            System.out.println("Target " + target + " found at index " + index);         
        } else {
            System.out.println("Target: " + target + " was not found");
        }
        
        // sorting a copy so the original array will stay the same
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);
        
        System.out.println("Original: " + Arrays.toString(scores));
        System.out.println("Sorted: " + Arrays.toString(sortedScores));
        
    }
}
