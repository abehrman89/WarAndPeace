/*
 * Alexandra Behrman
 * Deck.java
 * Homework1
 */

import java.util.*;

abstract public class Deck {

	protected Card[] deck;
	
	/**
	 * Deck constructor - Creates deck of Card objects and calls makeDeck to populate deck
	 */
	
	public Deck() {
		this.deck = new Card[52];
		makeDeck();
	}
	
	/**
	 * Draws a random card from the deck, then sets that card to null so it cannot be drawn again
	 * @return Card cardDrawn
	 */
	public Card draw() {
		Random rand = new Random();
		int randomCard = rand.nextInt(52);
		
		//if Card object is null, loop Random() until non-null object is found
		while(deck[randomCard] == null) {
			rand = new Random();
			randomCard = rand.nextInt(52);
		}
		
		Card cardDrawn = deck[randomCard];
		deck[randomCard] = null;
		
		return cardDrawn;
	}
	
	public abstract void makeDeck();
	
	public void printDeck() {
		for(Card i : deck) {
			System.out.println(i);
		}
	}
}
