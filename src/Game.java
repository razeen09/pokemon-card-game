import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int option;
		
		System.out.print("Key in the name for player 1: ");
		String player1 = scanner.nextLine();
		System.out.print("Key in the name for player 2: ");
		String player2 = scanner.nextLine();
		
		//System.out.println("Player 1 is: " + player1 + " and player 2 is: " + player2);
		
		System.out.println("Choose option: ");
		System.out.println("   Option 1: Start game");
		System.out.println("   Option 2: Display top 10 scores");
		
		System.out.println("");
		
		System.out.print("Option: "); // todo: change from println to print to place cursor on the right in the same line
		option = scanner.nextInt();
		 
		// if (option = 1) -> display cards--method
		// else -> display top 10--method
		if (option == 1) {
			
			// Draw cards for player 1
			System.out.println("Player 1's cards:");	
			drawCardsOne();
			
			// Draw cards for player 2
			System.out.println("Player 2's cards:");	
			drawCardsTwo(); 
			
			System.out.println("Player 1:");
			System.out.println("	Option 1: Attack");
			System.out.println("	Option 2: Recharge");
			System.out.println("	Option 3: Train");
			System.out.print("	Choose the option: ");
			
			option = scanner.nextInt();
			
			if (option == 1) {
				attack();
			}
			
			else if (option == 2) {
				recharge();
			}
			else if (option == 3) {
				train();
			}
		}
		
		
	}
	
	// Draw card method for player 1                                                                                                                  
	public static void drawCardsOne() {

		Card card1 = new Card("Attacking");
		Card card2 = new Card("Attacking");
		Card card3 = new Card("Defending");
		Card card4 = new Card();
		Card card5 = new Card();
		Card card6 = new Card();
		
		
		System.out.println("");
		
		System.out.println(" +-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------+");
		System.out.println(" | No. | Type      | Stage | XP | HP | Energy | Energy colour | Attack points | Resisitance Points | Status    |");
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 1   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card1.getType(), card1.getStage(), card1.getXP(), card1.getHP(), card1.getEnergy(), card1.getEnergyCol(), card1.getAP(), card1.getRP(), card1.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 2   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card2.getType(), card2.getStage(), card2.getXP(), card2.getHP(), card2.getEnergy(), card2.getEnergyCol(), card2.getAP(), card2.getRP(), card2.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 3   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card3.getType(), card3.getStage(), card3.getXP(), card3.getHP(), card3.getEnergy(), card3.getEnergyCol(), card3.getAP(), card3.getRP(), card3.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 4   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card4.getType(), card4.getStage(), card4.getXP(), card4.getHP(), card4.getEnergy(), card4.getEnergyCol(), card4.getAP(), card4.getRP(), card4.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 5   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card5.getType(), card5.getStage(), card5.getXP(), card5.getHP(), card5.getEnergy(), card5.getEnergyCol(), card5.getAP(), card5.getRP(), card5.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 6   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card6.getType(), card6.getStage(), card6.getXP(), card6.getHP(), card6.getEnergy(), card6.getEnergyCol(), card6.getAP(), card6.getRP(), card6.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		
		System.out.println("");
	}
	
	// Draw card method for player 2
	public static void drawCardsTwo() {

		Card card1 = new Card("Attacking");
		Card card2 = new Card();
		Card card3 = new Card();
		Card card4 = new Card("Attacking");
		Card card5 = new Card();
		Card card6 = new Card("Defending");
		
		System.out.println("");
		
		System.out.println(" +-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------+");
		System.out.println(" | No. | Type      | Stage | XP | HP | Energy | Energy colour | Attack points | Resisitance Points | Status    |");
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 1   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card1.getType(), card1.getStage(), card1.getXP(), card1.getHP(), card1.getEnergy(), card1.getEnergyCol(), card1.getAP(), card1.getRP(), card1.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 2   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card2.getType(), card2.getStage(), card2.getXP(), card2.getHP(), card2.getEnergy(), card2.getEnergyCol(), card2.getAP(), card2.getRP(), card2.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 3   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card3.getType(), card3.getStage(), card3.getXP(), card3.getHP(), card3.getEnergy(), card3.getEnergyCol(), card3.getAP(), card3.getRP(), card3.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 4   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card4.getType(), card4.getStage(), card4.getXP(), card4.getHP(), card4.getEnergy(), card4.getEnergyCol(), card4.getAP(), card4.getRP(), card4.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 5   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card5.getType(), card5.getStage(), card5.getXP(), card5.getHP(), card5.getEnergy(), card5.getEnergyCol(), card5.getAP(), card5.getRP(), card5.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		System.out.printf(" | 6   | %s | %d     | %d  | %d | %d     | %s        | %d             | %d                  | %s  |\n", card6.getType(), card6.getStage(), card6.getXP(), card6.getHP(), card6.getEnergy(), card6.getEnergyCol(), card6.getAP(), card6.getRP(), card6.status());
		System.out.println(" |-----+-----------+-------+----+----+--------+---------------+---------------+--------------------+-----------|");
		
		System.out.println("");
	}
	
	// Attack method
	public static void attack() {
		System.out.println("ATTTAACKK!!");
	}
	
	// Recharge method
	public static void recharge() {
		System.out.println("recharging........");
	}
	
	// Train method
	public static void train() {
		System.out.println("training...!!");
	}
	
	
	

}
