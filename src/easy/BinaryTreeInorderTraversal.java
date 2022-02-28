package easy;

import java.util.ArrayList;
import java.util.List;

import model.TreeNode;

public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {

		if (root == null) {
			return null;
		}
		List<Integer> node = new ArrayList<Integer>();
		node.add(root.val);

		TreeNode left = root.left;
		TreeNode right = root.right;

		if (left == null && right != null) {
			if (right.left != null) {
				left = right.left;
				right.left = null;
			} else if (right.right != null) {
				left = right.right;
				right.right = null;
			} else {
				left = right;
				right = null;
			}
		}
		node.add(left.val);
		node.add(right.val);

		return node;
	}
}
