package easy;

import java.util.ArrayList;
/*Runtime: 8 ms, faster than 65.41% of Java online submissions for Palindrome Number.
Memory Usage: 39 MB, less than 60.15% of Java online submissions for Palindrome Number.
 * 
 * */
public class Palindrome {
	public static void main(String[] args) {
		System.out.println(testPalidrome(500));
	}

	private static boolean testPalidrome(int x) {
		int remain = x;
		if (x >= 0) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			while (remain / 10 >= 1 ) {
				list.add(remain % 10);
				remain/=10;
			}
			list.add(remain);
			
			for(int index = 0; index<(list.size()/2);index++) {
				if(list.get(index)!=list.get(list.size()-1-index)){
					return false;
				}
			}
			
			return true;
		}
		return false;

	}
}
