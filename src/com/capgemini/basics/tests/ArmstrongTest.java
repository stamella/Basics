package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Armstrong;

class ArmstrongTest {

	@Test
	void test() {
		assertTrue(Armstrong.checkArmstrong(153));
		assertFalse(Armstrong.checkArmstrong(-153));
	}

}
