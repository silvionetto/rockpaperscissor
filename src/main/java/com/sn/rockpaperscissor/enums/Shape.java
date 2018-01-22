package com.sn.rockpaperscissor.enums;

/**
 * Shapes that can be used.
 * <ul>
 * <li>{@link #ROCK}</li>
 * <li>{@link #PAPER}</li>
 * <li>{@link #SCISSOR}</li>
 * </ul>
 */
public enum Shape {

    /**
     * a closed fist.
     */
    ROCK,

    /**
     * a flat hand.
     */
    PAPER,

    /**
     * a fist with the index and middle fingers extended, forming a V.
     */
    SCISSOR;

    /**
     * Compare between the shapes who beat who based in the strength of the shape.
     *
     * @param another the value to be compared
     * @return {@link Result} according with the strength of the s.
     */
    public Result compare(final Shape another) {
        Result result = null;
        if (this == another) {
            result = Result.TIE;
        } else {
            switch (this) {
                case ROCK:
                    if (another == SCISSOR) {
                        result = Result.WIN;
                    } else {
                        result = Result.LOSE;
                    }
                    break;
                case PAPER:
                    if (another == ROCK) {
                        result = Result.WIN;
                    } else {
                        result = Result.LOSE;
                    }
                    break;
                case SCISSOR:
                    if (another == PAPER) {
                        result = Result.WIN;
                    } else {
                        result = Result.LOSE;
                    }
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }

        return result;
    }
}
