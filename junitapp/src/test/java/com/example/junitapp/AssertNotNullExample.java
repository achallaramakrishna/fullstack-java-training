package com.example.junitapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertNotNullExample {

    @Test
    void testNotNullValue() {
        String name = "Rama";
        assertNotNull(name);
    }
}