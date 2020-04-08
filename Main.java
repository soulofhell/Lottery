

public class Main{
	
	public static void main(String[] args){
		
		Lottery chance = new Lottery();
		
		chance.createLotteryTicket(583);
		chance.askClientForNumber();
		chance.checkWinner();
		//System.out.println(chance.getWinnerNumber());
		
	}
}