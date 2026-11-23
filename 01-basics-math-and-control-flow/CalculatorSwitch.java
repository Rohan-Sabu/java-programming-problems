import java.util.Scanner;

public class CalculatorSwitch{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator\n");
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter operation (+, -, *, /) : ");
        String op = sc.next();

        float result = switch(op){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0.0f;
        };
        sc.close();

        System.out.print("Result is " + result);
    }
}