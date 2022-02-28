package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import easy.IsSubsequence;

class IsSubsequenceTest {

	IsSubsequence test = new IsSubsequence();

	@Test
	void test() {
		String s = "abc";
		String t = "ahbgdc";
		boolean expected = true;
		assertEquals(expected, test.isSubsequence(s, t));
	}
	
	@Test
	void test2() {
		String s = "axc";
		String t = "ahbgdc";
		boolean expected = false;
		assertEquals(expected, test.isSubsequence(s, t));
	}

	@Test
	void test3() {
		String s = "acb";
		String t = "ahbgdc";
		boolean expected = false;
		assertEquals(expected, test.isSubsequence(s, t));
	}
}
