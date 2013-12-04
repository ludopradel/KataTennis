
public class Player {

	private String name;
	private int score;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void scored() {
		score ++;
	}

	public int getScore() {
		return score;
	}

}
