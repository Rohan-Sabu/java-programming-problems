import java.util.Scanner;

public class FibonacciRecursion{

    public static int fibonacci(int position){
        if(position == 1){
            return 0;
        }
        if(position == 2){
            return 1;
        }
        return fibonacci(position - 1) + fibonacci(position - 2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series upto given number of elements using Recursion\n");
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i ++){
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}