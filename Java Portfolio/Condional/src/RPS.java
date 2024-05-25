
import java.util.Scanner;

        public class RPS {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your move (rock, paper, or scissors): ");
                String playerMove = scanner.nextLine().toLowerCase();

                String computerMove = generateComputerMove();

                System.out.println("Your move: " + playerMove);
                System.out.println("Computer's move: " + computerMove);

                String result = determineWinner(playerMove, computerMove);

                System.out.println("Result: " + result);
            }

            private static String generateComputerMove() {
                int random = (int) (Math.random() * 3);

                if (random == 0) {
                    return "rock";
                } else if (random == 1) {
                    return "paper";
                } else {
                    return "scissors";
                }
            }

            private static String determineWinner(String playerMove, String computerMove) {
                if (playerMove.equals(computerMove)) {
                    return "It's a tie!";
                } else if (
                        (playerMove.equals("rock") && computerMove.equals("scissors")) ||
                                (playerMove.equals("paper") && computerMove.equals("rock")) ||
                                (playerMove.equals("scissors") && computerMove.equals("paper"))
                ) {
                    return "You win!";
                } else {
                    return "Computer wins!";
                }
            }
        }