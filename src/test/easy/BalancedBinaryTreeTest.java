package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import easy.BalancedBinaryTree;
import model.TreeNode;

class BalancedBinaryTreeTest {

	BalancedBinaryTree test = new BalancedBinaryTree();

	@Test
	void test() {
		TreeNode node = new TreeNode(3, new TreeNode(9), new TreeNode(0, new TreeNode(15), new TreeNode(7)));

		assertEquals(true, test.isBalanced(node));
	}

	@Test
	void test2() {
		assertEquals(true, test.isBalanced(null));
	}

	@Test
	void test3() {
		TreeNode node = new TreeNode(1,
				new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));

		assertEquals(false, test.isBalanced(node));
	}

	@Test
	void test4() {
		TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null),
				new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4))));

		assertEquals(false, test.isBalanced(node));
	}
}
