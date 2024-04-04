import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attemptsLeft = 10;

        while (attemptsLeft > 0) {
            System.out.println("Guess a number between 1 and 100. You have " + attemptsLeft + " attempts left.");
            int guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("The number is higher than your guess.");
            } else {
                System.out.println("The number is lower than your guess.");
            }

            attemptsLeft--;
        }

        System.out.println("Do you want to play again? (yes/no)");
        String playAgain = scanner.next();

        if (playAgain.equalsIgnoreCase("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
        }

        scanner.close();
    }
}