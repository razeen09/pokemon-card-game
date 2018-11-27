import java.util.concurrent.ThreadLocalRandom;

public class Card {
	private String type;
	private int stage = 0;		
	private int xp = 0;
	private int hp;
	private int energy;
	private String energyCol;
	private int ap;
	private int rp;
	private String status;
	
	// Constructor if type parameter/argument is passed from Game class
	public Card(String type) {
		this.type = type;
		setHP();
		setEnergy();
		setEnergyCol();
		setAP();
		setRP();
		setStatus();
	}
	
	
	// Constructor if type parameter is not passed
	public Card() {
		setRandomType();
		setHP();
		setEnergy();
		setEnergyCol();
		setAP();
		setRP();
		setStatus();
	}
	
	// Setters
	
	// Sets Random Card Type
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
	public void setAP() {
		if (type.equals("Attacking")) {
			ap = ThreadLocalRandom.current().nextInt(2, 5 + 1);
		}
		
		else {
			ap = 0;
		}
	}
	
	// Set Resistance Points
	public void setRP() {
		if (type.equals("Defending")) {
			rp = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		}
		
		else {
			rp = 0;
		}
	}
	
	// Set Hit Points
	public void setHP() {
		hp = ThreadLocalRandom.current().nextInt(50, 80 + 1);
	}
	
	// Set Energy
	public void setEnergy() {
		energy = ThreadLocalRandom.current().nextInt(20, 50 + 1);
	}
	
	// Set Status
	public void setStatus() {
		status = "Active";
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
	
	public String status() {
		return status;
	}
	

}
