package easy;

import model.TreeNode;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}

		return Math.abs(maxDepth(root.left) - maxDepth(root.right)) < 2
				? isBalanced(root.left) && isBalanced(root.right)
				: false;
	}

	private int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = 1;
		int right = 1;

		if (root.left != null) {
			left += maxDepth(root.left);
		}

		if (root.right != null) {
			right += maxDepth(root.right);
		}

		return left > right ? left : right;
	}
}
