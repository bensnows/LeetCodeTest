package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.MinimumDepthOfBinaryTree;
import model.TreeNode;

public class MinimumDepthOfBinaryTreeTest {
	MinimumDepthOfBinaryTree test = new MinimumDepthOfBinaryTree();

	@Test
	void test() {
		TreeNode node = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(5), new TreeNode(7)));
		assertEquals(2, test.minDepth(node));
	}

	@Test
	void test2() {
		TreeNode node = new TreeNode(2, null,
				new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
		assertEquals(5, test.minDepth(node));
	}

	@Test
	void test3() {
		TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
		assertEquals(2, test.minDepth(node));
	}

	@Test
	void test4() {
		TreeNode node = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(5), new TreeNode(7)));
		assertEquals(2, test.minDepth2(node));
	}

	@Test
	void test5() {
		TreeNode node = new TreeNode(2, null,
				new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
		assertEquals(5, test.minDepth2(node));
	}

	@Test
	void test6() {
		TreeNode node = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
		assertEquals(2, test.minDepth2(node));
	}
}
