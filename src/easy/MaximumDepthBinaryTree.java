package easy;

import model.TreeNode;

public class MaximumDepthBinaryTree {
	public int maxDepth(TreeNode root) {
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
