package com.example.dfreeman.calculatortdd;

import com.example.dfreeman.calculatortdd.Model.AdditionModel;
import com.example.dfreeman.calculatortdd.Model.DivisionModel;
import com.example.dfreeman.calculatortdd.Model.MultiplicationModel;
import com.example.dfreeman.calculatortdd.Model.SubtractionModel;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperatorUnitTest {

    private static final double DELTA = 1e-15;

    @Test
    public void addition_isCorrect() throws Exception {
        AdditionModel additionModel = new AdditionModel();
        assertEquals(additionModel.add(2, 2), 2 + 2);
    }

    @Test
    public void subtraction_isCorrect() throws Exception {
        SubtractionModel subtractionModel = new SubtractionModel();
        assertEquals(subtractionModel.sub(6, 2), 6 - 2);
    }

    @Test
    public void multiplication_isCorrect() throws Exception {
        MultiplicationModel multiplicationModel = new MultiplicationModel();
        assertEquals(multiplicationModel.mult(2, 2), 2 * 2);
    }

    @Test
    public void division_isCorrect() throws Exception {
        DivisionModel divisionModel = new DivisionModel();
        assertEquals(divisionModel.div(8.0, 2.0), 8.0 / 2.0, DELTA);
    }
}
