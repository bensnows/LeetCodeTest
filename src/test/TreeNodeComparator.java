package test;

import model.TreeNode;

public class TreeNodeComparator {

	public static boolean equals(TreeNode node1, TreeNode node2) {
		if (node1 == null && node2 == null) {
			return true;
		} else if (node1 != null && node2 != null && node1.val == node2.val) {
			return equals(node1.left, node2.left) && equals(node1.right, node2.right);
		} else {
			return false;
		}
	}
}
