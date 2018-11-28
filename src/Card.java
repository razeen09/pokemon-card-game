import java.util.concurrent.ThreadLocalRandom;

public class Card {
	private String type;//remove
	private int cardNum;
	private int stage = 0;		
	protected int xp = 0;
	private int hp;
	protected int energy;
	private String energyCol;
	private int ap;
	private int rp;
	private String status;
	
	// Constructor if type parameter/argument is passed from Game class
	public Card(int cNum) {
		cardNum = cNum;
		hp = ThreadLocalRandom.current().nextInt(50, 80 + 1);
		setEnergy();
		setEnergyCol();
		setAP(1);
		setRP(0);
		status = "Active";
	}
	
	

	
	// Setters
	
	// Sets Random Card Type
	/*
	public void setRandomType() {
		int random = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		if (random == 1) {
			type = "Attacking";
		}
		else if (random == 2) {
			type = "Defending";
		}
		else if (random == 3) {
			type = "Fairy";
		}
	}
	*/
	// Set Random Energy Colour
	public void setEnergyCol() {
		
		int random = ThreadLocalRandom.current().nextInt(1, 4 + 1);
		if (random == 1) {
			energyCol = "Red";
		}
		else if (random == 2) {
			energyCol = "Blue";
		}
		else if (random == 3) {
			energyCol = "Yellow";
		}
		else if (random == 4) {
			energyCol = "Colourless";
		}
	}
	
	// Set Attack Points
	public void setAP(int ap) {
		this.ap = ap;
	}
	
	// Set Resistance Points
	public void setRP(int rp) {
		this.rp = rp;
	}
	
	// Set Hit Points
	public void setHP(int hp) {
		
		this.hp = hp;
	}
	
	// Set Energy
	public void setEnergy() {
		energy = ThreadLocalRandom.current().nextInt(20, 50 + 1);
	}
	
	// Set Status
	public void setStatus(String status) {
		this.status = status;
	}
	
	// Getters
	
	public String getType() {
		return type;
	}
	
	public int getStage() {
		return stage;
	}
	
	public int getXP() {
		return xp;
	}
	public int getHP() {
		return hp;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public String getEnergyCol() {
		return energyCol;
	}
	
	public int getAP() {
		return ap;
	}
	
	public int getRP() {
		return rp;
	}
	
	public String getAPString() {
		return "-";
	}
	
	public String getRPString() {
		return "-";
	}
	
	public String getStatus() {
		return status;
	}


	public int getCardNum() {
		return cardNum;
	}
	
	public void attack(Card targetCard) {
		System.out.println("T: " + targetCard.getClass().getSimpleName());
		System.out.println("T: " + this.getClass().getSimpleName());
		
		xp += 1;
		energy -= 1;
		if ( targetCard.getClass().getSimpleName() == this.getClass().getSimpleName() ) {
			System.out.println("Weakness: ON, attack points doubled");
			//
			if (targetCard.getClass().getSimpleName() == "Defending") {
				targetCard.setHP( targetCard.getHP() - (2 - targetCard.getRP()));
			}
			else {
				targetCard.setHP( targetCard.getHP() - 2 );
			}	
			//
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
		
		System.out.println(getXP());
		System.out.println(targetCard.getHP());
		System.out.println(getEnergy());
		System.out.println(getStatus());
		System.out.println("Executes Superclass Method");
	}
	

}
