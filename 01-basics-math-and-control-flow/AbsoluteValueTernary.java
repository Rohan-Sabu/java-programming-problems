import java.util.Scanner;

public class AbsoluteValueTernary{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gives Absolute Value of given number\n");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = num >= 0 ? num : -num;

        System.out.print("Absolute value is " + result);
        sc.close();
    }
}