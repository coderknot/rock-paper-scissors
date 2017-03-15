import java.util.Random;


public class RPS {

  public String determineWinner(String player1, String player2) {

    String winner = "";

    if(player1.equals(player2)) {
      winner = "tie";
    } else if(player1.equals("rock")) {
      if(player2.equals("paper")) {
        winner = "player2";
      } else {
        winner = "player1";
      }
    } else if (player1.equals("paper")){
      if(player2.equals("rock")){
        winner = "player1";
      } else {
        winner = "player2";
      }
    } else if (player1.equals("scissors")){
      if(player2.equals("rock")) {
        winner = "player2";
      } else {
        winner = "player1";
      }
    } else {
      winner = "not defined";
    }
    return winner;
  }

  public String determineComputerChoice(){
    Random myRandomGenerator = new Random();
    int randomNumber = myRandomGenerator.nextInt(3) + 1;

    String choice = "";

    switch(randomNumber) {
      case 1: choice = "rock";
              break;
      case 2: choice = "paper";
              break;
      case 3: choice = "scissors";
              break;
      default: choice = "";
              break;
    }

    return choice;

  }
}
