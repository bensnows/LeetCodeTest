package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.ClimbingStairs;

class ClimbingStairsTest {
	
	ClimbingStairs test = new ClimbingStairs();
	@Test
	void test() {
		assertEquals(2, test.climbStairs(2));
	}

	
	@Test
	void test2() {
		assertEquals(3, test.climbStairs(3));
	}
	
	@Test
	void test3() {
		assertEquals(5, test.climbStairs(4));
	}


}
