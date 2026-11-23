import java.util.Scanner;

public class GCD{

    public static void main(String[] args){

        System.out.println("GCD of 2 Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        int result = gcd(first, second);
        System.out.print("GCD of " + first + " and " + second + " is " + result);
        sc.close();
    }

    public static int gcd(int first, int second){

        int gcd = 1;
        int min = least(first,second);
        int i = 2;
        while (i <= min){
            if (first % i == 0 && second % i == 0){
                gcd = i;
            }
            i ++;
        }
        return gcd;
    }

    public static int least (int first, int second){

        if (first < second){
            return first;
        }
        else{
            return second;
        }
    }
}