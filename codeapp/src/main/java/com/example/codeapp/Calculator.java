package com.example.codeapp;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b cannot be zero");
        }
        return a / b;
    }
}