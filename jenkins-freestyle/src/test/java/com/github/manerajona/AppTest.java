package com.github.manerajona;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {
    @Test
    void testRandomlyFails() {
        boolean pass = Math.random() > 0.5;
        assertTrue(pass, "This test randomly fails!");
    }
}
