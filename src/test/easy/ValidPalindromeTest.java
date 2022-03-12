package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import easy.ValidPalindrome;

public class ValidPalindromeTest {
	ValidPalindrome test = new ValidPalindrome();

	@Test
	void test() {
		String input = "A man, a plan, a canal: Panama";
		boolean expect = true;
		assertEquals(expect, test.isPalindrome(input));
	}

	@Test
	void test2() {
		String input = "race a car";
		boolean expect = false;
		assertEquals(expect, test.isPalindrome(input));
	}

	@Test
	void test3() {
		String input = " ";
		boolean expect = true;
		assertEquals(expect, test.isPalindrome(input));
	}
}
