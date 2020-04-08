
import java.util.Scanner;

public class LotteryTicket{
	private int winnerNumber;
	private Scanner reader;
	
	public LotteryTicket(){		
		this.winnerNumber = 0;
		this.reader = new Scanner(System.in);
		
	}
	
	public void setWinnerNumber(int winnerNumber){		
		while(true){
			if(winnerNumber > 583 || winnerNumber < 0){
				System.out.println("Give number in range 0 to 583");
				winnerNumber = reader.nextInt();
				continue;
			}
			
			break;
		}
		this.winnerNumber = winnerNumber;
		
	}
	
	public int getWinnerNumber(){
		return this.winnerNumber;
		
	}
	
}