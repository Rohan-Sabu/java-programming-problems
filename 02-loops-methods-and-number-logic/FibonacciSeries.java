import java.util.Scanner;

public class FibonacciSeries{

    public static void main(String[] args){

        System.out.println("Fibonacci Series upto given number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Fibonacci Series: ");
        fibonacci(num);
        sc.close();
    }

    public static void fibonacci(int num){

        int first = 0, second = 1;
        if (num < 0) return;
        if (num == 0){
            System.out.print("0 ");
            return;
        } 
        System.out.print(first + " " + second + " ");
        while ((first + second) <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}