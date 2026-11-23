import java.util.Scanner;

public class ReturnTypeMethod {

    static Scanner sc = new Scanner(System.in);

    public static void greet() {
        System.out.println("Welcome to Addition Calculator");
    }

    public static int ReadNumber() {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static int Sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        greet();

        int num1 = ReadNumber();
        int num2 = ReadNumber();

        int sum = Sum(num1, num2);

        System.out.print("Sum = " + sum);
    }
}