package org.example;

import org.example.exceptions.DivisionByZeroException;

public class Calculator {
    int add(int operand1, int operand2) {
        return operand1 + operand2;
    }

    int multiply(int operand1, int operand2) {
        return operand1 * operand2;
    }

    double divide(int operand1, int operand2) throws DivisionByZeroException {
        if ( operand2 == 0 )
            throw new DivisionByZeroException();
        return (double) operand1 / operand2;
    }

    double squareRoot(double operand) {
        return Math.sqrt(operand);
    }
}
