package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void shouldAddTwoNumbers() {
        int firstNumber = 2;
        int secondNumber = 4;
        int actualResult = 6;

        Calculator calculator = new Calculator();
        int expectedResult = calculator.add(firstNumber, secondNumber);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        int firstNumber = 2;
        int secondNumber = 4;
        int actualResult = 8;

        Calculator calculator = new Calculator();
        int expectedResult = calculator.multiply(firstNumber, secondNumber);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        int firstNumber = 2;
        int secondNumber = 4;
        int actualResult = -2;

        Calculator calculator = new Calculator();
        int expectedResult = calculator.subtract(firstNumber, secondNumber);

        assertEquals(expectedResult, actualResult);
    }
}