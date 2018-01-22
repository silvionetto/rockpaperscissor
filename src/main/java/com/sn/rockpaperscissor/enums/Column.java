package com.sn.rockpaperscissor.enums;

/**
 * Define the column sizes used in the statistics.
 * <ul>
 * <li>{@link #ONE}</li>
 * <li>{@link #TWO}</li>
 * <li>{@link #THREE}</li>
 * <li>{@link #FOUR}</li>
 * <li>{@link #FIVE}</li>
 * </ul>
 */
public enum Column {

    /**
     * Column one.
     */
    ONE(10),

    /***
     * Column two.
     */
    TWO(11),

    /**
     * Column three.
     */
    THREE(10),

    /**
     * Column four.
     */
    FOUR(16),

    /**
     * Column five.
     */
    FIVE(22);

    /**
     * The size of the column.
     */
    private final Integer size;

    /**
     * To create an instance of Column is necessary to inform the size.
     *
     * @param size the size of the column
     */
    Column(final Integer size) {
        this.size = size;
    }

    /**
     * Get the size of the column.
     *
     * @return {@link Integer} size.
     */
    public Integer getSize() {
        return size;
    }
}
