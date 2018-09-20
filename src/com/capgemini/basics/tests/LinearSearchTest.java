package com.capgemini.basics.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.LinearSearch;

class LinearSearchTest {

	@Test
	void test() {
		assertEquals(true,LinearSearch.findElement(4));
		assertEquals(false,LinearSearch.findElement(8));
		assertEquals(false,LinearSearch.findElement(-1));
		
	}

	
}
