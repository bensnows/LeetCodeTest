package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.AddBinary;

class AddBinaryTest {

	AddBinary test = new AddBinary();

	@Test
	void test() {
		String a = "11";
		String b = "1";
		String expected = "100";

		assertEquals(expected, test.addBinary(a, b));
	}

	@Test
	void test2() {
		String a = "1010";
		String b = "1011";
		String expected = "10101";

		assertEquals(expected, test.addBinary(a, b));
	}

}
