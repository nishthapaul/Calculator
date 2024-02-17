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
}