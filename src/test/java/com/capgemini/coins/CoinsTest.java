package com.capgemini.coins;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CoinsTest {

	@Test
	public void shouldReturnEmpty() {
		//given
		Coins test = new Coins();
		List<Integer> coins = new ArrayList<Integer>();
		//when
		int result = test.solution(coins);
		//then
		assertEquals(-1, result);
	}
	
	@Test
	public void shouldReturnNull() {
		//given
		Coins test = new Coins();
		List<Integer> coins = new ArrayList<Integer>();
		//when
		coins.add(0);
		int result = test.solution(coins);
		//then
		assertEquals(0, result);
	}
	
	@Test
	public void shouldReturnOne() {
		//given
		Coins test = new Coins();
		List<Integer> coins = Arrays.asList(1,1,1);
		//when
		int result = test.solution(coins);
		//then
		assertEquals(1, result);
	}
	
	@Test
	public void shouldReturnFour() {
		//given
		Coins test = new Coins();
		List<Integer> coins = Arrays.asList(1,1,0,1,0,0);
		//when
		int result = test.solution(coins);
		//then
		assertEquals(4, result);
	}

}
