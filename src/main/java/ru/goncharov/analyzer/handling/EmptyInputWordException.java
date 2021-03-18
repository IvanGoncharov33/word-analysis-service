package ru.goncharov.analyzer.handling;

public class EmptyInputWordException extends RuntimeException {
    public EmptyInputWordException(String message) {
        super(message);
    }
}
