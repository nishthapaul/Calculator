package org.example;

import org.example.exceptions.DivisionByZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void shouldGiveWholeNumberWhenBiggerDividesSmaller() throws DivisionByZeroException {
        int firstNumber = 6;
        int secondNumber = 2;
        double actualResult = 3;

        Calculator calculator = new Calculator();
        double expectedResult = calculator.divide(firstNumber, secondNumber);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldGiveDecimalNumberWhenSmallerDividesBigger() throws DivisionByZeroException {
        int firstNumber = 2;
        int secondNumber = 4;
        double actualResult = 0.5;

        Calculator calculator = new Calculator();
        double expectedResult = calculator.divide(firstNumber, secondNumber);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldThrowExceptionOnDivisionByZero() {
        int number = 2;
        assertThrows(DivisionByZeroException.class, () -> new Calculator().divide(number, 0));
    }

    @Test
    void shouldGiveSquareRootOfANumber() {
        double number = 4;
        double actualResult = 2;

        Calculator calculator = new Calculator();
        double expectedResult = calculator.squareRoot(number);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldThrowExceptionOnNegativeInputToSqrt() {
        double number = -1;
        assertThrows(IllegalArgumentException.class, () -> new Calculator().squareRoot(number));
    }

    @Test
    void shouldReturnOneForFactorialOfOne() {
        int number = 1;
        int actualResult = 1;
        Calculator calculator = new Calculator();

        int expectedValue = calculator.factorial(number);

        assertEquals(expectedValue, actualResult);
    }

    @Test
    void shouldReturnTwoForFactorialOfTwo() {
        int number = 2;
        int actualResult = 2;
        Calculator calculator = new Calculator();

        int expectedValue = calculator.factorial(number);

        assertEquals(expectedValue, actualResult);
    }

    @Test
    void shouldReturnSixForFactorialOfThree() {
        int number = 3;
        int actualResult = 6;
        Calculator calculator = new Calculator();

        int expectedValue = calculator.factorial(number);

        assertEquals(expectedValue, actualResult);
    }

    @Test
    void shouldThrowExceptionOnNegativeInputToFactorial() {
        int number = -1;
        assertThrows(IllegalArgumentException.class, () -> new Calculator().factorial(number));
    }

    @Test
    void shouldGivePowerOfTwoNumbers() {
        int firstNumber = 2;
        int secondNumber = 4;
        double actualResult = 16;

        Calculator calculator = new Calculator();
        double expectedResult = calculator.power(firstNumber, secondNumber);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturnLogarithmicOfGivenNumber() {
        int number = 3;
        double actualResult = Math.log(3);
        Calculator calculator = new Calculator();

        double expectedValue = calculator.log(number);

        assertEquals(expectedValue, actualResult);
    }

    @Test
    void shouldThrowExceptionOnNegativeInputToLogarithm() {
        int number = -1;
        assertThrows(IllegalArgumentException.class, () -> new Calculator().log(number));
    }
}