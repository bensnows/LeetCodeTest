package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import easy.ConvertSortedArrayToBinarySearchTree;
import easy.MaximumDepthBinaryTree;
import model.TreeNode;

public class ConvertSortedArrayToBinarySearchTreeTest {

	ConvertSortedArrayToBinarySearchTree test = new ConvertSortedArrayToBinarySearchTree();
	MaximumDepthBinaryTree depthClass = new MaximumDepthBinaryTree();

	@Test
	void test() {
		int[] arr = { -10, -3, 0, 9, 5 };

		TreeNode node = test.sortedArrayToBST(arr);
		assertEquals(0, node.val);

		int leftDepth = depthClass.maxDepth(node.left);
		int rightDepth = depthClass.maxDepth(node.right);
		int result = Math.abs(leftDepth - rightDepth);
		assertEquals(true, result < 2);

	}
}
