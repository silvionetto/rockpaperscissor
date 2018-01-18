package com.sn.rockpaperscissor.entity;

import java.io.InputStream;
import java.util.Scanner;

public class User {
    private final Scanner inputScanner;

    /**
     * Constructor receive System.in.
     *
     * @param input
     */
    public User(InputStream input) {
      inputScanner = new Scanner(input);
    }

    /**
     * Forms one of three shapes.
     *
     * @return the shape chosen by the user
     */
    public Shape form() {
        System.out.println("Rock, Paper or Scissor?");

        String input = inputScanner.nextLine();
        input = input.toUpperCase();
        return Shape.valueOf(input);
    }

    /**
     * The game should repeat.
     * The command to exit the game is 'N'.
     *
     * @return false just if the user press 'N'
     */
    public boolean playAgain() {
        System.out.println("Do you want to play again?\n[Y]/N");
        String input = inputScanner.nextLine();
        return !"N".equalsIgnoreCase(input);
    }
}
