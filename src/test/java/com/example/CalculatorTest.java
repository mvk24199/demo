package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        assertEquals("Should return 5",5,calc.add(2,3));
    }

    @Test
    public void testMulitply(){
        Calculator calc = new Calculator();
        assertEquals("Should return 6",6,calc.add(2,3));
    }
}
