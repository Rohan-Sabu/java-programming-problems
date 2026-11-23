import java.util.Scanner;

public class StarWhileLoop{
    public static void starPattern(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines for star pattern: ");
        int num = sc.nextInt();

        int row = 0;
        while(row < num){
            System.out.print("*");

            int i=0;
            while(i < row){
                System.out.print(" *");
                i++;
            }
            System.out.println(); 
            row++;         
        }
        sc.close();
    }

    public static void main(String[] args){
        starPattern();
    }
}