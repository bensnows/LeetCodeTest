package easy;

import model.ListNode;

public class MergeTwoSortedLists {

	public ListNode merge(ListNode list1, ListNode list2) {

		if (list1 == null) {
			return list2;
		}

		if (list2 == null) {
			return list1;
		}
		boolean pick1 = list1.val < list2.val;
		
		ListNode node =  pick1 ? list1 : list2;

		ListNode prevNode = pick1 ? list1 : list2;
		ListNode reviewNode = pick1 ? list1 : list2;
		ListNode remainingNode = pick1 ? list2 : list1;

		while (reviewNode != null && remainingNode != null) {
			if (reviewNode.val > remainingNode.val) {
				prevNode.next = remainingNode;
				prevNode = prevNode.next;
				ListNode tempNode = remainingNode.next;
				remainingNode.next = reviewNode;
				remainingNode = tempNode;
			} else {
				prevNode = reviewNode;
				reviewNode = reviewNode.next;
			}
		}

		if (remainingNode != null) {
			prevNode.next = remainingNode;
		}

		return node;
	}

}
