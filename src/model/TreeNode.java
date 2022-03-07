package model;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public static TreeNode builder(Integer[] array) {
		if (array.length == 0) {
			return null;
		}
		TreeNode node = new TreeNode(array[0]);

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);

		for (int i = 1; i < array.length; i++) {
			TreeNode currentNode = queue.poll();
			if (array[i] != null) {
				TreeNode node1 = new TreeNode(array[i]);
				currentNode.left = node1;
				queue.add(node1);
			}
			i++;
			if (i < array.length && array[i] != null) {
				TreeNode node2 = new TreeNode(array[i]);
				currentNode.right = node2;
				queue.add(node2);
			}

		}

		return node;
	}
}