package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Power;

class PowerTest {

	@Test
	void test() {
		assertEquals(125.0,Power.calPower(5,3));
		assertEquals(1.0,Power.calPower(5,0));
		assertEquals(0.0,Power.calPower(0,3));
		assertEquals(4.0,Power.calPower(4,1));
		assertEquals(-125.0,Power.calPower(-5,3));
	}

}
