import java.util.Scanner;

public class GreatestOfThreeNumbers{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third integer number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.print(num1 + " is the Greatest");
        }
        else if (num2 >= num1 && num2 >= num3){
            System.out.print(num2 + " is the Greatest");          
        }
        else{
            System.out.print(num3 + " is the Greatest");
        }
        sc.close();
    }
}