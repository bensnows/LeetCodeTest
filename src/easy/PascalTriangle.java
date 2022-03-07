package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>(numRows);
		list.add(Arrays.asList(new Integer[] { 1 }));
		if (numRows == 1) {
			return list;
		}

		for (int i = 1; i < numRows; i++) {

			List<Integer> prevNode = list.get(i - 1);
			List<Integer> current = new ArrayList<>(i);

			current.add(1);
			for (int j = 1; j <= i - 1; j++) {
				current.add(prevNode.get(j - 1) + prevNode.get(j));
			}
			current.add(1);
			list.add(current);
		}

		return list;
	}
}
