package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Factorial;

class FactorialTest {

	@Test
	void test() {
		assertEquals(120,Factorial.findFact(5));
		assertEquals(0,Factorial.findFact(-5));
	}

}
