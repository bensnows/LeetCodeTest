package easy;

import java.util.LinkedList;
import java.util.Queue;

import model.TreeNode;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return false;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int length = queue.size();
			for (int i = 0; i < length; i++) {
				TreeNode node = queue.poll();

				if (node.left == null && node.right == null && node.val == targetSum) {
					return true;
				}

				if (node.left != null) {
					node.left.val += node.val;
					queue.add(node.left);
				}

				if (node.right != null) {
					node.right.val += node.val;
					queue.add(node.right);
				}
			}
		}

		return false;
	}
}
