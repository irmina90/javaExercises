package com.capgemini.pythagorean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class PythagoreanTest {

	@Test
	public void shouldReturnRightNumbers() {
		//given
		Pythagorean test = new Pythagorean();
		int[] results;
		//when
		results = test.findPythagoreanTriplet();
		//then
		assertEquals(200, results[0]);
		assertEquals(375, results[1]);
		assertEquals(425, results[2]);
	}
	
	@Test
	public void shouldReturnWrongNumbers() {
		//given
		Pythagorean test = new Pythagorean();
		int[] results;
		//when
		results = test.findPythagoreanTriplet();
		//then
		assertNotEquals(2, results[0]);
		assertNotEquals(3, results[1]);
		assertNotEquals(4, results[2]);
	}

}
