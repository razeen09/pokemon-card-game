import java.util.Scanner;

public class Game {
	static Scanner scanner = new Scanner(System.in);
	
	static Player player1;
	static Player player2;

	public static void main(String[] args) {
		
		int option;
		
		System.out.print("Key in the name for player 1: ");
		player1 = new Player(scanner.nextLine());
		
		System.out.print("Key in the name for player 2: ");
		player2 = new Player(scanner.nextLine());

		
		//System.out.println("Player 1 is: " + player1 + " and player 2 is: " + player2);
		
		System.out.println("Choose option: ");
		System.out.println("   Option 1: Start game");
		System.out.println("   Option 2: Display top 10 scores");
		
		System.out.println("");
		
		System.out.print("Option: "); // TODO: change from println to print to place cursor on the right in the same line
		option = scanner.nextInt();
		 
		// if (option = 1) -> display cards--method
		// else -> display top 10--method
		if (option == 1) {
			
			System.out.println("Drawing the card for Player 1....");
			System.out.println("Drawing the card for Player 2....");
			System.out.println();
			
			// Draw cards for player 1
			System.out.println(player1.getName() + "'s cards:");	
			player1.drawCards();
			
			// Draw cards for player 2
			System.out.println(player2.getName() + "'s cards:");	
			player2.drawCards(); 
			
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
	
	// Attack method
	public static void attack() {
		System.out.print("Choose your Card: ");
		int attackingCard = scanner.nextInt() - 1;
		
		System.out.print("Choose opponent's Card: ");
		int defendingCard = scanner.nextInt() - 1;
		
		player1.cardsList.get(attackingCard).attack(player2.cardsList.get(defendingCard)); // calls attack method of arraylist objects (Card and Subclasses) from cardsList
		//player play count ++
		
		//Check if weakness on/off
			// Get attackingCard corresponding-> Card object's type 
			// Get defendingCard corresponding-> Card object's type
			// Compare two types
				// if types are equal: Weakness is ON
				// if types are notequal: Weakness is OFF
	}
	
	// Recharge method
	public static void recharge() {
		System.out.println("recharging........");
	}
	
	// Train method
	public static void train() {
		System.out.println("training...!!");
	}
	
	//Remove this later
	

}
