package easy;

import model.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {

		if (nums.length == 0) {
			return null;
		}
		TreeNode node = new TreeNode(nums[0]);
		if (nums.length == 1) {
			return node;
		}

		return buildNode(nums, 0, nums.length - 1);
	}

	private TreeNode buildNode(int[] nums, int start, int end) {
		System.out.println(String.format("start:%s, end:%s", start, end));
		if (start > end) {
			return null;
		}
		int center = (end - start) / 2 + start;
		TreeNode node = new TreeNode(nums[center]);

		node.left = buildNode(nums, start, center - 1);
		node.right = buildNode(nums, center + 1, end);

		return node;
	}

}
