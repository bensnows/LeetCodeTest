package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.RomantoInteger;

public class RomanToIntTest {
	RomantoInteger test = new RomantoInteger();

	@Test
	void test() {
		assertEquals(3, test.converter("III"));
		assertEquals(1994, test.converter("MCMXCIV"));
	}
}
