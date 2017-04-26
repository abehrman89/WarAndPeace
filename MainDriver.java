/*
 * Alexandra Behrman
 * MainDriver.java
 * Homework1
 */

import java.util.Scanner;

public class MainDriver {

	static final int HANDS = 52;
	
	public static void main(String[] args) {
		
		Scanner cin= new Scanner(System.in);
		
		System.out.print("Enter 1 to play War or 2 to play Peace. ");
		
		int input = cin.nextInt();
		
		//error handling - if user inputs anything other than 1 or 2
		while(input != 1 && input != 2) {
			System.out.println("Incorrect input. Please enter 1 to play War or 2 to play Peace.");
			input = cin.nextInt();
		}
		
		Deck player1;
		Deck player2;
		
		//user chooses to play War (higher card wins)
		if(input == 1) {
			player1 = new WarDeck();
			player2 = new WarDeck();
			System.out.println();
			System.out.println("Now playing War");
			System.out.println();
		}
		else { //user chooses to play Peace (lower card wins)
			player1 = new PeaceDeck();
			player2 = new PeaceDeck();
			System.out.println();
			System.out.println("Now playing Peace");
			System.out.println();;
		}
		
		cin.close();
		
		int player1Score = 0, player2Score = 0;
		Card player1Card, player2Card;
		
		//game play - loops 52 times
		for (int i = 0; i < HANDS; i++) {
			player1Card = player1.draw();
			player2Card = player2.draw();
			
			System.out.println("Player 1 card: " + player1Card.toString());
			System.out.println("Player 2 card: " + player2Card.toString());
		
			//if two cards are equal in value and suit, hand is a draw and no score is incremented
			//if winner returns true - player1 wins, player1Score is incremented
			//if winner returns false - player2 wins, player2Score is incremented
			if (player1Card.value() == player2Card.value() && player1Card.suit() == player2Card.suit()) {
				System.out.println("This hand is a draw.");
				System.out.println();
			}
			else if (player1Card.winner(player2Card) == true) {
				System.out.println("Player 1 wins this hand.");
				System.out.println();
				player1Score++;
			}
			else {
				System.out.println("Player 2 wins this hand.");
				System.out.println();
				player2Score++;
			}	
		}
		
		System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
	}
}
