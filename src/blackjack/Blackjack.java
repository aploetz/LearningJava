package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Blackjack {

	public static void main(String[] args) {
		// initiate deck
		List<Card> deck = new ArrayList<Card>();
		int cardNum = 0;
		
		for (int suitNum = 0; suitNum < 4; suitNum ++) {
			Suit suit = getSuit(suitNum);
			
			for (int number = 1; number < 14; number++) {
				
				int value = number;
				if (number > 10) {
					value = 10;
				}
				
				// create card
				Card card = new Card(cardNum, number, value, suit);
				deck.add(card);
				
				// increment cardNum
				cardNum++;
				
				// print card
				// System.out.println(card);
				// System.out.println("size of deck == " + deck.size());
			}
		}
		
		List<Card> shuffledDeck = shuffle(deck);
		
		for (Card card : shuffledDeck) {
			System.out.println(card);
		}
	}
	
	private static List<Card> shuffle(List<Card> deck) {
		System.out.print("Shuffling");
		List<Card> returnVal = new ArrayList<Card>();
		//Set<Integer> shuffled = new HashSet<Integer>();
		
		Random random = new Random();
		
		while (deck.size() > 1) {
			// gen ordinal from the max size of the current deck.
			// will decrease in size with each shuffle
			int ordinal = random.nextInt(deck.size());
			
			// when we draw a new card's index:
				// add the card to the returnVal deck
				// add it to the shuffled set so that we don't shuffle that one again
				// remove it from the original deck
			returnVal.add(deck.get(ordinal));
			deck.remove(ordinal);
				
			System.out.print(".");
		}
		
		// move last card
		returnVal.add(deck.get(0));
		System.out.println(".");
		
		return returnVal;
	}
	
	private static Suit getSuit(int num) {
		
		switch(num) {
		case 0:
			return Suit.Clubs;
		case 1:
			return Suit.Diamonds;
		case 2:
			return Suit.Hearts;
		case 3:
			return Suit.Spades;
		default:
			return null;
		}
	}

}
