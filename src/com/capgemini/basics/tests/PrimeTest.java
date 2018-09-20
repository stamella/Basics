package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Prime;

class PrimeTest {

	@Test
	void test() {
		assertFalse(Prime.checkPrime(12));
		assertTrue(Prime.checkPrime(11));
		assertFalse(Prime.checkPrime(1));
	}

}
