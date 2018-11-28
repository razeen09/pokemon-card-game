import java.util.ArrayList;
import java.util.Random;

public class Player {

	String playerName;
	int gameCount;
	
	ArrayList<Card> cardsList = new ArrayList<Card>();
	
	
	public Player(String playerName) {
		this.playerName = playerName;
		
		for ( int cNum = 1; cNum < 7; cNum++ ) { // 6 times  // adds 6 cards to players Pokelist (Cards) arraylist
			if ( cNum < 4 ) {
				if ( cNum < 3 ) {
					cardsList.add( new Attacking( cNum ) );
				}
				else {
					cardsList.add( new Defending( cNum ) );
				}

			}
			else {
				cardsList.add( randCard( cNum ) );
			}
		}		
	}
	
	public Card randCard( int cNum ) {
		Random randy = new Random();
		int randNum = randy.nextInt( 3 );
		Card card;
		
		if ( randNum == 0) {
			card = new Attacking( cNum );
		}
		else if ( randNum == 1 ){
			card = new Defending( cNum );
		}
		else {
			card = new Fairy( cNum ); 
		}
		return card;
	}


	public String getName() {
		
		return playerName;
	}


	public void drawCards() {

		System.out.printf("%-3s | %-10s | %-5s | %-10s | %-9s | %-6s | %-12s | %-12s | %-16s | %-6s\n", "No.", "Type", "Stage", "Experience", "Hit Point", "Energy", "Energy Color", "Attack Point", "Resistance Point", "Status");
		System.out.println("----+------------+-------+------------+-----------+--------+--------------+--------------+------------------+---------+");
		for (int i = 0; i < cardsList.size(); i++) {			
			System.out.printf("%-3d | %-10s | %-5d | %-10d | %-9d | %-6d | %-12s | %-12s | %-16s | %-6s\n", 
					cardsList.get(i).getCardNum(), 
					cardsList.get(i).getClass().getSimpleName(), 
					cardsList.get(i).getStage(), 
					cardsList.get(i).getXP(), 
					cardsList.get(i).getHP(), 
					cardsList.get(i).getEnergy(), 
					cardsList.get(i).getEnergyCol(), 
					cardsList.get(i).getAPString(), 
					cardsList.get(i).getRPString(), 
					cardsList.get(i).getStatus());
		}
		System.out.println();
	}

	

}
