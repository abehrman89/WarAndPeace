/*
 * Alexandra Behrman
 * PeaceDeck.java
 * Homework1
 */

public class PeaceDeck extends Deck {
	
	/**
	 * PeaceDeck constructor - Creates deck of PeaceCard objects and calls makeDeck to populate deck
	 */
	public PeaceDeck() {
		this.deck = new PeaceCard[52];
		makeDeck();
	}
	
	/**
	 * fills deck with 52 PeaceCard objects
	 * for each suit, creates card of each value
	 */
	public void makeDeck() {
		int index = 0;
		for (CardSuit suit : CardSuit.values()) {
			for (CardValue value : CardValue.values()) {
				deck[index] = new PeaceCard(suit, value);
				index++;
			}
		}
	}

}
