package com.sn.rockpaperscissor.entity;

import java.util.Random;

public class Computer {

    /**
     * Forms one of three shapes.
     *
     * @return {@link Shape} in a random order.
     */
    public Shape form() {
        Shape[] shapes = Shape.values();
        Random random = new Random();
        int i = random.nextInt(shapes.length);
        return shapes[i];
    }

}
