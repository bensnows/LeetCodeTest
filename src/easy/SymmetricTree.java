package easy;

import model.TreeNode;

/**
 * @author �s https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		return isSameTree(root.left, root.right);
	}

	private boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		} else if ((p != null) && (q != null) && (p.val == q.val)) {
			return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
		} else {
			return false;
		}
	}
}
