/*
 * Alexandra Behrman
 * WarDeck.java
 * Homework1
 */

public class WarDeck extends Deck {
	
	/**
	 * WarDeck constructor - Creates deck of WarCard objects and calls makeDeck to populate deck
	 */
	public WarDeck() {
		this.deck = new WarCard[52];
		makeDeck();
	}
	
	/**
	 * fills deck with 52 WarCard objects
	 * for each suit, creates card of each value
	 */
	public void makeDeck() {
		int index = 0;
		for (CardSuit suit : CardSuit.values()) {
			for (CardValue value : CardValue.values()) {
				deck[index] = new WarCard(suit, value);
				index++;
			}
		}
	}
	
}
