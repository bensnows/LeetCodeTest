package easy;

public class LongestCommonPrefix {

	public String getPrefix(String[] strs) {
		String result = strs[0];

		for (int i = 1; i < strs.length; i++) {
			
			while (!strs[i].startsWith(result) && result.length() > 0) {
				result = result.substring(0, result.length() - 1);
				if(result.isEmpty()) return "";
			}

		}

		return result;
	}
}
