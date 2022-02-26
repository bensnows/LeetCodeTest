package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.LongestCommonPrefix;

class LongestCommonPrefixTest {

	LongestCommonPrefix test = new LongestCommonPrefix();

	@Test
	void test() {
		assertEquals("fl", test.getPrefix(new String[] { "flower", "flow", "flight" }));
		assertEquals("", test.getPrefix(new String[] { "dog", "racecar", "car" }));
		assertEquals("", test.getPrefix(new String[] { "c", "acc", "ccc" }));
	}

}
