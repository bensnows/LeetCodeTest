package test.easy;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import easy.PascalTriangle;

public class PascalTriangleTest {

	PascalTriangle test = new PascalTriangle();

	@Test
	void test() {
		int numRows = 5;
		List<List<Integer>> result = new ArrayList<>();
		result.add(Arrays.asList(new Integer[] { 1 }));
		result.add(Arrays.asList(new Integer[] { 1, 1 }));
		result.add(Arrays.asList(new Integer[] { 1, 2, 1 }));
		result.add(Arrays.asList(new Integer[] { 1, 3, 3, 1 }));
		result.add(Arrays.asList(new Integer[] { 1, 4, 6, 4, 1 }));

		assertEquals(result, test.generate(numRows));

	}

	@Test
	void test2() {
		int numRows = 1;
		List<List<Integer>> result = new ArrayList<>();
		result.add(Arrays.asList(new Integer[] { 1 }));

		assertEquals(result, test.generate(numRows));

	}
}
