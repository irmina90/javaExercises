package com.capgemini.fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void shouldReturnNull() {
		//given
		Fibonacci test = new Fibonacci();
		//when
		long result = test.fib(0);
		//then
		assertEquals(0, result);
	}
	
	@Test
	public void shouldReturnOne() {
		//given
		Fibonacci test = new Fibonacci();
		//when
		long result = test.fib(1);
		//then
		assertEquals(1, result);
	}
	
	@Test
	public void shouldReturnSixHundredTen() {
		//given
		Fibonacci test = new Fibonacci();
		//when
		long result = test.fib(14);
		//then
		assertEquals(377,result);
	}
	
	@Test
	public void shouldReturnBigNumber() {
		//given
		Fibonacci test = new Fibonacci();
		//when
		long result = test.fib(40);
		//then
		assertEquals(102334155, result);
	}

}
