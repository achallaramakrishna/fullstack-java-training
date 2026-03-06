package com.example.junitapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DividerTest {

    Divider divider = new Divider();

    @Test
    void testDivide() {
        assertEquals(5, divider.divide(10, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            divider.divide(10, 0);
        });
    }
}