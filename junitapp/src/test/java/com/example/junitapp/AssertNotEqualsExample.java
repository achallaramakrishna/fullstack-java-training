package com.example.junitapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertNotEqualsExample {

    @Test
    void testNotEqual() {
        int result = 10 - 3;
        assertNotEquals(5, result);
    }
}