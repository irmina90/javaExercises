package com.capgemini.pythagorean;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Pythagorean {
	public int[] findPythagoreanTriplet() {
		int results[] = new int[3];
		
		for(int a=0; a<1000; a++) {
			for(int b=a+1; b<1000; b++) {
				for(int c=b+1; c<1000; c++) {
					if(a+b+c==1000 && Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
						results[0] = a;
						results[1] = b;
						results[2] = c;
					}
				}
			}
		}
		
		return results;
	}
}
