package com.capgemini.basics.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.basics.Electricity;

class ElectricityBillTest {

	@Test
	void test() {
		assertEquals(795.0,Electricity.calcBill(265));
		assertEquals(0.0,Electricity.calcBill(0));
		assertEquals(0.0,Electricity.calcBill(-265));
	}

}
