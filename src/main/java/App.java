import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    RPS game = new RPS();

    System.out.println("Enter the appropriate number: \n 1. Two Player \n 2. Play against computer");
    String howToPlay = console.readLine();

    if (howToPlay.equals("1")){

      System.out.println("Player 1, enter your name:");
      String player1 = console.readLine();

      System.out.println("Player 2, enter your name:");
      String player2 = console.readLine();

      System.out.println("" + player1 + "- rock, paper, scissors?");
      String player1choice = console.readLine();

      System.out.println("" + player2 + "- rock, paper, scissors?");
      String player2choice = console.readLine();

      if(game.determineWinner(player1choice, player2choice).equals("player1")) {
        System.out.println("Winner: " + player1);
      } else if (game.determineWinner(player1choice, player2choice).equals("player2")) {
        System.out.println("Winner: " + player2);
      } else {
        System.out.println("Tie!");
      }
    } else if (howToPlay.equals("2")){
      System.out.println("Playing against the computer");
      System.out.println("Enter your name:");
      String player1 = console.readLine();

      System.out.println("" + player1 + "- rock, paper, scissors?");
      String player1choice = console.readLine();



      if(game.determineWinner(player1choice, game.determineComputerChoice()).equals("player1")){
        System.out.println("Winner: " + player1);
      } else if (game.determineWinner(player1choice, game.determineComputerChoice()).equals("player1")){
        System.out.println("Winner: The Computer");
      } else if (game.determineWinner(player1choice, game.determineComputerChoice()).equals("tie")) {
        System.out.println("Tie!");
      } else {
        System.out.println("I don't think you entered a proper input!");
      }

    } else {
      System.out.println("Your input was not recognized");
    }
  }
}
