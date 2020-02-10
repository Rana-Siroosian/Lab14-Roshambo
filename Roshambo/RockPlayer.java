package Roshambo;
/**
 * 
 * @author >>RanaSiroosian<<
 * 
 */
import Roshambo.Player;
import Roshambo.Roshambo;

public class RockPlayer extends Player {
	
	public RockPlayer (String name) {
		super(name);
		
	}
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
