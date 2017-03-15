import org.junit.*;
import static org.junit.Assert.*;

public class RPSTest {
  @Test
  public void determineWinner_returnsWinnerRockVsPaper_Player2() {
    RPS testRPS = new RPS();
    String expected = "player2";
    assertEquals(expected, testRPS.determineWinner("rock", "paper"));
  }

  @Test
  public void determineWinner_returnsWinnerRockVsScissors_Player1() {
    RPS testRPS = new RPS();
    String expected = "player1";
    assertEquals(expected, testRPS.determineWinner("rock", "scissors"));
  }

  @Test
  public void determineWinner_returnsWinnerPaperVsRock_Player1() {
    RPS testRPS = new RPS();
    String expected = "player1";
    assertEquals(expected, testRPS.determineWinner("paper", "rock"));
  }

  @Test
  public void determineWinner_returnsWinnerPaperVsScissors_Player2() {
    RPS testRPS = new RPS();
    String expected = "player2";
    assertEquals(expected, testRPS.determineWinner("paper", "scissors"));
  }

  @Test
  public void determineWinner_returnsWinnerScissorsVsRock_Player2() {
    RPS testRPS = new RPS();
    String expected = "player2";
    assertEquals(expected, testRPS.determineWinner("scissors", "rock"));
  }

  @Test
  public void determineWinner_returnsWinnerScissorsVsPaper_Player1() {
    RPS testRPS = new RPS();
    String expected = "player1";
    assertEquals(expected, testRPS.determineWinner("scissors", "paper"));
  }

  @Test
  public void determineWinner_returnsTie_Tie() {
    RPS testRPS = new RPS();
    String expected = "tie";
    assertEquals(expected, testRPS.determineWinner("rock", "rock"));
    assertEquals(expected, testRPS.determineWinner("paper", "paper"));
    assertEquals(expected, testRPS.determineWinner("scissors", "scissors"));
  }

  @Test
  public void computerChooses_shouldBeAString_true() {
    Game testGame = new Game();
    String computerChoice =  testGame.determineComputerChoice()
    assertEquals(true, computerChoice instanceof String);
  }
}
