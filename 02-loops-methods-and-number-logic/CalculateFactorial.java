import java.util.Scanner;

public class CalculateFactorial{

    public static void main(String [] args){
        System.out.println("Factorial of Given Number");
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        long fact = Factorial(num);
        System.out.print("Factorial of " + num + " is " + fact);
        sc.close();
    }

    public static long Factorial(int num){

        if (num < 2){
            return 1;
        }

        long fact = 1;
        int i = 2;
        while (i <= num){
            fact *= i;
            i ++;
        }
        return fact;
    }
}