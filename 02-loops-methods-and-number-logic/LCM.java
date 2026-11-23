import java.util.Scanner;

public class LCM{

    public static void main(String[] args){

        System.out.println("LCM of 2 Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int result = lcm(num1, num2);
        System.out.print("LCM of " + num1 + " and " + num2 + " is " + result);
        sc.close();
    }

    public static int lcm(int first, int second){

        int i = 1;
        while (true){
            int num = first * i;
            if (num % second == 0){
                return num;
            }
            i ++;
        }
    }

}