package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.PlusOne;

class PlusOneTest {

	PlusOne test = new PlusOne();

	@Test
	void test() {
		int[] oriArray = { 1, 2, 3 };
		int[] result = test.plusOne(oriArray);
		int[] expected = { 1, 2, 4 };

		for (int i = 0; i < expected.length; i++)
			assertEquals(expected[i], result[i]);
		assertEquals(expected.length, result.length);
	}

	@Test
	void test2() {
		int[] oriArray = { 4, 3, 2, 1 };
		int[] result = test.plusOne(oriArray);
		int[] expected = { 4, 3, 2, 2 };

		for (int i = 0; i < expected.length; i++)
			assertEquals(expected[i], result[i]);
		assertEquals(expected.length, result.length);
	}

	@Test
	void test3() {
		int[] oriArray = { 9 };
		int[] result = test.plusOne(oriArray);
		int[] expected = { 1, 0 };

		for (int i = 0; i < expected.length; i++)
			assertEquals(expected[i], result[i]);
		assertEquals(expected.length, result.length);
	}

	@Test
	void test4() {
		int[] oriArray = { 0 };
		int[] result = test.plusOne(oriArray);
		int[] expected = { 1 };

		for (int i = 0; i < expected.length; i++)
			assertEquals(expected[i], result[i]);

		assertEquals(expected.length, result.length);
	}

	@Test
	void test5() {
		int[] oriArray = { 8, 9, 9, 9 };
		int[] result = test.plusOne(oriArray);
		int[] expected = { 9, 0, 0, 0 };

		for (int i = 0; i < expected.length; i++)
			assertEquals(expected[i], result[i]);

		assertEquals(expected.length, result.length);
	}
}
