package com.sn.rockpaperscissor;

import com.sn.rockpaperscissor.entity.Computer;
import com.sn.rockpaperscissor.entity.Player;
import com.sn.rockpaperscissor.entity.User;
import com.sn.rockpaperscissor.enums.Column;
import com.sn.rockpaperscissor.enums.Line;
import com.sn.rockpaperscissor.enums.Result;
import com.sn.rockpaperscissor.enums.Shape;

import java.io.InputStream;
import java.util.Scanner;

/**
 * This class represents the java application to run an instance of the game.
 */
public final class RockPaperScissor {

    /**
     * Receive the input from the user.
     */
    private final Scanner inputScanner;

    /**
     * The user in the game.
     */
    private final Player user = new User(System.in);

    /**
     * The computer in the game.
     */
    private final Player computer = new Computer();

    /**
     * The user's score.
     */
    private int userScore;

    /**
     * The computer's score.
     */
    private int computerScore;

    /**
     * The number of ties in the game.
     */
    private int ties;

    /**
     * The number of matches.
     */
    private int count;

    /**
     * Constructor receive System.in.
     *
     * @param input {@link InputStream}
     */
    public RockPaperScissor(final InputStream input) {
        inputScanner = new Scanner(input);
    }

    /**
     * Start game!
     */
    private void start() {
        final Shape userChoice = user.form();
        final Shape computerChoice = computer.form();
        System.out.printf("You chose %s\n", userChoice);
        System.out.printf("The computer chose %s\n", computerChoice);
        checkResult(userChoice, computerChoice);
        if (playAgain()) {
            System.out.println("");
            start();
        } else {
            statistics();
        }
    }

    /**
     * The game should repeat.
     * The command to exit the game is 'N'.
     *
     * @return false just if the user press 'N'
     */
    private boolean playAgain() {
        System.out.println("Do you want to play again?\n[Y]/N");
        final String input = inputScanner.nextLine();
        return !"N".equalsIgnoreCase(input);
    }

    /**
     * Check the result of the match.
     *
     * @param userChoice     the shape chosen by the user
     * @param computerChoice the shape chosen by the computer
     */
    private void checkResult(final Shape userChoice,
                             final Shape computerChoice) {
        final Result result = userChoice.compare(computerChoice);
        switch (result) {
            case TIE:
                System.out.println("The game is tied!");
                ties++;
                break;
            case WIN:
                System.out.println("You won!");
                userScore++;
                break;
            case LOSE:
                System.out.println("You lose!");
                computerScore++;
                break;
            default:
                System.out.println("Error checking results.");
        }
        count++;
    }

    /**
     * Print the statistics.
     */
    private void statistics() {
        System.out.print(Line.INTERSECTION.getCharacter());
        printDashes(Line.START.getSize());
        System.out.println(Line.INTERSECTION.getCharacter());

        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "Wins", "Defeats", "Ties", "Games Played",
                "Winning Percentage");

        System.out.print(Line.START.getCharacter());
        printDashes(Column.ONE.getSize());
        System.out.print(Line.INTERSECTION.getCharacter());
        printDashes(Column.TWO.getSize());
        System.out.print(Line.INTERSECTION.getCharacter());
        printDashes(Column.THREE.getSize());
        System.out.print(Line.INTERSECTION.getCharacter());
        printDashes(Column.FOUR.getSize());
        System.out.print(Line.INTERSECTION.getCharacter());
        printDashes(Column.FIVE.getSize());
        System.out.println(Line.END.getCharacter());

        final double percentage = (userScore + ((double) ties) / 2) / count;
        System.out.printf("|  %6d  |  %6d   |  %6d  |  %12d  |  %13.2f%%      |\n",
                userScore, computerScore, ties, count, percentage * 100);

        System.out.print(Line.INTERSECTION.getCharacter());
        printDashes(Line.END.getSize());
        System.out.println(Line.INTERSECTION.getCharacter());
    }

    /**
     * Print dashes multiple times.
     *
     * @param quantity the number of dashes to be printed
     */
    private void printDashes(final int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.print("-");
        }
    }

    /**
     * Start application.
     *
     * @param args No arguments are necessary
     */
    public static void main(final String... args) {
        final RockPaperScissor app = new RockPaperScissor(System.in);
        app.start();
    }
}
