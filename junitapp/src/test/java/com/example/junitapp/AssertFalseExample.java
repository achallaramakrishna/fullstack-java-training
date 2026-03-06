package com.example.junitapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertFalseExample {

    @Test
    void testFalseCondition() {
        int marks = 30;
        assertFalse(marks >= 35);
    }
}