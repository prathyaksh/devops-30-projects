package com.dpt.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(1, 2);
        assertEquals(3, result);
    }
    void testSub() {
        Calculator calc = new Calculator();
        int result = calc.sub(2, 1);
        assertEquals(1, result);
    }
}
