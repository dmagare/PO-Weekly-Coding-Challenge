import java.util.Scanner;

public class RockPaperScissorsGame {
	public static final String ROCK = "ROCK";
	public static final String SCISSORS = "SCISSORS";
	public static final String PAPER = "PAPER";

	public static void main(String[] args) {
		System.out.println("Please enter one of the following inputs: ");
		System.out.println("ROCK");
		System.out.println("PAPER");
		System.out.println("SCISSORS");
		System.out.println();
		
		String playerOneMove = getPlayerOneMove();
		String playerTwoMove = getPlayerTwoMove();
		
		if(playerOneMove.equals(playerTwoMove)) {
			System.out.println("Game is a Tie");
		}
		else if(playerOneMove.equals(RockPaperScissorsGame.ROCK))
			System.out.println(playerTwoMove.equals(RockPaperScissorsGame.PAPER)? "player 2 Wins":"player 1 Wins");
		else if(playerOneMove.equals(RockPaperScissorsGame.PAPER))
			System.out.println(playerTwoMove.equals(RockPaperScissorsGame.SCISSORS)?"Player 2 wins":"player 1 wins");
		else
			System.out.println(playerTwoMove.equals(RockPaperScissorsGame.ROCK)?"Player 2 wins":"Player1 wins");	
	}
public static String getPlayerOneMove() {
	Scanner scan = new Scanner(System.in);
	String input = scan.next();
	String playerOneMove= input.toUpperCase();
	System.out.println("Player 1 Move: "+ playerOneMove);
	return playerOneMove;
}
public static String getPlayerTwoMove() {
	Scanner scan = new Scanner(System.in);
	String input = scan.next();
	String playerTwoMove = input.toUpperCase();
	System.out.println("Player 2 Move: "+ playerTwoMove);
	return playerTwoMove;
}

}
