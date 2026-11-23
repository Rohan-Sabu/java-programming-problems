import java.util.Scanner;
public class UserInput{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name=obj.nextLine();
        System.out.print("Welcome "+name+ " to Java");
    }
}