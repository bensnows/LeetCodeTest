package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.Sqrt;

class SqrtTest {
	Sqrt test = new Sqrt();

	@Test
	void test() {
		assertEquals(2, test.mySqrt(4));
	}

	@Test
	void test2() {
		assertEquals(2, test.mySqrt(8));
	}
}
