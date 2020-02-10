package Roshambo;
/**
 * 
 * @author >>RanaSiroosian<<
 * 
 */
import java.util.Random;

public class TheSharks extends Player{
	

	public TheSharks(String name) {
		super(name);
	}

	public Roshambo generateRoshambo() {
		
		Random rand = new Random();
		int randomPick = rand.nextInt(3);
		
		switch (randomPick) {
			
		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPER;
		default:
			return Roshambo.SCISSORS;
		}
	}
}


