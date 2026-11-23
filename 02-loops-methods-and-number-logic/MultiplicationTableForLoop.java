import java.util.Scanner;

public class MultiplicationTableForLoop{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplication Table of any number using For Loop");
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i ++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }
        sc.close();
    }
}