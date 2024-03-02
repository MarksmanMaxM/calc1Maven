package com.sky.calculator.controller;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.sky.calculator.controller.CalculateServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateServiceImplParameterizedTest {

    private final CalculateService calculateService = new CalculateServiceImpl();

    public static Stream<Arguments> paramsForTest() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, THREE),
                Arguments.of(FOUR, SIX),
                Arguments.of(SEVEN, ZERO),
                Arguments.of(FOUR, TWO)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void testMinus(double a, double b) {
        assertEquals(a - b, calculateService.calculate(a, b, MINUS));
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void testPlus(double a, double b) {
        assertEquals(a + b, calculateService.calculate(a, b, PLUS));
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void testDivide(double a, double b) {
        assertEquals(a / b, calculateService.calculate(a, b, DIVIDE));
    }

    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void testMultiply(double a, double b) {
        assertEquals(a * b, calculateService.calculate(a, b, MULTIPLY));
    }



}
