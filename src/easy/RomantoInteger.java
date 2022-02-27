package easy;

import java.util.Map;

public class RomantoInteger {

	public int converter(String s) {

		Map<Character, Integer> map = Map.of(
						'I', 1, 
						'V', 5, 
						'X', 10, 
						'L', 50, 
						'C', 100, 
						'D', 500, 
						'M', 1000);
		
		Map<String, Integer> minus = Map.of(
						"IV", -2, 
						"IX", -2, 
						"XL", -20, 
						"XC", -20, 
						"CD", -200, 
						"CM", -200);
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
