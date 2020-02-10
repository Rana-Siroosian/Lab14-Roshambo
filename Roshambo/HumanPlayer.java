package Roshambo;
/**
 * 
 * @author >>RanaSiroosian<<
 * 
 */
import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer(String name) {
		super(name);
	}
	

	@Override
	public Roshambo generateRoshambo() {

		Scanner scnr = new Scanner (System.in);
		String input = Validator.getStringMatchingRegexCustomError1(scnr, "Please pick one, Rock, paper or scissors? (R/P/S)\n", "[RrPpSs]", "You can only choose R/P/S. Try again!").toUpperCase();
		
		switch(input) {
			
		case "R" :
			return Roshambo.ROCK;
		
		case "P" :
			return Roshambo.PAPER;
			
		default:
			return Roshambo.SCISSORS;
		}
	}

}
