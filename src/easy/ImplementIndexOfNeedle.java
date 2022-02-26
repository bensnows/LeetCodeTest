package easy;

public class ImplementIndexOfNeedle {

	public int strStr(String haystack, String needle) {

		if (haystack.length() == 0 && needle.length() == 0) {
			return 0;
		}

		return haystack.indexOf(needle);
	}

}
