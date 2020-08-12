package easy;

public class PrefixString {

	public static void main(String[] args) {
		String[] array = { "flower", "ow", "flight" };
		System.out.println("Result"+getPrefix(array));
		System.out.println(longestCommonPrefix(array));
	}
	/*
	 * Runtime: 1 ms, faster than 71.40% of Java online submissions for Longest Common Prefix.
Memory Usage: 37.6 MB, less than 74.04% of Java online submissions for Longest Common
	 * 
	 * */
	private static String getPrefix(String[] array) {
		if (array == null) {
			return "";
		}
		StringBuffer sb = new StringBuffer();

		Integer length = null;

		for (String str : array) {
			if (length == null || str.length() < length) {
				length = str.length();
			}
		}
		label: for (int i = 0; i < length; i++) {
			char ch = array[0].charAt(i);
			int result = -1;
			for (String str : array) {
				result = ch ^ str.charAt(i);
				if (result != 0) {
					break label;
				}
			}
			sb.append(ch);
		}
		return sb.toString();
	}
	
	/*Runtime: 1 ms, faster than 71.40% of Java online submissions for Longest Common Prefix.
Memory Usage: 37.5 MB, less than 84.25% of Java online submissions for Longest Common Prefix.
	 * 
	 * */
	public static String longestCommonPrefix(String[] array) {
        if (array == null||array.length==0) {
			return "";
		}
		StringBuffer sb = new StringBuffer();

		Integer length = null;

		for (String str : array) {
			if (length == null || str.length() < length) {
				length = str.length();
			}
		}
		label: for (int i = 0; i < length; i++) {
			char ch = array[0].charAt(i);
			int result = -1;
			for (int j = 1;j<array.length;j++) {
				result = ch ^ array[j].charAt(i);
				if (result != 0) {
					break label;
				}
			}
			sb.append(ch);
		}
		return sb.toString();
    }

}
