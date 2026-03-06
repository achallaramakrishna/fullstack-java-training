package com.example.junitapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionsDemoTest {

    @Test
    void testAssertEquals() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void testAssertNotEquals() {
        assertNotEquals(5, 2 + 2);
    }

    @Test
    void testAssertTrue() {
        assertTrue(10 > 5);
    }

    @Test
    void testAssertFalse() {
        assertFalse(10 < 5);
    }

    @Test
    void testAssertNull() {
        String data = null;
        assertNull(data);
    }

    @Test
    void testAssertNotNull() {
        String data = "JUnit";
        assertNotNull(data);
    }

    @Test
    void testAssertThrows() {
        assertThrows(ArithmeticException.class, () -> {
            int x = 100 / 0;
        });
    }
}