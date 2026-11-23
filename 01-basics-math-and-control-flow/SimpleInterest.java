import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount Rs");
        float p = sc.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        float r = sc.nextFloat();
        System.out.print("Enter Time Period in years: ");
        float t = sc.nextFloat();

        //Simple Interest = (p * r * t) / 100

        System.out.print("The Simple Interest is Rs " + ((p * r * t)/100));
        sc.close();
    }
}