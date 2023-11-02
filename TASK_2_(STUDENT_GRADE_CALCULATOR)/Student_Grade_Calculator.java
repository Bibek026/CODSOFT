//TASK-02:- STUDENT GRADE CALCULATOR

import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//input the nuber of subject
        System.out.print("Enter the number of subjects: ");
        int Sub = sc.nextInt();

        int total_marks = 0;

        // Input marks for each subject and calculate the total marks
        for (int i = 0; i <Sub; i++) {
            System.out.print("Enter marks (out of 100) for subject " + (i+1) + ": ");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid mark");
                i--;
            }
            else{
                total_marks += marks;
            }
        }
        

        // Calculate the average percentage
        double average = (double) total_marks/Sub;

        // Calculate the Grade
        String grade;

        if(average >=90){
            grade = "O";
        }
        else if(average >=80){
            grade = "E";
        }
        else if(average >=70){
            grade = "A";
        }
        else if(average >=60){
            grade = "B"; 
        }
        else if(average >=50){
            grade = "C";    
        }
         else if(average >=40){
            grade = "D";
         }
        else{
            grade = "F"; 
        }
        // Display the results
        System.out.println("Total Marks of "+Sub+" Subjects:" + total_marks);
        System.out.println("Average Percentage is: " + average+ "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
