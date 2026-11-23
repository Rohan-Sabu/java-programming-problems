import java.util.Scanner;

public class CheckPrime{

    public static void main(String[] args){

        System.out.println("Checks whether given number is a Prime number or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean prime = isPrime(num);
        if (prime){
            System.out.print(num + " is a Prime number");
        }
        else{
            System.out.print(num + " is not a Prime Number");
        }
        sc.close();
    }

    public static boolean isPrime(int num){

        if (num <= 1){
            return false;
        }

        int i = 2;
        while (i < num){
            if (num % i == 0){
                return false;
            }
            i ++;
        }
        return true;
    }
}