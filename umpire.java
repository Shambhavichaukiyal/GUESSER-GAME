package gitpw;

import java.util.Scanner;

public class umpire {
    int guesserNum;
    int player1Num;
    int player2Num;
    int player3Num;

    public void collectnumFromGuesser() {
        guesser g = new guesser();
        guesserNum = g.guesserNum();
    }

    public void collectnumFromPlayer() {
        guessPlayer p1 = new guessPlayer();
        guessPlayer p2 = new guessPlayer();
        guessPlayer p3 = new guessPlayer();
        player1Num = p1.playerNum();
        player2Num = p2.playerNum();
        player3Num = p3.playerNum();
    }

    /**
     * 
     */
    public void compare() {
        if (guesserNum == player1Num) {
            if (guesserNum == player2Num && guesserNum == player3Num) {
                System.out.print("The game is tied");

            } else if (guesserNum == player2Num) {
                System.out.print("The game is tied between player1 and player2");

            } else if (guesserNum == player3Num) {
                System.out.print("The game is tied between player1 and player3");
            } else {
                System.out.print("The game is won by Player1");
            }
        } else if (guesserNum == player2Num) {
            if (guesserNum == player3Num) {
                System.out.print("The game is tied between player2 and player3");
            } else {
                System.out.print("The game is won by player2");
            }
        } else if (guesserNum == player3Num) {
            System.out.print("The game is won by player3");
        } else {
            System.out.print("Try again");
        }

    }
}