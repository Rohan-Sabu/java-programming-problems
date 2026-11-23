// Create a program - Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator (e.g. High for 
// scores > 80, Moderate for 50-80, Low for < 50)

import java.util.Scanner;

public class StudentScoreTernary{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Student Score Category based on marks\n");
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String result = marks > 80 ? "High" : (marks >= 50 ? "Moderate" : "Low");
        System.out.print("Your score category is " + result);
        sc.close();
    }
}


