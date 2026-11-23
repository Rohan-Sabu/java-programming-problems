import java.util.Scanner;

public class PerimeterOfRectangle{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle in cm: ");
        float l = sc.nextFloat();
        System.out.print("Enter breadth of Rectangle in cm: ");
        float b = sc.nextFloat();
        
        System.out.print("Perimeter of Rectangle is: " + (2 * (l+b)) + " cm");
        sc.close();
    }
}