import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};
        int totalRounds = 5;

        String[] playerMoves = new String[totalRounds];
        String[] computerMoves = new String[totalRounds];
        String[] results = new String[totalRounds];

        int wins = 0;
        int losses = 0;
        int draws = 0;

        for (int i = 0; i < totalRounds; i++) {
            System.out.print("Round " + (i + 1) + " - Enter your move (Rock, Paper, Scissors): ");
            String player = sc.nextLine().trim();

            String computer = options[rand.nextInt(3)];
            String res = playRound(player, computer);

            playerMoves[i] = player;
            computerMoves[i] = computer;
            results[i] = res;

            if (res.equals("Player Wins")) {
                wins++;
            } else if (res.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }

            System.out.println("Result: " + res);
        }

        System.out.println("\nRound | Player Move | Computer Move | Result");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < totalRounds; i++) {
            System.out.println((i + 1) + "     | " + playerMoves[i] + "        | " + computerMoves[i] + "         | " + results[i]);
        }

        double winPercent = ((double) wins / totalRounds) * 100.0;
        System.out.println("\nFinal Summary (after 5 rounds):");
        System.out.println("Wins: " + wins + " | Losses: " + losses + " | Draws: " + draws + " | Win % = " + winPercent + "%");

        sc.close();
    }
}