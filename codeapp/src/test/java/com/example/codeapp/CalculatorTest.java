package com.example.codeapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void testDivide() {
        Calculator c = new Calculator();
        assertEquals(2, c.divide(10, 5));
    }
}