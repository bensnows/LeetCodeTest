package easy;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
	public static void main(String[] args) {
		int[] array = {2,7,11,15};
		int target = 9;
		int[] result = doSum(array,target);
		System.out.println(result[0]+" "+result[1]);
	}
	
	
	public static int[] doSum(int[] array, int target) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : array)
			list.add(i);
		for (int i = 0; i < array.length; i++) {
			int remain = target - array[i];
			int result = list.indexOf(remain);
			if (list.contains(remain) && result != i) {
				return new int[] { i, result };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
