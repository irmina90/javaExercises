package com.capgemini.placeToSplit;

/**
 * Given a non-empty array, return true if there is a place to split the array
 * so that the sum of the numbers on one side is equal to the sum of the numbers
 * on the other side. Example: {{{ canBalance({1, 1, 1, 2, 1}) → true
 * canBalance({2, 1, 1, 2, 1}) → false canBalance({10, 10}) → true }}}
 */
public class PlaceToSplit {

	public boolean canBalance(int[] nums) {
		boolean canBalance = false;
		
		if (nums.length >= 2) {
			int sumLeft = nums[0], sumRight = nums[nums.length - 1];
			int back = nums.length - 2;

			for (int front = 1; front <= back; front++) {
				if (sumLeft <= sumRight) {
					sumLeft = sumLeft + nums[front];
				} else {
					sumRight = sumRight + nums[back];
				}
				back--;
			}

			if (sumLeft == sumRight) {
				canBalance = true;	
			}
		}
		
		return canBalance;
		

	}
}