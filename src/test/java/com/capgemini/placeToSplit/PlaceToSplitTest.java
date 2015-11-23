package com.capgemini.placeToSplit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlaceToSplitTest {

	@Test
	public void shouldReturnFalseForOneNumber() {
		//given
		PlaceToSplit test = new PlaceToSplit();
		//when
	  	int[] array = new int[]{0};
	  	boolean result = test.canBalance(array);
		//then
		assertEquals(false, result);
	}
	
	@Test
	public void shouldReturnTrueForTwoTheSameNumbers() {
		//given
		PlaceToSplit test = new PlaceToSplit();
		//when
	  	int[] array = new int[]{2,2};
	  	boolean result = test.canBalance(array);
		//then
		assertEquals(true, result);
	}

	@Test
	public void shouldReturnFalseForTwoOtherNumbers() {
		//given
		PlaceToSplit test = new PlaceToSplit();
		//when
	  	int[] array = new int[]{6,9};
	  	boolean result = test.canBalance(array);
		//then
		assertEquals(false, result);
	}
	
	@Test
	public void shouldReturnTrueForThreeOtherNumbers() {
		//given
		PlaceToSplit test = new PlaceToSplit();
		//when
	  	int[] array = new int[]{5,7,12};
	  	boolean result = test.canBalance(array);
		//then
		assertEquals(true, result);
	}
	
	@Test
	public void shouldReturnFalseForThreeOtherNumbers() {
		//given
		PlaceToSplit test = new PlaceToSplit();
		//when
	  	int[] array = new int[]{5,6,1};
	  	boolean result = test.canBalance(array);
		//then
		assertEquals(false, result);
	}
	
	
	@Test
	public void shouldReturnTrueForManyNumberOne() {
		//given
		PlaceToSplit test = new PlaceToSplit();
		//when
	  	int[] array = new int[]{1,1,1,1,1,1,1,1,1,1};
	  	boolean result = test.canBalance(array);
		//then
		assertEquals(true, result);
	}
	
	@Test
	public void shouldReturnFalseForOtherNumbers() {
		//given
		PlaceToSplit test = new PlaceToSplit();
		//when
	  	int[] array = new int[]{100,1,100,1,1};
	  	boolean result = test.canBalance(array);
		//then
		assertEquals(false, result);
	}
}
