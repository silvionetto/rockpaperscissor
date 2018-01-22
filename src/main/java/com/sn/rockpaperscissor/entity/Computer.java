package com.sn.rockpaperscissor.entity;

import com.sn.rockpaperscissor.enums.Shape;

import java.util.Random;

/**
 * This class represents the actions taken by the application.
 */
public class Computer implements Player {

    @Override
    public final Shape form() {
        final Shape[] shapes = Shape.values();
        final Random random = new Random();
        final int i = random.nextInt(shapes.length);
        return shapes[i];
    }

}
