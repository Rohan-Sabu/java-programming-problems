// Create a program to print the month of the year based on a number (1-12) input by the user

import java.util.Scanner;

public class MonthSwitch{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Month Mapping\n");
        System.out.print("Enter month number: ");
        int num = sc.nextInt();
        System.out.print("The month is " + month(num));
        sc.close();
    }

    public static String month(int num){
        return switch(num){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
    }
}