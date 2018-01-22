package com.sn.rockpaperscissor.entity;

import com.sn.rockpaperscissor.enums.Shape;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class UserTest {

    private User user;

    @Test
    public void test_form_rock() {
        user = new User(new ByteArrayInputStream("Rock".getBytes()));
        assertEquals(Shape.ROCK, user.form());
    }

    @Test
    public void test_form_paper() {
        user = new User(new ByteArrayInputStream("Paper".getBytes()));
        assertEquals(Shape.PAPER, user.form());
    }


    @Test
    public void test_form_scissor() {
        user = new User(new ByteArrayInputStream("Scissor".getBytes()));
        assertEquals(Shape.SCISSOR, user.form());
    }

    @Test
    public void test_form_wrong() {
        user = new User(new ByteArrayInputStream("Test\nScissor".getBytes()));
        assertEquals(Shape.SCISSOR, user.form());
    }
}
