import java.util.Random;
import java.util.Arrays;
public class CardGame {

	public static void main(String[] args) {
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		String mySuit = " ";
		String yourSuit = " ";
		String drawSuit = " ";
		Random generator = new Random();
		int card = 0;
		int countH = 0;
		int countD = 0;
		int countC = 0;
		int countS = 0;
		boolean winner = false;
		boolean myWin = false;
		boolean yourWin = false;
		
		//Generating hands
		for(int i = 0; i<5; i++) {
			card = 1 + generator.nextInt(52);
			myHand[i]=card;
			System.out.println("My hand: " + myHand[i]);
			
			card = 1+generator.nextInt(52);
			yourHand[i]=card;
			System.out.println("Your hand: " + yourHand[i]);
		} //for
		
		for (int j = 0; j<5; j++) {
			if (myHand[j]>=1 && myHand[j]<=13)
				countH++;
			else if (myHand[j]>=14 && myHand[j]<=26)
				countD++;
			else if (myHand[j]>=27 && myHand[j]<=39)
				countC++;
			else if (myHand[j]>=40 && myHand[j]<=52)
				countS++;			
		} //for
		
		//Setting mySuit
		if(countH>countD && countH>countC && countH>countS)
			mySuit = "Hearts";
		else if (countD>countH && countD>countC && countD>countS)
			mySuit = "Diamonds";
		else if (countC>countD && countC>countH && countC>countS)
			mySuit = "Clubs";
		else if (countS>countD && countS>countC && countS>countH)
			mySuit = "Spades";
		
		countH=0;
		countD=0;
		countC=0;
		countS=0;
		
		for (int j = 0; j<5; j++) {
			if (yourHand[j]>=1 && yourHand[j]<=13)
				countH++;
			else if (yourHand[j]>=14 && yourHand[j]<=26)
				countD++;
			else if (yourHand[j]>=27 && yourHand[j]<=39)
				countC++;
			else if (yourHand[j]>=40 && yourHand[j]<=52)
				countS++;
		}//for
		
		//Setting yourSuit
		if(countH>countD && countH>countC && countH>countS)
			yourSuit = "Hearts";
		else if (countD>countH && countD>countC && countD>countS)
			yourSuit = "Diamonds";
		else if (countC>countD && countC>countH && countC>countS)
			yourSuit = "Clubs";
		else if (countS>countD && countS>countC && countS>countH)
			yourSuit = "Spades";

		System.out.println("My hand has five cards: " + Arrays.toString(myHand));
		System.out.println("Your hand has five cards: " + Arrays.toString(yourHand));
		System.out.println("My suit: " + mySuit);
		System.out.println("Your suit: " + yourSuit);
		
		/*
		 * Start of game play loop code.
		 * Win condition: A player has all 5 cards in their hand matching their suit.
		 */
		
		while(winner=false) {
			
			card = 1 + generator.nextInt(52);
			if (card>=1 && card<=13)
				drawSuit = "Hearts";
			else if (card>=14 && card<=26)
				drawSuit = "Diamonds";
			else if (card>=27 && card<=39)
				drawSuit = "Clubs";
			else if (card>=40 && card<=52)
				drawSuit = "Spades";
			
			if (drawSuit.contentEquals(mySuit))
				/*
				 * check my existing cards. If I don’t have that card # add it to my hand.
				*Add it to my hand by replacing a card that is not in my suit.
				*/
				System.out.println("edit this");
			
			
		} //while
		
	} //main

} //class
