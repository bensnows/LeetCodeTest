package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		if (rowIndex == 0) {
			return list;
		}
		list.add(1);
		if (rowIndex == 1) {
			return list;
		}

		for (int i = 2; i <= rowIndex; i++) {
			List<Integer> newList = new ArrayList<>();

			newList.add(1);
			for (int j = 1; j <= i - 1; j++) {
				newList.add(list.get(j - 1) + list.get(j));
			}
			newList.add(1);

			list = newList;
		}

		return list;
	}

}
