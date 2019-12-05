import java.util.Random;
import java.util.Arrays;
public class CardGame {

	public static void main(String[] args) {
		
		Random generator = new Random();
		int countHeart = 0;
		int countDiamond = 0;
		int countClub = 0;
		int countSpade = 0;
		int countDraw = 0;
		int myDraw = 0;
		int yourDraw = 0;
		String mySuit = null;
		String yourSuit = null;
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		boolean winner = false;
		int mySuitHigh = 0;
		int mySuitLow = 0;
		int yourSuitHigh = 0;
		int yourSuitLow = 0;
		int yourCount = 0;
		int myCount = 0;

		//Assigning card values and determining each player's suit
		for (int a = 0; a < myHand.length; a++) {
			myHand[a] = generator.nextInt(52) + 1;
			if (myHand[a] >= 1 && myHand[a] <= 13) {
				countHeart++;
			}
			else if (myHand[a] >= 14 && myHand[a] <= 26) {
				countDiamond++;
			}
			else if (myHand[a] >= 27 && myHand[a] <= 39) {
				countClub++;
			}
			else if (myHand[a] >= 40 && myHand[a] <= 52) {
				countSpade++;
			}
			if (countHeart >= countDiamond && countHeart >= countClub && countHeart >= countSpade) {
				mySuit = "Hearts";
			}
			else if (countDiamond >= countHeart && countDiamond >= countClub && countDiamond >= countSpade) {
				mySuit = "Diamonds";
			}
			else if (countClub >= countHeart && countClub >= countDiamond && countClub >= countSpade) {
				mySuit = "Clubs";
			}
			else if (countSpade >= countHeart && countSpade >= countClub && countSpade >= countDiamond) {
				mySuit = "Spades";
			}
		}
		for (int a = 0; a < yourHand.length; a++) {
			yourHand[a] = generator.nextInt(52) + 1;
			if (yourHand[a] >= 1 && yourHand[a] <= 13) {
				countHeart++;
			}
			else if (yourHand[a] >= 14 && yourHand[a] <= 26) {
				countDiamond++;
			}
			else if (yourHand[a] >= 27 && yourHand[a] <= 39) {
				countClub++;
			}
			else if (yourHand[a] >= 40 && yourHand[a] <= 52) {
				countSpade++;
			}
			if (countHeart >= countDiamond && countHeart >= countClub && countHeart >= countSpade) {
				yourSuit = "Hearts";
			}
			else if (countDiamond >= countHeart && countDiamond >= countClub && countDiamond >= countSpade) {
				yourSuit = "Diamonds";
			}
			else if (countClub >= countHeart && countClub >= countDiamond && countClub >= countSpade) {
				yourSuit = "Clubs";
			}
			else if (countSpade >= countHeart && countSpade >= countClub && countSpade >= countDiamond) {
				yourSuit = "Spades";
			}
		}
		System.out.println("My hand has five cards : " + Arrays.toString(myHand) );
		
		System.out.println("Your hand has five cards : " + Arrays.toString(yourHand) );
		
		System.out.println("My suit is " + mySuit + ".");
		
		System.out.println("Your suit is " + yourSuit + ".");
		
		
		if (mySuit.equals("Hearts")) 
			mySuitLow = 1; mySuitHigh = 13;
		
		if (mySuit.equals("Diamonds")) 
			mySuitLow = 14; mySuitHigh = 26;
		
		if (mySuit.equals("Clubs")) 
			mySuitLow = 27;mySuitHigh = 39;
		
		if (mySuit.equals("Spades")) 
			mySuitLow = 40;mySuitHigh = 52;
		
		if (yourSuit.equals("Hearts")) 
			yourSuitLow = 0;yourSuitHigh = 13;
		
		if (yourSuit.equals("Diamonds"))
			yourSuitLow = 14;yourSuitHigh = 26;
		
		if (yourSuit.equals("Clubs")) 
			yourSuitLow = 27;yourSuitHigh = 39;
			
		if (yourSuit.equals("Spades"))
			yourSuitLow = 40;yourSuitHigh = 52;

		
		//Game loop
		while (!winner) 
		{
			countDraw++;
			myDraw = generator.nextInt(52) + 1;
			System.out.println("My draw " + countDraw + ": " + myDraw);
			
			yourDraw = generator.nextInt(52) + 1;
			System.out.println("Your draw " + countDraw + ": " + yourDraw);

			
			if (myDraw >= mySuitLow && myDraw <= mySuitHigh) 
			{
				for (int a = 0; a < 5; a++) 
				{
					if (myHand[a] < mySuitLow || myHand[a]> mySuitHigh) 
						{ myHand[a] = myDraw; break; }
				}
						
						
			}
			myCount = 0;
			for (int b = 0; b < 5; b++) 
			{
				if (myHand[b] >= mySuitLow && myHand[b] <= mySuitHigh)
				{
					myCount = myCount + 1;
				}
			}
			System.out.println("\tMy new hand is " + Arrays.toString(myHand));
			if (myCount == 5 )
					{ winner = true; 
			System.out.println("I am the winner."); break;}
			
			
			if (yourDraw >= yourSuitLow && yourDraw <= yourSuitHigh) 
			{
				for (int a = 0; a < 5; a++) 
				{
					if (yourHand[a] < yourSuitLow || yourHand[a]> yourSuitHigh) 
					{yourHand[a] = yourDraw; break;}
				}
						
						
			}
			yourCount = 0;
			for (int b = 0; b < 5; b++) 
			{
				if (yourHand[b] >= yourSuitLow && yourHand[b] <= yourSuitHigh)
				{
					yourCount = yourCount + 1;
				}
			}
			System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
			if (yourCount == 5 )
					{winner=true; 
					System.out.println("You are the winner.");break;}
					}
		
			System.out.println("The game is over.");
		}//main


	}//class