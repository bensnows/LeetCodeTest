package easy;

public class PlusOne {
	public int[] plusOne(int[] digits) {

		int index = digits.length - 1;
		boolean shift = true;
		for (; index >= 0; index--) {
			if (shift)
				digits[index]++;
			if (digits[index] == 10) {
				shift = true;
				digits[index] = 0;
			} else {
				return digits;
			}
		}

		int[] newArr = new int[digits.length + 1];
		newArr[0]++;
		for (int i = 1; i < digits.length; i++) {
			newArr[i + 1] = digits[i];
		}

		return newArr;
	}
}
