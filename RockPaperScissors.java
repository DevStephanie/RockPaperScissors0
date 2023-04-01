import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String[] rps = {"r", "p", "s"};
            String myMove = rps[new Random().nextInt(rps.length)];

            String yourMove;

            while (true) {
                System.out.println("Enter your move here (r, p or s)");
                yourMove = scanner.nextLine();
                if (yourMove.equals("r") || yourMove.equals("p") || yourMove.equals("s")) {
                    break;
                }
                System.out.println(yourMove + " choose again, not an option!");
            }

            System.out.println("I played " + myMove);
            if (yourMove.equals(myMove)) {
                System.out.println("Tied Game, want a rematch?");
            } else if (yourMove.equals("r")) {
                if (myMove.equals("p")) {
                    System.out.println("I win, you LOSE! HAHA");

                } else if (myMove.equals("s")) {
                    System.out.println("No I lost, Congratulations!");
                }
            } else if (yourMove.equals("p")) {
                if (myMove.equals("r")) {
                    System.out.println("No I lost, Congratulations!");

                } else if (myMove.equals("s")) {
                    System.out.println("I win, you LOSE! HAHA");
                }
            } else if (yourMove.equals("s")) {
                if (myMove.equals("p")) {
                    System.out.println("No I lost, Congratulations!");

                } else if (myMove.equals("r")) {
                    System.out.println("I win, you LOSE! HAHA");
                }
            }

            System.out.println("Dare to play again? (y/n)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close();
    }
}