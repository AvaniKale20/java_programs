package Com.Bridge.Oops;

//package com.bridgeit.objectOrientedPrograms;

class DeckOfCards {
	public static void main(String[] args) {
         // we are taking SUITS ARRAY
		String SUITS[] = { "Clubs", "Diamonds", "Hearts", "Spades" }; 
		// WE ARE TAKING RANKS ARRAY.. THERE ARE 13 CARDS IN ONE SUITS
		String RANKS[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		int count1 = 0;
		//LENGTH MEANS WHOLE TOTAL COUNT OF CARDS
		int n = SUITS.length * RANKS.length; 
		// SIZE N=52 IN NEW DECK_ARRAY
		String deck[] = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
				System.out.println(deck[SUITS.length * i + j]);
				count1++;
			}
		}
		System.out.println();
		System.out.println("All cards are= "+count1);
		// shuffle all cards
		System.out.println();
		System.out.println();
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			System.out.println("Random value= "+r);
			// this  is for suffle the cards
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		
		String[][] p = new String[13][4];
		int count = 0;
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
				if (count == deck.length)
					break;
				p[i][j] = deck[count];
				// System.out.println("In p array"+p[i][j]);
				count++;
			}
		}
		int ply = 1;
		while (ply < 5) {
			for (int i = 0; i < 4; i++) {
				System.out.println("\n\nFor Player: " + ply + "\n");
				for (int j = 0; j < 9; j++) {
					System.out.println(p[j][i]);
				}
				ply++;
			}
		}

	}
}
