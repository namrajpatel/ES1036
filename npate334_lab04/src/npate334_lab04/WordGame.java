package npate334_lab04;

import java.util.Scanner;

public class WordGame {
	// public class for the contents of WordGame
	Scanner inputScanner = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
	StringBuilder asteriskWord = new StringBuilder();
	
	String word;
	String userGuess;
	int wordNum = 0, counter = 10;
	char userDecision, chr;
	boolean guess = false;
	
	public WordGame() {
		//constructor for WordGame that will populate the contents defined in the above class and performs actions for the game
		
		System.out.println("Please input a your word");
		word = inputScanner.nextLine();
		
		asteriskWord.append(word);
		
		for (int i = 0; i < asteriskWord.length(); i++) {
			asteriskWord.setCharAt(i, '*');
		}
		
		System.out.println("\n\n\n" + asteriskWord);
		
		do {
			do {
				System.out.println("\nDo you want to guess the word? (y/n)");
				userDecision = inputScanner.next().charAt(0);
				
				if((userDecision != 'y') && (userDecision != 'n')) {
					System.out.println("\nPlease enter either y or n!");
				}
				
			} while (( userDecision != 'y') && (userDecision != 'n'));
			
		
				
			decision(userDecision);
			
			counter--;
			
			if (guess == false) {
			System.out.println("\n\nYou have " + counter + " tries left!" );
			}
			else {
				System.out.println("Dope, you won with " + counter + " tries left!");
			}
			
			
			if (counter == 0) {
				System.out.println("You have run out of tries, you lose!");
			}
				
				
	
		
		} while((counter >0) && (guess == false));

}
	
	public void decision(char userDecision) {
		
		
		switch (userDecision) {
		
		case 'y':
			System.out.println("enter guess: ");
			userGuess = input.nextLine();
			
			if (userGuess.equals(word)) {
				System.out.println("\n\nyay you guessed it!");
				System.out.println(word.toUpperCase());
				guess = true;
				
				
			}
			else {
				System.out.println("you got it wrong ):");
				
			}
		break;
		
		case 'n':
			System.out.println("enter a letter to guess");
			chr = input.next().charAt(0);
			
			for (int i = 0; i < asteriskWord.length(); i++ ) {
				if (word.charAt(i) == chr) {
					asteriskWord.setCharAt(i, chr);
					
				}
				
			}
			
			System.out.println("\n\n" + asteriskWord.toString().toUpperCase());
		}
	}
	
}
