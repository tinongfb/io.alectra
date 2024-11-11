package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class StringTest {
        @Test
    public void testEqualsStringTrue() {
        StringUtils stringEquals = new StringUtils();
        assertTrue(stringEquals.equalStrings("test", "test"), "this checks if the two texts are identical");
    }

    
    @Test
    public void testEqualsStringFalse() {
        StringUtils stringEquals = new StringUtils();
        assertFalse(stringEquals.equalStrings("test", "testttt"), "this checks if the two texts are not identical");
    }
}
