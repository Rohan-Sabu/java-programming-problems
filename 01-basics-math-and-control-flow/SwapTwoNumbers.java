import java.util.Scanner;
public class SwapTwoNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter value of num2: ");
        int num2=sc.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.print("After swap, value of num1 is " + num1 + " and num2 is " + num2 );
    }
}