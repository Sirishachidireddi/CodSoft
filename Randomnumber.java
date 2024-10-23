import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalRounds = 0;
        int totalAttempts = 0;
        String playAgain = "y";
        
        while (playAgain.equalsIgnoreCase("y")) {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean correctGuess = false;
            
            System.out.println("\nGuess the number between 1 and 100!");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (guess == number) {
                    System.out.println("Correct! You've guessed the number " + number + " in " + attempts + " attempts.");
                    correctGuess = true;
                    totalRounds++;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            
            if (!correctGuess) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + number + ".");
            }
            
            System.out.print("\nDo you want to play another round? (y/n): ");
            playAgain = scanner.next();
        }

        System.out.println("\nGame over! You played " + totalRounds + " rounds and used a total of " + totalAttempts + " attempts.");
        if (totalRounds > 0) {
            System.out.printf("Your average attempts per round: %.2f\n", (double) totalAttempts / totalRounds);
        } else {
            System.out.println("No rounds completed.");
        }

        scanner.close();
    }
}