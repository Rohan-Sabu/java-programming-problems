import java.util.Scanner;

public class SumofOddNumbers{

    public static void main(String [] args){

        System.out.println("Sum of Odd Numbers from 1 to Given Number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = OddSum(num);
        System.out.print("Sum of Odd Number from 1 to " + num + " is " + sum);
        sc.close();
    } 

    public static int OddSum(int num){

        int sum = 0;
        int i = 1;
        while (i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}