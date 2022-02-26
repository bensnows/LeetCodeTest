package test.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import easy.TestisPalindrome;

class PalindromeTest {

	TestisPalindrome test = new TestisPalindrome();

	@Test
	void test() {
		
		int num= 535;
		
		boolean result = test.isPalindrome(num);
		
		assertTrue(result);

		
		
		result = test.isPalindrome(377);
		
		assertFalse(result);

	}

}
