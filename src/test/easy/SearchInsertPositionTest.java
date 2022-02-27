package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.SearchInsertPosition;

public class SearchInsertPositionTest {

	SearchInsertPosition test = new SearchInsertPosition();

	@Test
	void test() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		assertEquals(2, test.searchInsert(nums, target));
	}

	@Test
	void test2() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		assertEquals(1, test.searchInsert(nums, target));
	}

	@Test
	void test3() {
		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		assertEquals(4, test.searchInsert(nums, target));
	}

}
