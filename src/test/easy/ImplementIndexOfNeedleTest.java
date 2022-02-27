package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import easy.ImplementIndexOfNeedle;

class ImplementIndexOfNeedleTest {

	ImplementIndexOfNeedle test = new ImplementIndexOfNeedle();

	@Test
	void test() {

		String haystack = "hello", needle = "ll";
		int result = test.strStr(haystack, needle);
		assertEquals(2, result);

		haystack = "aaaaa";
		needle = "bba";
		result = test.strStr(haystack, needle);
		assertEquals(-1, result);

		haystack = "";
		needle = "";
		result = test.strStr(haystack, needle);
		assertEquals(0, result);
		
		
		haystack = "";
		needle = "a";
		result = test.strStr(haystack, needle);
		assertEquals(-1, result);
	}

}
