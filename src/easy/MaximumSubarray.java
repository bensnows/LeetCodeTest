package easy;

public class MaximumSubarray {

	public int maxSubArray(int[] nums) {

		int finalSum = nums[0];

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {

			sum += nums[i];
			if (sum > finalSum) {
				finalSum = sum;
			}

			if (sum < 0) {
				sum = 0;
			}
		}

		return finalSum;
	}
}
