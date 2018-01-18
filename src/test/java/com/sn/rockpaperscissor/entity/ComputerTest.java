package com.sn.rockpaperscissor.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    private Computer computer;

    @Before
    public void before() {
        computer = new Computer();
    }

    @Test
    public void test_form() {
        assertNotNull(computer.form());
        assertTrue(computer.form() instanceof Shape);
    }
}
