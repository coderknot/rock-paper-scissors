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

    // if(player1.equals("rock")) {
    //   if(player2.equals("paper")) {
    //     winner = "player2";
    //   } else if(player2.equals("scissors")){
    //     winner = "player1";
    //   } else {
    //     winner = "tie";
    //   }
    // } else if (player1.equals("paper")){
    //   if(player2.equals("rock")){
    //     winner = "player1";
    //   } else if(player2.equals("scissors")){
    //     winner = "player2";
    //   } else {
    //   winner = "tie";
    //   }
    // } else if (player1.equals("scissors")){
    //   if(player2.equals("rock")) {
    //     winner = "player2";
    //   } else if(player2.equals("paper")){
    //     winner = "player1";
    //   } else {
    //     winner = "tie";
    //   }
    // } else {
    //   winner = "not defined";
    // }

    return winner;
  }
}
