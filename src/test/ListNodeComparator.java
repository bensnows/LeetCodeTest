package test;

import model.ListNode;

public class ListNodeComparator {

	public static boolean equals(ListNode node1, ListNode node2) {

		if (node1 == null && node2 == null) {
			return true;
		} else if (node1 != null && node2 != null && (node1.val == node2.val)) {
			return equals(node1.next, node2.next);
		} else {
			return false;
		}

	}

}
