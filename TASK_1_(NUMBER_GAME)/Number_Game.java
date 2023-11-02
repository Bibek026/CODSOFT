// NUMBER GAME

import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAttempts = 0;
        int rounds = 0;
        int roundsWon = 0;
        boolean playAgain = true;
        final int MAX_ATTEMPTS = 10;//(int) (Math.random() * 10); // Maximum number of attempts allowed

        while (playAgain) {
            int myNumber = (int) (Math.random() * 100);
            int attempts = 0;

            do {
                System.out.println("Guess my number: ");
                int userNumber = sc.nextInt();
                attempts++;

                if (userNumber == myNumber) {
                    System.out.println("WOHOO .. CORRECT NUMBER!!");
                    roundsWon++; // Increment rounds won when the user guesses correctly
                    break;
                } else if (attempts >= MAX_ATTEMPTS) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + myNumber);
                    break;
                } else if (userNumber > myNumber) {
                    System.out.println("Your number is too large.");
                } else {
                    System.out.println("Your number is too small.");
                }
            } while (true);

            totalAttempts += attempts;
            rounds++;

            System.out.println("Number of attempts: " + attempts);
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgainInput = sc.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        double averageAttempts = (double) totalAttempts / rounds;

        // Calculate the user's score
        int userScore = roundsWon * 10 - (int) averageAttempts; // You can adjust the formula as needed

        System.out.println("Thanks for playing!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Average atempts per round: " + averageAttempts);
        System.out.println("User Score: " + userScore);
        sc.close();
    }
}
