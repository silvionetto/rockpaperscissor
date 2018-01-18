package com.sn.rockpaperscissor;

import com.sn.rockpaperscissor.entity.Computer;
import com.sn.rockpaperscissor.entity.Shape;
import com.sn.rockpaperscissor.entity.User;

/**
 * The RockPaperScissor represents the java application to run an instance of the game.
 */
public final class RockPaperScissor {

    private final User user = new User(System.in);
    private final Computer computer = new Computer();

    private int userScore;
    private int computerScore;
    private int ties;
    private int count;

    /**
     * Start game!
     */
    private void start() {
        Shape userChoice = user.form();
        Shape computerChoice = computer.form();
        System.out.printf("You chose %s\n", userChoice);
        System.out.printf("The computer chose %s\n", computerChoice);
        checkResult(userChoice, computerChoice);
        if (user.playAgain()) {
            System.out.println("");
            start();
        } else {
            statistics();
        }
    }

    /**
     * Check the result of the match.
     *
     * @param userChoice     the shape chosen by the user
     * @param computerChoice the shape chosen by the computer
     */
    private void checkResult(final Shape userChoice, final Shape computerChoice) {
        int compare = userChoice.compare(computerChoice);
        switch (compare) {
            case 0:
                System.out.println("The game is tied!");
                ties++;
                break;
            case 1:
                System.out.println("You won!");
                userScore++;
                break;
            case -1:
                System.out.println("You lose!");
                computerScore++;
                break;
        }
        count++;
    }

    /**
     * Print the statistics.
     */
    private void statistics() {
        System.out.print("+");
        printDashes(73);
        System.out.println("+");

        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "Wins", "Defeats", "Ties", "Games Played", "Winning Percentage");

        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(11);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(22);
        System.out.println("|");

        double percentage = (userScore + ((double) ties) / 2) / count;
        System.out.printf("|  %6d  |  %6d   |  %6d  |  %12d  |  %13.2f%%      |\n",
                userScore, computerScore, ties, count, percentage * 100);

        System.out.print("+");
        printDashes(73);
        System.out.println("+");
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
    public static void main(String... args) {
        RockPaperScissor app = new RockPaperScissor();
        app.start();
    }
}
