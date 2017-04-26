/*
 * Alexandra Behrman
 * Card.java
 * Homework1
 */

abstract public class Card {

	protected CardSuit suit;
	protected CardValue value;
	
	
	public CardValue value() {
		return value;
	}
	
	public CardSuit suit() {
		return suit;
	}
	public String toString() {
		
		return value + " of " + suit;
	}
	
	public abstract boolean winner(Card c);
}
