package test.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import medium.LongestCommonSubsequence;

class LongestCommonSubsequenceTest {
	LongestCommonSubsequence test = new LongestCommonSubsequence();

	@Test
	void test() {
		String s = "abcde";
		String t = "ace";
		int expected = 3;
		assertEquals(expected, test.longestCommonSubsequence(s, t));
	}

	@Test
	void test2() {
		String s = "abc";
		String t = "abc";
		int expected = 3;
		assertEquals(expected, test.longestCommonSubsequence(s, t));
	}

	@Test
	void test3() {
		String s = "bl";
		String t = "yby";
		int expected = 1;
		assertEquals(expected, test.longestCommonSubsequence(s, t));
	}

	@Test
	void test4() {
		String s = "psnw";
		String t = "vozsh";
		int expected = 1;
		assertEquals(expected, test.longestCommonSubsequence(s, t));
	}

	@Test
	void test5() {
		String s = "oxcpqrsvwf";
		String t = "shmtulqrypy";
		int expected = 2;
		assertEquals(expected, test.longestCommonSubsequence(s, t));
	}
}
