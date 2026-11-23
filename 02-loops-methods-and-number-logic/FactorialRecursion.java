import java.util.Scanner;

public class FactorialRecursion{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial of number using recursion");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long result = factorial(num);
        System.out.print("Factorial of " + num + " is " + result);
        sc.close();
    }

    public static long factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * (factorial(num - 1));
    }
}