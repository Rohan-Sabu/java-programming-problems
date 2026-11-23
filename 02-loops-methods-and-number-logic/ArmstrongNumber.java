import java.util.Scanner;

public class ArmstrongNumber{

    public static void main(String[] args){

        System.out.println("Checks whether given number is Armstrong or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean armstrong = isArmstrong(num); 
        if (armstrong){
            System.out.print(num + " is Armstrong");
        }
        else{
            System.out.print(num + " is not Armstrong");
        }
        sc.close();

    }

    public static boolean isArmstrong(int num){

        int no = num;
        int digit = countdigit(num);
        int result = 0;
        while (num > 0){
            int rem = num % 10;
            result += pow(rem,digit);
            num /= 10;
        }
        if (result == no){
            return true;
        }
        else{
            return false;
        }
    }

    public static int countdigit(int num){

        if (num == 0){
            return 1;
        }
        int digit = 0;
        while (num > 0){
            digit += 1;
            num /=10;
        }
        return digit;

    }

    public static int pow(int first, int second){

        int result = 1;
        int i = 0;
        while (i < second){
            result *= first;
            i ++;
        }
        return result;
    }
}