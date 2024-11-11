package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testGreet()
    {
        App app = new App();
        String result = app.greet("asd");
        assertEquals( "Hello, asd!", result);
    }
}
