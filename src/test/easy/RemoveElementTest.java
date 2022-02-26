package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import easy.RemoveElement;

class RemoveElementTest {
	RemoveElement test = new RemoveElement();

	@Test
	void test() {

		int[] oriArray = { 3, 2, 2, 3 };
		int[] expectedArr = { 2, 2 };
		int result = test.removeElement(oriArray, 3);

		assertEquals(expectedArr.length, result);

		for (int i = 0; i < expectedArr.length; i++) {
			assertEquals(expectedArr[i], oriArray[i]);
		}

	}

}
