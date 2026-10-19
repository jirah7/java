/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Scanner;

public class Expert {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] names = {"Apol", "Gabriel", "Reyna", "Pedro","Ben"};
        int[][] grades = {
            {90, 85, 92, 89},
            {82, 80, 88, 83},
            {90, 93, 89, 95},
            {90, 85, 92, 89},
            {98, 88, 93, 90}      
        };
        
        Student[] students = new Student[names.length];
        for(int i = 0; i < names.length; i++){
            students[i] = new Student(names[i], grades[i]);
        }
        
        averageRank(students);
        int[] ranks = computerRanks(students);
        printLeaderBoard(students, ranks);
        
        System.out.print("Enter a student name to find their rank: ");
        String target = input.next();
        int rank = findRank(students, ranks, target);
        
        if (rank == -1){
            System.out.println(target + " was not found");
        } else {
            System.out.println(target + " is rank " + rank);
        }
        input.close();
    }
        static void averageRank(Student[] students){
            for (int i = 0; i < students.length - 1; i++){
                for (int j = 0; j < students.length - 1 -i; j++){
                    if (students[j].getAverage() < students[j + 1]. getAverage()){
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    }
                } 
            }
          }
        
            static int[] computerRanks(Student[] sorted){
                int[] ranks = new int [sorted.length];
                ranks[0] = 1;
                for (int i = 1; i < sorted.length; i++){
                    if (sorted[i].getAverage() == sorted[i - 1].getAverage()){
                        ranks[i] = ranks[i - 1];
                    } else {
                        ranks[i] = i + 1; 
                    }
                }
                return ranks;
            }
               
        
        static int findRank(Student[] sorted, int[] ranks, String name) {
                for (int i = 0; i < sorted.length; i++) {
                    if (sorted[i].name.equalsIgnoreCase(name)) {
                        return ranks[i];
                }
            }
          return -1;
         }

        static void printLeaderBoard(Student[] sorted, int[] ranks) {
            System.out.println("=== CLASS 1-2 LEADERBOARD ===");
                System.out.printf("%-6s %-10s %s%n", "Rank", "Name", "Average");
                     for (int i = 0; i < sorted.length; i++) {
                             System.out.printf("%-6d %-10s %.2f%n", ranks[i], sorted[i].name, sorted[i].getAverage());
                        }
                     }
                }

        
    class Student {
        String name; 
        int[] quizzes;
    
        Student(String name, int[] quizzes){
            this.name = name;
            this.quizzes = quizzes;
        }
        double getAverage() {
            int sum = 0;
            for (int i = 0; i < quizzes.length; i++) {
                sum += quizzes[i];
            }
             return (double) sum / quizzes.length;
        }
    
    }