package test.easy;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import easy.MergeSortedArray;

class MergeSortedArrayTest {

	MergeSortedArray test = new MergeSortedArray();

	@Test
	void test() {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		int[] expected = { 1, 2, 2, 3, 5, 6 };
		test.merge(nums1, m, nums2, n);
		assertTrue(Arrays.equals(expected, nums1));
	}

	@Test
	void test2() {
		int[] nums1 = { 1 };
		int m = 1;
		int[] nums2 = {};
		int n = 0;
		int[] expected = { 1 };
		test.merge(nums1, m, nums2, n);
		assertTrue(Arrays.equals(expected, nums1));
	}

	@Test
	void test3() {
		int[] nums1 = { 0 };
		int m = 0;
		int[] nums2 = { 1 };
		int n = 1;
		int[] expected = { 1 };
		test.merge(nums1, m, nums2, n);
		assertTrue(Arrays.equals(expected, nums1));
	}

}
