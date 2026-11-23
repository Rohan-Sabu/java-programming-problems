import java.util.Scanner;

public class CheckLeapYear{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Leap Year Evaluator");
        System.out.print("Enter the year: ");
        int y = sc.nextInt();

        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)){
            System.out.print(y + " is a Leap Year");
        }
        else{
            System.out.print(y + " is not a Leap Year");
        }
        sc.close();
    }
}