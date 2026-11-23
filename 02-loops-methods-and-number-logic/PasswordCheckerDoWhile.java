import java.util.Scanner;

public class PasswordCheckerDoWhile{

    public static boolean isValid(String pass){
        return pass.length() >= 6;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pass;
        System.out.println("Password must be atleast 6 characters to be valid\n");
        do{
            System.out.print("Enter password: ");
            pass = sc.next();
        }
        while(!isValid(pass));
        System.out.print("That is a valid password");
        sc.close();
    }
}