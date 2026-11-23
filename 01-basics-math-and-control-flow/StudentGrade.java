import java.util.Scanner;

public class StudentGrade{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Result Percentage: ");
        float r = sc.nextFloat();

        if (r >= 90){
            System.out.print("A Grade");
        }
        else if (r >= 75){
            System.out.print("B Grade");
        }
        else if(r >= 60){
            System.out.print("C Grade");
        }
        else if(r >= 30){
            System.out.print("D Grade");
        }
        else {
            System.out.print("F Grade");
        }
        sc.close();
    }
}