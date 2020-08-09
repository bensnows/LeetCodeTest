package easy;

/*Runtime: 3 ms, faster than 24.78% of Java online submissions for Reverse Integer.
 *Memory Usage: 37 MB, less than 57.83% of Java online submissions for Reverse Integer.
 */
public class ReverseInt {
	public static void main(String[] args) {
		System.out.println(reverse(-521));
		//System.out.println(reverse(9646324351)); over int limit
	}

	public static int reverse(int x) {
		int pre = x > 0 ? 1 : -1;
		StringBuffer sb = new StringBuffer(new Integer(x * pre).toString());
		System.out.println(sb);
		return Integer.parseInt(sb.reverse().toString()) * pre;
	}
}
