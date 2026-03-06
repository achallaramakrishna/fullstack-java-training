package com.example.junitapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertTrueExample {

    @Test
    void testTrueCondition() {
        int age = 20;
        assertTrue(age >= 18);
    }
}