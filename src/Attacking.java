import java.lang.annotation.Target;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Attacking extends Card {
	
	private int ap;
	
	public Attacking(int cNum) {
		super(cNum);
		ap = ThreadLocalRandom.current().nextInt(2, 5 + 1);
	}
	
	public String getAPString() {
		return String.valueOf( ap );
	}
	
	public void attack(Card targetCard) {
		//super.attack(targetCard);
		
		System.out.println("T: " + targetCard.getClass().getSimpleName());
		System.out.println("T: " + this.getClass().getSimpleName());
		
		xp += 1;
		energy -= 1;
		Random coinFlip = new Random();
		boolean heads = coinFlip.nextBoolean();	
		
		//first check if heads received, then check for same type of card: if same double AP else normal AP, else HP -1
		if (heads) {  
			if (targetCard.getClass().getSimpleName() == this.getClass().getSimpleName()) {
				System.out.println("Weakness: ON, attack points doubled");
				System.out.println("[Flipped a coin: heads!] attack point is " + ap * 2 + "]");
				
				if (targetCard.getClass().getSimpleName() == "Defending") {
					targetCard.setHP( targetCard.getHP() - ((this.getHP() * 2) - targetCard.getRP()));
				}
				else {
					targetCard.setHP( targetCard.getHP() - this.getAP() * 2 );
				}
			}
			else {
				System.out.println("Weakness: OFF");
				System.out.println("[Flipped a coin: heads!] attack point is " + ap + "]");
				
				if (targetCard.getClass().getSimpleName() == "Defending") {
					targetCard.setHP( targetCard.getHP() - this.getHP() - targetCard.getRP());
				}
				else {
					targetCard.setHP( targetCard.getHP() - this.getAP() );
				}
				
			}	
		}
		else {
			if (targetCard.getClass().getSimpleName() == this.getClass().getSimpleName()) {
				System.out.println("Weakness: ON, attack points doubled");
				
				if (targetCard.getClass().getSimpleName() == "Defending") {
					targetCard.setHP( targetCard.getHP() - (2 - targetCard.getRP()));
				}
				else {
					targetCard.setHP( targetCard.getHP() - 2 );
				}
				
			}
			else {
				System.out.println("Weakness: OFF");
				
				if (targetCard.getClass().getSimpleName() == "Defending") {
					targetCard.setHP( targetCard.getHP() - (1 - targetCard.getRP()));
				}
				else {
					targetCard.setHP( targetCard.getHP() - 1 );
				}
				
			}

		}
		
		System.out.println(getXP());
		System.out.println(targetCard.getHP());
		System.out.println(getEnergy());
		System.out.println(getStatus());
		System.out.println("Executes Attack Type Method");
	}
}
