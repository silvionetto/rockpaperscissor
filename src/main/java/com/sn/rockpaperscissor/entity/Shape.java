package com.sn.rockpaperscissor.entity;

/**
 * These shapes are "rock" (a closed fist), "paper" (a flat hand),
 * and "scissors" (a fist with the index and middle fingers extended, forming a V).
 */
public enum Shape {
    ROCK,
    PAPER,
    SCISSOR;

    /**
     * Compare between the shapes who beat who.
     *
     * @param another the value to be compared
     * @return -1 if the value to be compared lose,
     * 0 if both are equals,
     * or 1 if the value to be compare wins.
     */
    public int compare(final Shape another) {
        if (this == another) {
            return 0;
        }

        switch (this) {
            case ROCK:
                return another == SCISSOR ? 1 : -1;
            case PAPER:
                return another == ROCK ? 1 : -1;
            case SCISSOR:
                return another == PAPER ? 1 : -1;
        }

        return 0;
    }
}
