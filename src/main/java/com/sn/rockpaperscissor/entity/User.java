package com.sn.rockpaperscissor.entity;

import com.sn.rockpaperscissor.enums.Shape;

import java.io.InputStream;
import java.util.Scanner;

/**
 * This class represents the user and his interaction in the system.
 */
public class User implements Player {
    /**
     * Receive the input from the user.
     */
    private final Scanner inputScanner;

    /**
     * Constructor receive System.in.
     *
     * @param input {@link InputStream}
     */
    public User(final InputStream input) {
        inputScanner = new Scanner(input);
    }

    /**
     * Forms one of three shapes.
     *
     * @return the shape chosen by the user
     */
    public Shape form() {
        Shape shape = null;
        do {
            System.out.println("Rock, Paper or Scissor?");

            String input = inputScanner.nextLine();
            input = input.toUpperCase();
            try {
                shape = Shape.valueOf(input);
            } catch (IllegalArgumentException e) {
                continue;
            }
        } while (shape == null);

        return shape;
    }

}
