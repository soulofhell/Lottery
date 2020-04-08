

import java.util.ArrayList;
import java.util.List;

public class Lottery{
	private LotteryTicket lotteryTicket;
	private Guesser client;	
	private ArrayList<String> parsedWinnerNumber;
	private String winnerNumber;
	private String clientGuessedNumber;
	private boolean won;
	
	public Lottery(){
		this.lotteryTicket = new LotteryTicket();
		this.client = new Guesser();
		this.parsedWinnerNumber = parseWinnerNumber();
		this.clientGuessedNumber = "";
		this.winnerNumber = "";
		this.won = false;
		
	}
//=======================================================

	

	public void createLotteryTicket(int coso){
		this.winnerNumber = coso + "";
		this.lotteryTicket.setWinnerNumber(coso);
		
	}
	
	public void askClientForNumber(){
		if(this.winnerNumber.isEmpty()){
			System.out.println("You have to create the ticket with 'createLotteryTicket()' first");
			return;
		}
		this.client.guess(this.lotteryTicket);
				
		//this.clientGuessedNumber = "" + client.getGuessedNumber();
		this.clientGuessedNumber = "" + 8;
				
	}
	
	public void checkWinner(){
		this.firstPrice();
		if(this.won){return;}
		this.secondPrice();
		if(this.won){return;}
		this.thirdPrice();
		
		/* if(!this.won){
			System.out.println("You won nothing :b");
			
		} */
	}
	
	
	
	//=======================Utility methods==============
	
	private ArrayList<String> parseWinnerNumber(){
		ArrayList<String> Str = new ArrayList<String>();
		String temp1 = this.winnerNumber;
		
		String temp = "";
		
		for(int x = 0; x < temp1.length() ;x++){
			temp = "" + temp1.charAt(x);
			
			Str.add(temp);
		}
		
		return Str;
	}	
	
	
	private void firstPrice(){
		if (this.clientGuessedNumber.equals(this.winnerNumber)){
			this.won = true;
			System.out.println("You have won 900$!!!!");			
		}
		
	}
	
	private void secondPrice(){
		String str1 = "";
		String str2 = "";
		
		for(int x = 0; x < this.winnerNumber.length(); x++){
			if(x == 2){
				break;
			}
			str1 += this.winnerNumber.charAt(x);			
		}
		
		for(int x = 1; x < this.winnerNumber.length(); x++){			
			str2 += this.winnerNumber.charAt(x);			
		}
		
		if(this.clientGuessedNumber.equals(str1) || this.clientGuessedNumber.equals(str2)){	
			this.won = true;
			System.out.println("You have won 180$!!!!");	
		}
		
	}
	
	private void thirdPrice(){
		for(String cosa: this.parsedWinnerNumber){
			if(this.clientGuessedNumber.equals(cosa)){
				this.won = true;
				System.out.println("You have won 8$");	
			}
			
		}
		
	}
	
	
	
	
}