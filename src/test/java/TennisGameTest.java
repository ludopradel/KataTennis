import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


public class TennisGameTest {
	
	TennisGame tennisGame;
	
	final Player JEAN = new Player("Jean");
	final Player MICHEL = new Player("Michel");
	
	@Before public void setUp() {
		tennisGame = new TennisGame(JEAN, MICHEL);
	}
	
	@Test public void
	a_game_could_be_played_with_two_players() {
		assertThat(tennisGame.score(), is("0 - 0"));
	}
	
	@Test public void
	player_could_score_one_point() {
		JEAN.scored();
		
		assertThat(tennisGame.score(), is("15 - 0"));
	}
	
	@Test public void
	the_two_players_could_scored_two_times() {
		TwoPointsFor(JEAN);
		TwoPointsFor(MICHEL);
		
		assertThat(tennisGame.score(), is("30 - 30"));
	}

	@Test public void
	the_two_players_could_scored_three_times() {
		ThreePointsFor(JEAN);
		ThreePointsFor(MICHEL);
		
		assertThat(tennisGame.score(), is("40 - 40"));
	}
	
	@Test public void
	a_player_could_win_a_game() {
		ThreePointsFor(MICHEL);
		MICHEL.scored();
		
		assertThat(tennisGame.score(), is("Michel wins the game"));
	}
	
	
	private void ThreePointsFor(Player player) {
		TwoPointsFor(player);
		player.scored();
	}
	private void TwoPointsFor(Player player) {
		player.scored();
		player.scored();
	}
	
}
