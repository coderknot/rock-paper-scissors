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
      String computerChoice = game.determineComputerChoice();
      String message = "The computer played: " + computerChoice;


      if(game.determineWinner(player1choice, computerChoice).equals("player1")){
        System.out.println("\n -----------------------------\n"+ message +"\nWinner: " + player1 + "\n -----------------------------\n");
      } else if (game.determineWinner(player1choice, computerChoice).equals("player2")){
        System.out.println("\n -----------------------------\n"+ message +"\nWinner: The Computer\n -----------------------------\n");
      } else if (game.determineWinner(player1choice, computerChoice).equals("tie")) {
        System.out.println("\n -----------------------------\n"+ message +"\nTie!\n -----------------------------\n");
      } else {
        System.out.println("\n -----------------------------\n"+ message +"\nI don't think you entered a proper input! I guess the computer Wins!\n -----------------------------\n");
      }

    } else {
      System.out.println("Your input was not recognized");
    }
  }
}
