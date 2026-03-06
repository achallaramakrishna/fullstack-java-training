package com.example.junitapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertEqualsExample {

    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }
}