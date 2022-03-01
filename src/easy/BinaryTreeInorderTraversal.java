package easy;

import java.util.ArrayList;
import java.util.List;

import model.TreeNode;

/**
 * @author ·s
 * in order
 * sequence of get value:<br/>
 * left->center->right<br/>
 *     4<br/>
 *    / \<br/>
 *	 2   6<br/>
 *	/ \ / \<br/>
 * 1  3 5  7<br/>
 * 1234567
 */
public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> node = new ArrayList<>();
		
		getNode(root, node);
		
		return node;
	}

	private void getNode(TreeNode root, List<Integer> node) {
		if(root!=null) {
			getNode(root.left, node);
			node.add(root.val);
			getNode(root.right, node);
		}
	}
}
