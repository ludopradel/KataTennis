
public class TennisGame {

	private Player playerOne;
	private Player playerTwo;
	private String[] scores = {"0", "15", "30", "40"};
	
	public TennisGame(String playerOne, String playerTwo) {
		this.playerOne = new Player(playerOne);
		this.playerTwo = new Player(playerTwo);
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


	public void addPointTo(String player) {
		if (playerOne.getName().equals(player)) {
			playerOne.incrementScore();
		} else {
			playerTwo.incrementScore();
		}
	}

}
