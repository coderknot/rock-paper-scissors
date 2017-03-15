import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Player 1, enter your name:");
    String player1 = console.readLine();

    System.out.println("Player 2, enter your name:");
    String player2 = console.readLine();

    System.out.println("" + player1 + "- rock, paper, scissors?");
    String player1choice = console.readLine();

    System.out.println("" + player2 + "- rock, paper, scissors?");
    String player2choice = console.readLine();

    RPS game = new RPS();

    if(game.determineWinner(player1choice, player2choice).equals("player1")) {
      System.out.println("Winner: " + player1);
    } else if (game.determineWinner(player1choice, player2choice).equals("player2")) {
      System.out.println("Winner: " + player2);
    } else {
      System.out.println("Tie!");
    }
  }
}
