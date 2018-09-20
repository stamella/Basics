package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Discount;

class DiscountTest {

	@Test
	void test() {
		assertEquals(400.0,Discount.calDiscountedPrice(500,20));
		assertEquals(5100.0,Discount.calDiscountedPrice(6000,15));
	}

}
