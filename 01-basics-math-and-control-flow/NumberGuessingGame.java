import java.util.Scanner;

public class NumberGuessingGame {

    int random;

    // Constructor: Generates a random number between 1 and 100
    NumberGuessingGame() {
        random = (int) (Math.random() * 100) + 1;
    }

    /**
     * @param guessNumber the number that player guessed
     * @return Negative if the guessed number is smaller,
     *         0 if the guessed number is correct,
     *         Positive if the guessed number is higher
     */
    
    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberGuessingGame game = new NumberGuessingGame();
        
        System.out.println("Welcome to the number guessing game! Guess the number between 1 and 100\n");
        
        int guessNumber;
        int result;
        
        do {
            System.out.print("Guess the number: ");
            guessNumber = input.nextInt();
            result = game.guess(guessNumber);
            
            if (result == 0) {
                System.out.println("Congrats, your guess is correct!");
            } 
            else if (result < 0) {
                System.out.println("Please Guess Higher!");
            } 
            else {
                System.out.println("Please Guess Lower!");
            }
            
        } while (result != 0);
        
        input.close();
    }
}