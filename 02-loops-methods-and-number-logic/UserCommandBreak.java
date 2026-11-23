// Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered

import java.util.Scanner;

public class UserCommandBreak{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter command: ");
            String command = sc.next();         
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.print("Successfully exited");
        sc.close();
    }
}