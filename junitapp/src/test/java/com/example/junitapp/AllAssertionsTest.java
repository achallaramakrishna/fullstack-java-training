package com.example.junitapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AllAssertionsTest {

    // Inner Calculator class
    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        int subtract(int a, int b) {
            return a - b;
        }

        int divide(int a, int b) {
            return a / b;
        }
    }

    Calculator cal = new Calculator();

    @Test
    void testAssertEquals() {
        // String example
        String name = "Rama";
        assertEquals(4, name.length());

        // Calculator example
        assertEquals(15, cal.add(10, 5));
    }

    @Test
    void testAssertNotEquals() {
        // Calculator example
        assertNotEquals(20, cal.subtract(10, 5));

        // String example
        String course = "Java";
        assertNotEquals("Python", course);
    }

    @Test
    void testAssertTrue() {
        // List example
        List<String> subjects = Arrays.asList("Java", "SQL", "HTML");
        assertTrue(subjects.contains("Java"));

        // Number example
        int salary = 5000;
        assertTrue(salary > 0);
    }

    @Test
    void testAssertFalse() {
        // List example
        List<String> subjects = Arrays.asList("Java", "SQL", "HTML");
        assertFalse(subjects.contains("Python"));

        // Condition example
        int age = 15;
        assertFalse(age >= 18);
    }

    @Test
    void testAssertNull() {
        // Null example
        String manager = null;
        assertNull(manager);
    }

    @Test
    void testAssertNotNull() {
        // Not null example
        String company = "Broadridge";
        assertNotNull(company);

        // Array example
        int[] numbers = {10, 20, 30};
        assertNotNull(numbers);
    }

    @Test
    void testAssertThrows() {
        // Exception example
        assertThrows(ArithmeticException.class, () -> {
            cal.divide(10, 0);
        });
    }
}	