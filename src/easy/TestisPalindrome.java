package easy;

public class TestisPalindrome {

	public static boolean isPalindrome(int num) {

		if (num < 0) {
			return false;
		}

		String result = Integer.toString(num);
		int length = result.length();
		for (int i = 0; i < length / 2; i++) {
			if (result.charAt(i) == result.charAt(length - 1 - i)) {

			} else {
				return false;
			}
		}

		return true;
	}
}
