import java.util.concurrent.ThreadLocalRandom;

public class Defending extends Card{
	
	private int rp;

	public Defending(int cNum) {
		super(cNum);
		rp = ThreadLocalRandom.current().nextInt(1, 3 + 1);
	}
	
	public String getRPString() {
		return String.valueOf( rp );
	}
	
	public void attack(Card targetCard) {
		super.attack(targetCard);
		
		System.out.println("T: " + targetCard.getClass().getSimpleName());
		System.out.println("T: " + this.getClass().getSimpleName());
		
		System.out.println("Executes Superclass Method through Defending Type Attack Method");
	}
	
	
}
