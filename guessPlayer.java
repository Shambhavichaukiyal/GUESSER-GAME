package gitpw;

import java.util.Scanner;

public class guessPlayer {
    int pguess;

    public int playerNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player, guess the number: ");
        pguess = sc.nextInt();
        return pguess;
    }
}