package test.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import easy.RemoveDuplicatesFromSortedArray;

class RemoveDuplicatesFromSortedArrayTest {

	RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();

	@Test
	void test() {
		int[] oriArray = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] expArray = { 0, 1, 2, 3, 4 };

		int resultLength = test.removeDuplicated(oriArray);
		assertEquals(resultLength, expArray.length);
		for (int i = 0; i < resultLength; i++) {
			assertEquals(oriArray[i], expArray[i]);
		}

	}

}
