package easy;

public class ClimbingStairs {

	public int climbStairs(int n) {

		if (n <= 2) {
			return n;
		}

//		int[] result = new int[n];
		int prevStep = 1;
		int nextStep = 2;

		int finalStep = 0;
		for (int i = 2; i < n; i++) {
			finalStep = prevStep + nextStep;
			prevStep = nextStep;
			nextStep = finalStep;
		}

		return finalStep;
	}
}
