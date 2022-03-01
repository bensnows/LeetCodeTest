package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import easy.SameTree;
import model.TreeNode;

class SameTreeTest {
	SameTree test = new SameTree();

	@Test
	void test() {
		TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

		assertEquals(true, test.isSameTree(tree1, tree2));
	}

	@Test
	void test2() {
		TreeNode tree1 = new TreeNode(1, null, new TreeNode(3));
		TreeNode tree2 = new TreeNode(1, new TreeNode(2), null);

		assertEquals(false, test.isSameTree(tree1, tree2));
	}

	@Test
	void test3() {
		TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
		TreeNode tree2 = new TreeNode(1, new TreeNode(1), new TreeNode(2));

		assertEquals(false, test.isSameTree(tree1, tree2));
	}
}
