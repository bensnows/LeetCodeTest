package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import easy.SymmetricTree;
import model.TreeNode;

class SymmetricTreeTest {

	SymmetricTree test = new SymmetricTree();

	@Test
	void test() {

		TreeNode tree1 = new TreeNode(2, new TreeNode(3), new TreeNode(4));
		TreeNode tree2 = new TreeNode(2, new TreeNode(4), new TreeNode(3));

		TreeNode node = new TreeNode(1, tree1, tree2);
		assertEquals(true, test.isSymmetric(node));
	}

	@Test
	void test2() {
		TreeNode tree1 = new TreeNode(2, null, new TreeNode(3));
		TreeNode tree2 = new TreeNode(2, null, new TreeNode(3));
		TreeNode node = new TreeNode(1, tree1, tree2);
		assertEquals(false, test.isSymmetric(node));
	}

}
