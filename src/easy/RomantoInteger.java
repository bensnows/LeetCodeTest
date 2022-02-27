package easy;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

	public int converter(String s) {

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		Map<String, Integer> minus = new HashMap<>();
		minus.put("IV", -2);
		minus.put("IX", -2);
		minus.put("XL", -20);
		minus.put("XC", -20);
		minus.put("CD", -200);
		minus.put("CM", -200);
		int sum = 0;

		for (Character c : s.toCharArray()) {
			sum += map.get(c);
		}

		for (String key : minus.keySet()) {
			if (s.contains(key)) {
				sum += minus.get(key);
			}
		}

		return sum;
	}
}
