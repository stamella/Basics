package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Permutation;

class PermutationTest {

	@Test
	void test() {
		assertEquals(20.0,Permutation.calPermutation(5,2));
		assertEquals(10.0,Permutation.calCombination(5,2));
		assertEquals(1.0,Permutation.calPermutation(1,0));
		assertEquals(120.0,Permutation.calPermutation(5,5));
		assertEquals(1.0,Permutation.calCombination(5,5));
		assertEquals(1.0,Permutation.calPermutation(0,2));
		assertEquals(0.5,Permutation.calCombination(0,2));
	}

}
