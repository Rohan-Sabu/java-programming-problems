import java.util.Scanner;

public class StringManipulation{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("String Concatination and converting the result to uppercase\n");
        System.out.print("Enter your first name: ");
        String first = sc.next();
        System.out.print("Enter your last name: ");
        String last = sc.next();
        System.out.print("Hi, ".concat(first).concat(" ").concat(last).toUpperCase());
        sc.close();
    }
}