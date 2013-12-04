
public class TennisGame {

	private Player playerOne;
	private Player playerTwo;
	private String[] scores = {"0", "15", "30", "40"};
	
	public TennisGame(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public String score() {
		if (playerOne.getScore() == 4) 
			return playerOne.getName() + " wins the game";
		
		if (playerTwo.getScore() == 4)
			return playerTwo.getName() + " wins the game";
		
		return parseScore(playerOne.getScore()) + " - " + parseScore(playerTwo.getScore());
	}

	private String parseScore(int score) {
		return scores[score];	
	}

}
