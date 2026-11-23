import java.util.Scanner;

public class PalindromeNumber{

    public static void main(String[] main){        
        System.out.println("Checks whether given number is Palindrome or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)){
            System.out.print(num + " is Palindrome");
        }
        else{
            System.out.print(num + " is not Palindrome");
        }
        sc.close();
    }

    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }

    public static int reverse(int num){
        int rev = 0;
        while (num > 0){
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }
        return rev;
    }
}