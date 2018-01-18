package com.sn.rockpaperscissor.entity;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShapeTest {
    private Shape shape;

    @Test
    public void test_compare_rock() {
        shape = Shape.ROCK;

        Shape rock = Shape.ROCK;
        assertEquals(0, shape.compare(rock));

        Shape paper = Shape.PAPER;
        assertEquals(-1, shape.compare(paper));

        Shape scissor = Shape.SCISSOR;
        assertEquals(1, shape.compare(scissor));
    }

    @Test
    public void test_compare_paper() {
        shape = Shape.PAPER;

        Shape rock = Shape.ROCK;
        assertEquals(1, shape.compare(rock));

        Shape paper = Shape.PAPER;
        assertEquals(0, shape.compare(paper));

        Shape scissor = Shape.SCISSOR;
        assertEquals(-1, shape.compare(scissor));
    }

    @Test
    public void test_compare_scissor() {
        shape = Shape.SCISSOR;

        Shape rock = Shape.ROCK;
        assertEquals(-1, shape.compare(rock));

        Shape paper = Shape.PAPER;
        assertEquals(1, shape.compare(paper));

        Shape scissor = Shape.SCISSOR;
        assertEquals(0, shape.compare(scissor));
    }
}
