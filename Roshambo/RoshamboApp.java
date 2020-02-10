package Roshambo;
/**
 * 
 * @author >>RanaSiroosian<<
 * 
 */
import java.util.Scanner;

public class RoshamboApp {

	public static final String ROCK = "ROCK";
	public static final String PAPER = "PAPER";
	public static final String SCISSORS = "SCISSORS";
	
	public static void main(String[] args) {
		

		Scanner scnr = new Scanner (System.in);
		System.out.println("Welcome to Rock Paper Scissors!\n");
		
		System.out.println("Enter your name: ");
		String name = scnr.nextLine();

		roshamboGame( name);
		
		scnr.close();
	
	}

	public static void roshamboGame( String playerName) {
		Scanner scnr = new Scanner (System.in);

		System.out.println("Welcome to the Roshambo Game " + playerName +".\n");

		int totalWins = 0;
		int totalPlay = 0;

		TheSharks sharks = new TheSharks ("TheSharks");
		RockPlayer rock = new RockPlayer("TheRockStar");
		boolean loop = false;
		Player humanPlayer = new HumanPlayer("Rana");
		do {
			
			int choice = Validator.getInt(scnr, "Would you like to play against 1-TheRockStar or 2-TheSharks (1 or 2)?: ", 1, 2);
			
			if (choice == 1) {
				System.out.println("----------------------------------------");
				System.out.println("You are playing against The Rock Star.\n");
	
				String user = humanPlayer.generateRoshambo().toString();
	
				if (user.equals("ROCK")) {
					
					System.out.println(humanPlayer.name + ": " + Roshambo.ROCK );
					System.out.println(rock.name + ": " + rock.generateRoshambo());
					System.out.println("\nIt's a tie! " + humanPlayer.name +" & "+ rock.name +"."  );
					System.out.println("----------------------------------------");
	
					totalWins += 1;
		
				}
				
				else if(user.equals("PAPER")) {
					System.out.println(humanPlayer.name + ": " + Roshambo.PAPER);
					System.out.println(rock.name + ": " + rock.generateRoshambo());
					System.out.println(humanPlayer.name + " \nYou have beaten " + rock.name +".");
					System.out.println("----------------------------------------");
	
					totalWins += 1;
	
				}
				
				else if (user.equals("SCISSORS")) {
					System.out.println(humanPlayer.name + ": " + Roshambo.SCISSORS);
					System.out.println(rock.name + ": " + rock.generateRoshambo());
					System.out.println("\nSuch a loser! " + humanPlayer.name +".");
					System.out.println("----------------------------------------");
	
				}
			}
			
			if (choice == 2) {
				System.out.println("----------------------------------------");
				System.out.println("You are playing against The Sharks.\n");
				String shark = sharks.generateRoshambo().toString();
				String user = humanPlayer.generateRoshambo().toString();


			
				if (user.equals("ROCK")&& shark.equals(ROCK)) {
					System.out.println(humanPlayer.name + ": " + Roshambo.ROCK );
					System.out.println(sharks.name + ": " + shark);
					System.out.println("\nIt's a tie! " + humanPlayer.name +" & "+ sharks.name + ".\n");
					System.out.println("----------------------------------------");
	
					totalWins += 1;
						
				}
					
				else if(user.equals("PAPER")&& shark.equals(ROCK)) {
					System.out.println(humanPlayer.name + ": " + Roshambo.PAPER);
					System.out.println(sharks.name + ": " + shark);
					System.out.println(humanPlayer.name + " You have beaten " + sharks.name + ".");
					System.out.println("----------------------------------------");

					totalWins += 1;
				}
					
				else if (user.equals("SCISSORS")&& shark.equals(PAPER)) {
					System.out.println(humanPlayer.name + ": " + Roshambo.SCISSORS);
					System.out.println(sharks.name + ": " + shark);
					System.out.println("\nNice win " + humanPlayer.name + ".");
					System.out.println("----------------------------------------");
	
					totalWins+=1;
				}
				else if (user.equals("SCISSORS")&& shark.equals(SCISSORS)) {
					System.out.println(humanPlayer.name + ": " + Roshambo.SCISSORS);
					System.out.println(sharks.name + ": " + shark);
					System.out.println("\nIt's a tie! " + humanPlayer.name + ".");
					System.out.println("----------------------------------------");
	
					totalWins+=1;
				}
				else if (user.equals("PAPER")&& shark.equals(PAPER)) {
					System.out.println(humanPlayer.name + ": " + Roshambo.PAPER);
					System.out.println(sharks.name + ": " + shark);
					System.out.println("\nIt's a tie! " + humanPlayer.name + ".");
					System.out.println("----------------------------------------");
	
					totalWins+=1;
				}
				else if(user.equals("SCISSORS") && shark.equals(ROCK)) {
					System.out.println(humanPlayer.name + ": " + Roshambo.SCISSORS);
					System.out.println(sharks.name + ": " + shark);
					System.out.println("\nSuch a loser! " + humanPlayer.name + ".");
					System.out.println("----------------------------------------");
	
				}	
				else if(user.equals("PAPER") && shark.equals(SCISSORS)) {
					System.out.println(humanPlayer.name + ": " + Roshambo.PAPER);
					System.out.println(sharks.name + ": " + shark);
					System.out.println("\nSuch a loser! " + humanPlayer.name + ".");
					System.out.println("----------------------------------------");
	
				}
				else if(user.equals("ROCK") && shark.equals(SCISSORS)) {
					System.out.println(humanPlayer.name + ": " + Roshambo.ROCK);
					System.out.println(sharks.name + ": " + shark);
					System.out.println("\nNice win! " + humanPlayer.name + ".");
					System.out.println("----------------------------------------");
	
					totalWins+=1;
				}
				else if(user.equals("ROCK") && shark.equals(PAPER)) {
					System.out.println(humanPlayer.name + ": " + Roshambo.ROCK);
					System.out.println(sharks.name + ": " + shark);
					System.out.println("\nSeems you like to be a loser " + humanPlayer.name+".");
					System.out.println("----------------------------------------");

				}
			}
			totalPlay += 1;
	
			System.out.println("\nWould you like to play again? (y/n)");
			String Q = Validator.yesOrNo(scnr,"");
			if (Q.equalsIgnoreCase("y")) 
					loop = true;
			if(Q.equalsIgnoreCase("n"))  
				loop = false;
		
		}while 	(loop);
		int totalLoss = totalPlay - totalWins;
		System.out.println("----------------------------------------");
		System.out.println("Here's your score " + humanPlayer.name +":\n");
		System.out.println("You played " + totalPlay + " times.");
		if(totalWins == 1) {
			System.out.println("You won " + totalWins + " time.");
		}
		else {
			System.out.println("You won " + totalWins + " times.");
		}
		if(totalLoss == 1) {
			
			System.out.println("You lost " + totalLoss + " time.");
		}
		else {
			System.out.println("You lost " + totalLoss + " times.");
		}
		System.out.println("----------------------------------------");

		System.out.println("\nHave a great day!");
	
	}
	

}
