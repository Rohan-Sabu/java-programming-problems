import java .util.Scanner;

public class CheckEvenOddBitwise{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int num = sc.nextInt();

        if((num & 1) == 1){
            System.out.print(num + " is an Odd Number");
        }
        else{
            System.out.print(num + " is an Even Number");
        }
        sc.close();
    }
}