import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maxRange = 100;
        int numberToGuess = random.nextInt(maxRange) + 1;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and " + maxRange + ".");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + numberToGuess + ".");
        }

        scanner.close();
    }
}
