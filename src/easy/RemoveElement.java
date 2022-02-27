package easy;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {

		int oriIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[oriIndex++] = nums[i];
			}
		}

		return oriIndex++;
	}
}
