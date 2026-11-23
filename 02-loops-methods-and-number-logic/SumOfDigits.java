import java.util.Scanner;

public class SumOfDigits{

    public static void main(String[] args){

        System.out.println("Sum of digits of given number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        int sum = DigitSum(num);
        System.out.print("Sum of digits of " + num + " is " + sum);
        sc.close();
    }

    public static int DigitSum(int num){

        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}