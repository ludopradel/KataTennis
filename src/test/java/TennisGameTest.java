import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


public class TennisGameTest {
	
	TennisGame tennisGame = new TennisGame("Jean", "Michel");
	
	@Test public void
	a_game_could_be_played_with_two_players() {
		assertThat(tennisGame.score(), is("0 - 0"));
	}
	
	@Test public void
	player_could_score_one_point() {
		tennisGame.addPointTo("Jean");
		
		assertThat(tennisGame.score(), is("15 - 0"));
	}
	
	@Test public void
	the_two_players_could_scored_two_times() {
		TwoPointsFor("Jean");
		TwoPointsFor("Michel");
		
		assertThat(tennisGame.score(), is("30 - 30"));
	}

	@Test public void
	the_two_players_could_scored_three_times() {
		ThreePointsFor("Jean");
		ThreePointsFor("Michel");
		
		assertThat(tennisGame.score(), is("40 - 40"));
	}
	
	@Test public void
	a_player_could_win_a_game() {
		ThreePointsFor("Michel");
		tennisGame.addPointTo("Michel");
		
		assertThat(tennisGame.score(), is("Michel wins the game"));
	}
	
	
	private void ThreePointsFor(String player) {
		TwoPointsFor(player);
		tennisGame.addPointTo(player);
	}
	private void TwoPointsFor(String player) {
		tennisGame.addPointTo(player);
		tennisGame.addPointTo(player);
	}
	
}
