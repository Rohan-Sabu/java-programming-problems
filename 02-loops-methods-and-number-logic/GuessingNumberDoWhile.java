import java.util.Scanner;

public class GuessingNumberDoWhile{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guessing Number Game using Do While\n");
        int num = 5;
        int guess;
        do{
            System.out.print("Guess the number between 0 to 10: ");
            guess = sc.nextInt();
        }
        while(num != guess);
        System.out.print("Well done, You have guessed the number correctly");
        sc.close();
    }
}