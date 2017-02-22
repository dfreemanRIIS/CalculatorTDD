package com.example.dfreeman.calculatortdd;

import com.example.dfreeman.calculatortdd.Controller.Controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControllerUnitTest {

    private Controller controller;
    private static final double DELTA = 1e-15;

    @Before
    public void setUp() {
        controller = new Controller();
    }

    @Test
    public void controller_addition_isCorrect() {
        assertEquals(controller.Add(2, 2), 2 + 2);
    }

    @Test
    public void controller_subtraction_isCorrect() {
        assertEquals(controller.Subtract(6, 2), 6 - 2);
    }

    @Test
    public void controller_multiplication_isCorrect() {
        assertEquals(controller.Multiply(2, 2), 2 + 2);
    }

    @Test
    public void controller_division_isCorrect() {
        assertEquals(controller.Divide(8.0, 2.0), 8.0 + 2.0, DELTA);
    }
}
