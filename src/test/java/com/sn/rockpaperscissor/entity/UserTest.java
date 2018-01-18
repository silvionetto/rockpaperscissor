package com.sn.rockpaperscissor.entity;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class UserTest {

    private User user;

    @Test
    public void test_form_rock() {
        System.setIn(new ByteArrayInputStream("Rock".getBytes()));
        user = new User(System.in);
        assertEquals(Shape.ROCK, user.form());
    }

    @Test
    public void test_form_paper() {
        System.setIn(new ByteArrayInputStream("Paper".getBytes()));
        user = new User(System.in);
        assertEquals(Shape.PAPER, user.form());
    }


    @Test
    public void test_form_scissor() {
        System.setIn(new ByteArrayInputStream("Scissor".getBytes()));
        user = new User(System.in);
        assertEquals(Shape.SCISSOR, user.form());
    }
}
