import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of Triangle in cm: ");
        float b = sc.nextFloat();
        System.out.print("Enter Height of Triangle in cm: ");
        float h = sc.nextFloat();

        // Area of triangle is 0.5 * base * height

        System.out.print("Area of Triangle is: " + (0.5 * b * h) + " cm2");
        sc.close();
    }
}