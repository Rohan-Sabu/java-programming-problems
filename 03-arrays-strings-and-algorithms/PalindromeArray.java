import java.util.Scanner;

public class PalindromeArray{

    public static boolean isPalindrome(int[] arr){
        int i = 0;
        while(i < (arr.length / 2)){
            if(arr[i] != arr[(arr.length - 1) - i]){
            return false;
            }
            i ++;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Checks whether given array is palindrome or not");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        if(size <= 0){
            System.exit(0);
        }
        int[] arr = new int[size];
        int i = 0;
        while(i < arr.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i ++;
        }
        boolean isPalindrome = isPalindrome(arr);
        if(isPalindrome){
            System.out.print("The array is palindrome");
        }
        else{
            System.out.print("The array is not palindrome");
        }
        sc.close();
    }
}