package com.sn.rockpaperscissor.enums;

/**
 * Define the line used in the statistics.
 * <ul>
 * <li>{@link #START}</li>
 * <li>{@link #END}</li>
 * <li>{@link #INTERSECTION}</li>
 * </ul>
 */
public enum Line {

    /**
     * Character representing the start line.
     */
    START("|"),

    /**
     * Character representing the end line.
     */
    END("|"),

    /**
     * Character representing the intersection.
     */
    INTERSECTION("+");

    /**
     * Character used to represent each attribute of line.
     */
    private String character;

    /**
     * Size of the line.
     */
    private final Integer size = 73;

    /**
     * To create an instance of Line is necessary to inform wich character.
     *
     * @param character to be used in the attribute of line
     */
    Line(final String character) {
        this.character = character;
    }

    /**
     * Get the character used to represent the attribute.
     *
     * @return a character.
     */
    public String getCharacter() {
        return character;
    }

    /**
     * Get the size of the line.
     *
     * @return the size of the line.
     */
    public Integer getSize() {
        return size;
    }
}
