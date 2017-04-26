/*
 * Alexandra Behrman
 * PeaceCard.java
 * Homework1
 */

public class PeaceCard extends Card {
	
	/**
	 * PeaceCard constructor - creates new Card object for deck
	 * @param suit
	 * @param value
	 */
	public PeaceCard(CardSuit suit, CardValue value) {
		this.suit = suit;
		this.value = value;
	}
	
	/**
	 * method to determine winner of hand
	 * if first card value (methodValue) is lower than argument, returns true
	 * if methodValue is equal to argument - if suit of first card (methodSuit) is lower, returns true
	 * else returns false (argument is lower in value or suit)
	 * @param c
	 * @return true or false
	 */
	public  boolean winner(Card c) {
		CardValue methodValue = this.value();
		
		if(methodValue.compareTo(c.value()) < 0){
			return true;
		}
		else if(methodValue == c.value()){
			CardSuit methodSuit = this.suit();
			if(methodSuit.compareTo(c.suit()) < 0) {
				return true;
			}
		}
		return false;
	}
}
