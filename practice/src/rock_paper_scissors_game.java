import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors_game {
    public static void main(String[] args) {
        // rock-paper-scissors game
        // type rock/paper/scissors to play
        // type x to exit game

        String userHand = "";
        int roundCounter = 1;
        do {
            System.out.println("Round: " + roundCounter);
            userHand = userHand();
            if (!userHand.equals("X")) {
            String computerHand = computerHand();
            winner(userHand, computerHand);
            roundCounter++;}else {
                System.out.println("LEAVING GAME...");
            }
        }
        while (!userHand.equals("X"));
    }

    public static String userHand() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ROCK...  PAPER...  SCISSORS...");
        System.out.println("Choose one:");
        String userHand = scan.nextLine().toUpperCase();

        while (!userHand.equals("ROCK") && !userHand.equals("PAPER") && !userHand.equals("SCISSORS") && !userHand.equals("X")) {
            if (!userHand.equals("X"))  {
            System.out.println("Wrong input! Waiting for valid data as rock/paper/scissors...");
            userHand = scan.nextLine().toUpperCase();
        }}
        return userHand;
    }

    public static String computerHand() {
        Random rnd = new Random();
        int randomChoice = rnd.nextInt(0, 3);
        String computerHand = "";
        switch (randomChoice) {
            case 0:
                computerHand = "ROCK";
                break;
            case 1:
                computerHand = "PAPER";
                break;
            case 2:
                computerHand = "SCISSORS";
                break;
        }
        System.out.println("Computer chose: " + computerHand);
        return computerHand;
    }

    public static String winner(String userHand, String computerHand) {
        if ((userHand.equals("ROCK") && computerHand.equals("SCISSORS")) || (userHand.equals("PAPER") && computerHand.equals("ROCK")) || (userHand.equals("SCISSORS") || computerHand.equals("PAPER"))) {
            System.out.println("USER WINS THIS ROUND");
        } else if (userHand.equals(computerHand)) {
            System.out.println("IT IS A DRAW!");
        } else {
            System.out.println("COMPUTER WINS THIS ROUND");
        }
        return "";
    }
}
