import java.util.*;

public class Fairy extends Card {

	public Fairy(int cNum) {
		super(cNum);
	}
	
	public void attack(Card targetCard) {
		//super.attack(targetCard);
		
		xp += 1;
		energy -= 1;
		Random coinFlip = new Random();
		boolean heads = coinFlip.nextBoolean();	
		
		//first check if heads received, then check for same type of card: if same double AP else normal AP, else HP -1

		if (heads) {  
			if (targetCard.getClass().getSimpleName() == this.getClass().getSimpleName()) {
				System.out.println("Weakness: ON, attack points doubled");
				System.out.println("[Flipped a coin: heads!] Card " + targetCard.getCardNum() + " is POISONED!");
				
				if (targetCard.getClass().getSimpleName() == "Defending") {
					targetCard.setHP( targetCard.getHP() - (2 - targetCard.getRP()));
				}
				else {
					targetCard.setHP( targetCard.getHP() - 2);
				}
				
				targetCard.setStatus("Poisoned");
			}
			else {
				System.out.println("Weakness: OFF");
				System.out.println("[Flipped a coin: heads!] Card " + targetCard.getCardNum() + " is POISONED!");
				
				if (targetCard.getClass().getSimpleName() == "Defending") {
					targetCard.setHP( targetCard.getHP() - (1 - targetCard.getRP()));
				}
				else {
					targetCard.setHP( targetCard.getHP() - 1);
				}
				targetCard.setStatus("Poisoned");
			}	
		}
		else {
			if (targetCard.getClass().getSimpleName() == this.getClass().getSimpleName()) {
				System.out.println("Weakness: ON, attack points doubled");
				System.out.println("[Flipped a coin: heads!] Card " + targetCard.getCardNum() + " is PARALYSED!");
				
				if (targetCard.getClass().getSimpleName() == "Defending") {
					targetCard.setHP( targetCard.getHP() - (2 - targetCard.getRP()));
				}
				else {
					targetCard.setHP( targetCard.getHP() - 2);
				}
				
				targetCard.setStatus("Paralaysed");
			}
			else {
				System.out.println("Weakness: OFF");
				System.out.println("[Flipped a coin: tails!] Card " + targetCard.getCardNum() + " is PARALYSED!");
				
				if (targetCard.getClass().getSimpleName() == "Defending") {
					targetCard.setHP( targetCard.getHP() - (1 - targetCard.getRP()));
				}
				else {
					targetCard.setHP( targetCard.getHP() - 1);
				}
				
				targetCard.setStatus("Paralysed");
			}

		}
		
		System.out.println(getXP());
		System.out.println(targetCard.getHP());
		System.out.println(getEnergy());
		System.out.println(targetCard.getStatus());
		System.out.println("Executes Fairy Type Attakc Method");
	}
}
