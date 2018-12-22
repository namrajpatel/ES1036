package npate334_lab06;

class Card{
	private int denomination1;
	private char suit1;
	
	public Card(int denomination, char suit) {
	
		denomination1 = denomination;
		suit1 = suit;
		
	}
	
	public String face() {
		if (denomination1 == 1) {
			return ("A" + suit1);
		}
		else if(denomination1 == 11) {
			return ("J" + suit1);
		}
		else if (denomination1 == 12) {
			return ("Q" + suit1);
		}
		else if (denomination1 == 13) {
			return ("K" + suit1);
		}
		else {
			return (Integer.toString(denomination1) + suit1);
		}	
	}
}

class Deck{
	public Card cards[] = new Card[52];

	private char suits[] = new char[4];
	private int denominations = 13;
	
		
	public Deck() {
		int counter = 0;
		suits[0] = 'S';
		suits[1] = 'D';
		suits[2] = 'C';
		suits[3] = 'H';

		for(int i = 0; i < suits.length; i++) {
			for(int j = 1; j <= denominations; j++, counter++) {
				
				cards[counter] = new Card(j, suits[i]);
				
				}
			}
		}
		
	public void printCards() {
		int counter = 0;
		
		for(int i = 0; i < cards.length; i++, counter++) {
		
			if (counter % 13 == 0) {
				System.out.print("\n");
			}
			
			System.out.print(cards[i].face());
			System.out.print(", ");
		}
	}
}

public class npate334_lab06_q3 {

	public static void main(String[] args) {

		Deck cardDeck = new Deck();
		cardDeck.printCards();
	}
}







