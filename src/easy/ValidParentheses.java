package easy;

import java.util.Stack;

public class ValidParentheses {

	public boolean isValidPath(String str) {
		Stack<Character> stack = new Stack<>();

		char[] chars = str.toCharArray();

		for (Character c : chars) {
			if (c.equals('(') || c.equals('[') || c.equals('{')) {
				stack.add(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				Character ch = stack.pop();
				if (ch.equals('{') && c.equals('}')) {

				} else if (ch.equals('(') && c.equals(')')) {

				} else if (ch.equals('[') && c.equals(']')) {

				} else {
					return false;
				}
			}
		}

		return stack.isEmpty();

	}
}
