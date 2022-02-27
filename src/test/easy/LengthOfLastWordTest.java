package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import easy.LengthOfLastWord;

class LengthOfLastWordTest {

	LengthOfLastWord test = new LengthOfLastWord();

	@Test
	void test() {
		String s = "Hello World";
		assertEquals(5, test.lengthOfLastWord(s));
	}

	
	@Test
	void test2() {
		String s = "   fly me   to   the moon  ";
		assertEquals(4, test.lengthOfLastWord(s));
	}
	
	@Test
	void test3() {
		String s = "luffy is still joyboy";
		assertEquals(6, test.lengthOfLastWord(s));
	}

}
