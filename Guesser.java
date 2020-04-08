

import java.util.Random;

public class Guesser{
	private int guessedNumber;
	private Random rand;
	
	public Guesser(){
		this.guessedNumber = 0;		
		this.rand = new Random();
	}
	
//==========================================

	public void guess(LotteryTicket lotteryTicket){
				
		this.guessedNumber = this.rand.nextInt(lotteryTicket.getWinnerNumber() +1);
				
		
	}
	
	public int getGuessedNumber(){
		return this.guessedNumber;
		
	}
	
}