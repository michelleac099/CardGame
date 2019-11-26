import java.util.Random;
public class CardGame {

	public static void main(String[] args) {
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		String mySuit = " ";
		String yourSuit = " ";
		Random generator = new Random();
		int card = 0;
		int countH = 0;
		int countD = 0;
		int countC = 0;
		int countS = 0;
		boolean winner = false;
		
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
		
		
		
	} //main

} //class
