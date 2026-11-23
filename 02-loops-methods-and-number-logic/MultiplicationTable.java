import java.util.Scanner;

public class MultiplicationTable{
    
    public static void PrintTable(int num){

        int i = 1;
        while(i <= 10){
            System.out.println(num + " * " + i + " = " + (num * i));
            i ++;
        }
    }

    public static void main(String [] args){

        System.out.println("Multiplication Table");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        PrintTable(num);
        sc.close();
    }

}