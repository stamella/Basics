package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.BinarySearch;

class BinarySearchTest {

	@Test
	void test() {
		assertEquals(true,BinarySearch.findElement(25));
	}

}
