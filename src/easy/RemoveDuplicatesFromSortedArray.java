package easy;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicated(int[] nums) {
		int num = nums.length;

		int currentIndex = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[currentIndex]) {
				num--;
			} else {
				nums[++currentIndex] = nums[i];
			}
		}

		return num;
	}
}
