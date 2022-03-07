package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.PathSum;
import model.TreeNode;

class PathSumTest {

	PathSum test = new PathSum();

	@Test
	void test() {
		Integer[] array = new Integer[] { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 };

		TreeNode node = TreeNode.builder(array);
		int targetSum = 22;
		assertEquals(true, test.hasPathSum(node, targetSum));
	}

	@Test
	void test2() {
		Integer[] array = new Integer[] { 1, 2, 3 };

		TreeNode node = TreeNode.builder(array);
		int targetSum = 5;
		assertEquals(false, test.hasPathSum(node, targetSum));
	}

	@Test
	void test3() {
		Integer[] array = new Integer[] {};

		TreeNode node = TreeNode.builder(array);
		int targetSum = 0;
		assertEquals(false, test.hasPathSum(node, targetSum));
	}

}
