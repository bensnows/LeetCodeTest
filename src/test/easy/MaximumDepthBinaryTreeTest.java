package test.easy;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import easy.MaximumDepthBinaryTree;
import model.TreeNode;

class MaximumDepthBinaryTreeTest {

	MaximumDepthBinaryTree test = new MaximumDepthBinaryTree();

	@Test
	void test() {
		TreeNode tree2 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
		TreeNode node = new TreeNode(3, new TreeNode(9), tree2);
		assertEquals(3, test.maxDepth(node));
	}

	@Test
	void test2() {
		TreeNode node = new TreeNode(1, null, new TreeNode(2));
		assertEquals(2, test.maxDepth(node));
	}

	
	@Test
	void test3() {
		assertEquals(0, test.maxDepth(null));
	}
}
