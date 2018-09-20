package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Average;

class AverageTest {

	@Test
	void test() {
		assertEquals(20.0,Average.calAverage(20,40,0));
		assertEquals(23.5366,Average.calAverage(20.124,40.235,10.250),0.09);
		assertEquals(0,Average.calAverage(0,0,0));
	}

}
