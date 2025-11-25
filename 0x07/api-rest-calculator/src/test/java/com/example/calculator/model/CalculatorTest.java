package com.example.calculator.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        assertEquals(15.0, calculator.sum(5.0, 10.0));
    }

    @Test
    public void numbersNullSumTest() {
        assertThrows(NullPointerException.class, () -> calculator.sum(null, 5.0));
    }

    @Test
    void subTest() {
        assertEquals(5.0, calculator.sub(10.0, 5.0));
    }

    @Test
    void divideTest() {
        assertEquals(2.0, calculator.divide(10.0, 5.0));
    }

    @Test
    public void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10.0, 0.0));
    }

    @Test
    void factorialTest() {
        assertEquals(6, calculator.factorial(3));
    }

    @Test
    void integerToBinaryTest() {
        assertEquals(101, calculator.integerToBinary(5));
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("AA", calculator.integerToHexadecimal(170));
    }

    @Test
    void calculeDayBetweenDateTest() {
        assertEquals(1, calculator.calculeDayBetweenDate(LocalDate.of(2022, 12, 21), LocalDate.of(2022, 12, 22)));
    }
}