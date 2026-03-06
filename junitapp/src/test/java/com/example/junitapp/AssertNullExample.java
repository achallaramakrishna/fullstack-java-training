package com.example.junitapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertNullExample {

    @Test
    void testNullValue() {
        String name = null;
        assertNull(name);
    }
}