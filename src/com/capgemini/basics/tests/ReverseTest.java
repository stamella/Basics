package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Reverse;

class ReverseTest {

	@Test
	void test() {
		assertEquals(396,Reverse.findReverse(693));
		assertEquals(0,Reverse.findReverse(-693));
		assertEquals(654321,Reverse.findReverse(123456));
	}

}
