package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.PrimeRange;

class PrimeRangeTest {

	@Test
	void test() {
		assertEquals(1,PrimeRange.findPrime(1));
		assertEquals(1,PrimeRange.findPrime(2));
		assertEquals(0,PrimeRange.findPrime(0));
		assertEquals(0,PrimeRange.findPrime(-21));
		assertEquals(1,PrimeRange.findPrime(100));
		assertEquals(1,PrimeRange.findPrime(15));
	}

}
