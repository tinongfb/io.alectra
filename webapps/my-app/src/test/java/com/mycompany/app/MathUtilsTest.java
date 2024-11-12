package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class MathUtilsTest {
    	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "method should add");
	}
	
	@Test
	void testDivide() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "");
	}

	@Test
	void testCircleArea() {
		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "radius equals pi times square of radius");
	}
}
