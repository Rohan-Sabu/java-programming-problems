import java.util.Scanner;

public class MinimumTernary{

    public int min(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Minimum of two numbers using ternary operator");
        System.out.print("\nEnter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        MinimumTernary m1 = new MinimumTernary();
        
        int result = m1.min(num1, num2);
        System.out.print(result + " is the minimum number");
        sc.close();
    }
}