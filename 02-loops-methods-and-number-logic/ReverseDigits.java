import java.util.Scanner;

public class ReverseDigits{

    public static void main(String[] args){
        System.out.println("Reverses the digits of a given number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = Reverse(num);
        System.out.print("After reversing digits, new number is " + result);
        sc.close();
    }

    public static int Reverse(int num){

        int rev = 0;
        while (num > 0){
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }
        return rev;
    }
}