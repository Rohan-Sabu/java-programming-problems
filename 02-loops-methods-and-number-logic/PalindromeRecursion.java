import java.util.Scanner;

public class PalindromeRecursion{

    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lastpos = str.length() - 1;
        if(str.charAt(0) != str.charAt(lastpos)){
            return false;
        }
        String newstr = str.substring(1, lastpos);  //here, 1 will be counted, but lastpos will be excluded
        return isPalindrome(newstr);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Palindrome checker using Recursion\n");
        System.out.print("Enter any string: ");
        String str = sc.next();
        System.out.print("Your string is " + (isPalindrome(str) ? "Palindrome" : "Not Palindrome"));
        sc.close();
    }
}