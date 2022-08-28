package blackjack;

public class Card {

	private int id;
	private int number;
	private int value;
	private Suit suit;

	private String numberName;

	public Card(int id, int number, int value, Suit suit) {
		this.id = id;
		this.number = number;
		this.value = value;
		this.suit = suit;
		
		numberName = generateNumberName(number);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	public String toString() {
		return numberName + " of " + suit + " = " + value;
	}
	
	public String generateNumberName(int num) {
		
		switch(num) {
		case 1:
			return "Ace";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		case 10:
			return "Ten";
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		default:
			return "King";
		}
	}
}
