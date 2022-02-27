package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.ValidParentheses;

class ValidParenthesesTest {

	ValidParentheses test = new ValidParentheses();

	@Test
	void test() {
		assertEquals(true, test.isValidPath("()"));
		assertEquals(true, test.isValidPath("()[]{}"));
		assertEquals(false, test.isValidPath("(]"));
	}

}
