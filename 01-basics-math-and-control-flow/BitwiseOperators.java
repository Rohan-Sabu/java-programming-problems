import java.util.Scanner;

public class BitwiseOperators{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bitwise Calculator");
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 +" & "+ num2 + " is " +(num1 & num2) + "  [AND]");
        System.out.println(num1 +" | "+ num2 + " is " +(num1 | num2) + "  [OR]");
        System.out.println(num1 +" ^ "+ num2 + " is " +(num1 ^ num2) + "  [XOR]");
        System.out.println("~" + num1 + " is " + (~num1) + " and ~" + num2 + " is " + (~num2) + "  [NOT / COMPLEMENT]");
        System.out.println(num1 +" << "+ num2 + " is " +(num1 << num2) + "  [LEFT SHIFT]");
        System.out.println(num1 +" >> "+ num2 + " is " +(num1 >> num2) + "  [RIGHT SHIFT]");
        sc.close();
    }
}