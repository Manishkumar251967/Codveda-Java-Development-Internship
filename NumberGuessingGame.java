import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1;
        int maxAttempts = 7;
        boolean guessedCorrectly = false;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts.");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {

            System.out.print("Attempt " + attempt + ": Enter your guess: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a whole number.");
                sc.next();
                attempt--;
                continue;
            }

            int guess = sc.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Enter a number between 1 and 100.");
                attempt--;
                continue;
            }

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed correctly.");
                guessedCorrectly = true;
                break;
            } else if (guess > secretNumber) {
                System.out.println("Too High! Try a smaller number.");
            } else {
                System.out.println("Too Low! Try a bigger number.");
            }

            System.out.println("Attempts remaining: "
                    + (maxAttempts - attempt));
        }

        if (!guessedCorrectly) {
            System.out.println("Game Over! The number was: " + secretNumber);
        }

        sc.close();
    }
}
