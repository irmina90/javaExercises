package com.capgemini.pascalrectangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PascalRectangleTest {
	
	@Test
	public void shouldReturnOneIfRowAndColAreTheSame() {
		//given
		PascalRectangle test = new PascalRectangle();
		//when
		long result = test.pascal(0,0);
		//then
		assertEquals(1, result);
	}
	
	@Test
	public void shouldReturnTen() {
		//given
		PascalRectangle test = new PascalRectangle();
		//when
		long resultFromFunction = test.pascal(2,5);
		//then
		assertEquals(10, resultFromFunction);
	}
	
	@Test
	public void shouldReturnBigNumber() {
		//given
		PascalRectangle test = new PascalRectangle();
		//when
		long resultFromFunction = test.pascal(4,9);
		//then
		assertEquals(126, resultFromFunction);
	}

}
