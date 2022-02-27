package easy;

public class AddBinary {
	public String addBinary(String a, String b) {
	
		int aLen = a.length() - 1;
		char[] aArr = a.toCharArray();
		int bLen = b.length() - 1;
		char[] bArr = b.toCharArray();
		StringBuffer sb = new StringBuffer();
		int carry = 0;
		while (aLen >= 0 || bLen >= 0) {
			int chA = aLen >= 0 ? (int) aArr[aLen--] - '0' : 0;
			int chB = bLen >= 0 ? (int) bArr[bLen--] - '0' : 0;
			int val = chA + chB + carry;
			carry = val / 2 > 0 ? 1 : 0;
			sb.append(val % 2);
		}
		if(carry>0) {
			sb.append(1);
		}

		return sb.reverse().toString();
	}
}
