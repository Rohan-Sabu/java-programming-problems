import java.util.Scanner;

public class IfElse{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.print("You are eligible for driving license");
        }
        else{
            System.out.print("You are not eligible for driving license");
        }
        sc.close();
    }
}