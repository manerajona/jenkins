package com.github.manerajona;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void testMainPrintsHelloWorld() {
        // Backup original System.out
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run main
        App.main(new String[]{});

        // Restore original System.out
        System.setOut(originalOut);

        // Assert output
        String output = outContent.toString().trim();
        assertEquals("Hello World!", output);
    }
}
