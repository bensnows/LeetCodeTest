package easy;

import model.ListNode;

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode prev = head;
		ListNode second = head.next;

		while (second != null) {
			if (prev.val == second.val) {
				prev.next = second.next;
			} else {
				prev = prev.next;
			}
			second = second.next;
		}

		return head;
	}
}
