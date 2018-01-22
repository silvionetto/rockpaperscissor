package com.sn.rockpaperscissor.entity;

import com.sn.rockpaperscissor.enums.Shape;

/**
 * This interface contains the possible behaviours of the players.
 *
 */
public interface Player {

    /**
     * Forms one of three shapes.
     *
     * @return {@link Shape} in a random order.
     */
    Shape form();
}
