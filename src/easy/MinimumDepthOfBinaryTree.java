package easy;

import java.util.LinkedList;
import java.util.Queue;

import model.TreeNode;

public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else if (root.left != null && root.right != null) {
			int left = minDepth(root.left);
			int right = minDepth(root.right);
			return left > right ? right + 1 : left + 1;
		} else if (root.left == null && root.right == null) {
			return 1;
		} else if (root.right == null) {
			return minDepth(root.left) + 1;
		} else {
			return minDepth(root.right) + 1;
		}
	}

	public int minDepth2(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		int depth = 1;
		queue.add(root);
		while (!queue.isEmpty()) {
			int length = queue.size();
			for (int i = 0; i < length; i++) {
				TreeNode node = queue.poll();
				if (node.left == null && node.right == null) {
					return depth;
				}

				if (node.left != null) {
					queue.add(node.left);
				}

				if (node.right != null) {
					queue.add(node.right);
				}
			}

			depth++;

		}

		return depth;
	}
}
