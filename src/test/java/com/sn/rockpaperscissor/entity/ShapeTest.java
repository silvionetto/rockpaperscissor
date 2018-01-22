package com.sn.rockpaperscissor.entity;

import com.sn.rockpaperscissor.enums.Result;
import com.sn.rockpaperscissor.enums.Shape;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShapeTest {
    private Shape shape;

    @Test
    public void test_compare_rock() {
        shape = Shape.ROCK;

        Shape rock = Shape.ROCK;
        assertEquals(Result.TIE, shape.compare(rock));

        Shape paper = Shape.PAPER;
        assertEquals(Result.LOSE, shape.compare(paper));

        Shape scissor = Shape.SCISSOR;
        assertEquals(Result.WIN, shape.compare(scissor));
    }

    @Test
    public void test_compare_paper() {
        shape = Shape.PAPER;

        Shape rock = Shape.ROCK;
        assertEquals(Result.WIN, shape.compare(rock));

        Shape paper = Shape.PAPER;
        assertEquals(Result.TIE, shape.compare(paper));

        Shape scissor = Shape.SCISSOR;
        assertEquals(Result.LOSE, shape.compare(scissor));
    }

    @Test
    public void test_compare_scissor() {
        shape = Shape.SCISSOR;

        Shape rock = Shape.ROCK;
        assertEquals(Result.LOSE, shape.compare(rock));

        Shape paper = Shape.PAPER;
        assertEquals(Result.WIN, shape.compare(paper));

        Shape scissor = Shape.SCISSOR;
        assertEquals(Result.TIE, shape.compare(scissor));
    }
}
