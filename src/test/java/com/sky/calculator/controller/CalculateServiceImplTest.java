package com.sky.calculator.controller;

import org.junit.jupiter.api.Test;

import static com.sky.calculator.controller.CalculateServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateServiceImplTest {

    private final CalculateService calculateService = new CalculateServiceImpl();




    @Test
    public void testMinus() {
        assertEquals(ONE, calculateService.calculate(FOUR, THREE, MINUS));
    }

    @Test
    public void testPlus() {
        assertEquals(FIVE, calculateService.calculate(FOUR, ONE, PLUS));
    }

    @Test
    public void testMultiply() {
        assertEquals(SIX, calculateService.calculate(TWO, THREE, MULTIPLY));
    }

    @Test
    public void testDivide() {
        assertEquals(SEVEN, calculateService.calculate(SEVEN, ONE, DIVIDE));
    }
}
