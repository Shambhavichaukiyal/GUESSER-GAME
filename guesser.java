package gitpw;

import java.util.Scanner;

public class guesser {
    int numFromGuesser;

    public int guesserNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("guesser, guess the number: ");
        numFromGuesser = sc.nextInt();
        return numFromGuesser;
    }
}
