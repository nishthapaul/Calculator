package org.example.exceptions;

public class DivisionByZeroException extends Throwable {
    @Override
    public String toString() {
        return "Division by zero is not allowed";
    }
}
