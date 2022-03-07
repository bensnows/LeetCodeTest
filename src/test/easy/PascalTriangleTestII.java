package test.easy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import easy.PascalTriangleII;

public class PascalTriangleTestII {

	PascalTriangleII test = new PascalTriangleII();

	@Test
	void test() {
		int numRows = 3;
		List<Integer> result = Arrays.asList(new Integer[] { 1, 3, 3, 1 });
		assertEquals(result, test.getRow(numRows));
	}

	@Test
	void test1() {
		int numRows = 0;
		List<Integer> result = Arrays.asList(new Integer[] { 1 });
		assertEquals(result, test.getRow(numRows));
	}

	@Test
	void test2() {
		int numRows = 1;
		List<Integer> result = Arrays.asList(new Integer[] { 1, 1 });
		assertEquals(result, test.getRow(numRows));
	}
}
