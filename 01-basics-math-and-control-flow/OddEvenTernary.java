import java.util.Scanner;

public class OddEvenTernary{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tells whether given number is Odd or Even using Ternary Operator\n");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = num % 2 == 0 ? "Even" : "Odd";

        System.out.print(num + " is an " + result + " number");
        sc.close();
    }
}