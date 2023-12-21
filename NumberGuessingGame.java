import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between " + lowerBound + " and " + upperBound);

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                score += (maxAttempts - attempt + 1) * 10; // Increase score based on remaining attempts
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }

            if (attempt == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: "
                        + generatedNumber);
            }
        }

        System.out.println("Your score: " + score);
        scanner.close();
    }
}