import java.util.Scanner;

public class PrimeNumberForLoop{

    public static boolean isPrime(int num){
        for(int i = 2; i < num; i ++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Prime Number Checker using For Loop\n");
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.print(num + " is " + (isPrime(num) ? "Prime" : "Not Prime"));
        sc.close();
    }
}

