import java.util.Scanner;
import java.util.Random;

public class guessinggame { 
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int attempts = 0;
        int maxAttempts =10;
        int secretNumber = rand.nextInt(100)+1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("I'm thinking of a number between 1 and  100.\n" + "Can you guess what it is?\n");
        
        while (attempts < maxAttempts){
            attempts++;
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();
            
            if (userGuess == secretNumber) {
                System.out.println("\nCongratulations! You guessed correctly!");
                System.out.println("\nThe number I was thinking of was "+secretNumber);
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("\nYour guess is too low. Try again.");
                } else {
                    System.out.println("\nYour guess is too high. Try again.");
                }
             
            // Additional challenge: Make the game playable indefinitely until the player decides to quit.
            System.out.print("\nWould you like to play again? Type 'yes' or 'no': ");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")){
                System.out.println("\nThanks for playing Guessing Game! Goodbye!");
                break;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("\nSorry, you've reached the maximum number of attempts.");
            System.out.println("The correct number was " + secretNumber);
        }
        System.out.println("\nYour score:");
        System.out.println("Total attempts made: " + attempts);

        sc.close();
    }
}