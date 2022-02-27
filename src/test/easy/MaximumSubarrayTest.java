package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import easy.MaximumSubarray;

class MaximumSubarrayTest {
	MaximumSubarray test = new MaximumSubarray();

	@Test
	void test() {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		assertEquals(6, test.maxSubArray(nums));
	}

	@Test
	void test2() {
		int[] nums = { 1 };
		assertEquals(1, test.maxSubArray(nums));
	}

	@Test
	void test3() {
		int[] nums = { 5, 4, -1, 7, 8 };
		assertEquals(23, test.maxSubArray(nums));
	}

	@Test
	void test4() {
		int[] nums = { -1 };
		assertEquals(-1, test.maxSubArray(nums));
	}

}
