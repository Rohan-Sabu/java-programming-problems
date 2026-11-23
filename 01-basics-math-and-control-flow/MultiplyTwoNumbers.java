import java.util.Scanner;

public class MultiplyTwoNumbers{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        System.out.print("Product of " + num1 + " and " + num2 + " is " + (num1 * num2));
        sc.close();
    }
   
}