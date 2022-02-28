package test.easy;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import easy.BinaryTreeInorderTraversal;
import model.TreeNode;

class BinaryTreeInorderTraversalTest {

	BinaryTreeInorderTraversal test = new BinaryTreeInorderTraversal();

	@Test
	void test() {
		TreeNode oriTree = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
		Integer[] arr = { 1, 3, 2 };
		List<Integer> result = test.inorderTraversal(oriTree);
		List<Integer> node = Arrays.asList(arr);

		assertTrue(node.equals(result));
	}

	@Test
	void test2() {
		TreeNode oriTree = new TreeNode(1);
		Integer[] arr = { 1 };
		List<Integer> result = test.inorderTraversal(oriTree);
		List<Integer> node = Arrays.asList(arr);

		assertTrue(node.equals(result));
	}
}
