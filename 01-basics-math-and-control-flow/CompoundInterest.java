import java.util.Scanner;

public class CompoundInterest{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount Rs");
        float p = sc.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        float r = sc.nextFloat();
        System.out.print("Enter Time Period: ");
        float t = sc.nextFloat();

        //Compound Interest = p * [(1 + r/100)^t - 1]
        double compint = p * (Math.pow((1 + r/100),t) - 1);
        System.out.print("Compound Interest is Rs" + compint);
        sc.close();
    }
}