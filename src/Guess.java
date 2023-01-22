import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// Random number generation
		Random rnd = new Random();
		int x = rnd.nextInt(10)+1;
		
		// A counter to keep track of the user's incorrect guesses
		int wrongGuessCount = 0;
		
		// Scanner class to get user's input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a Number between 1 and 10");
		int guess = scanner.nextInt();
		
		// Repeatedly ask for a guess until tey guess correctly
		while (guess != x) {
			wrongGuessCount++;
			System.out.println("You guessed, " + guess + ". This wasn't the number. Try again");
			guess = scanner.nextInt();
		}
		
		// If statement here is unnecessary as this code cannot be reached until while loop evaluates to false (i.e. the correct number gets guessed)
//		if (guess == x) {
			System.out.println("You guessed correctly, the Number was: " + x);
			System.out.println("Your total number of incorrect guesses was: "+ wrongGuessCount);
//			} 	
		scanner.close();
	}
}
