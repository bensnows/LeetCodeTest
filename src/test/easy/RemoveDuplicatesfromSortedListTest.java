package test.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.RemoveDuplicatesfromSortedList;
import model.ListNode;
import test.ListNodeComparator;

class RemoveDuplicatesfromSortedListTest {
	RemoveDuplicatesfromSortedList test = new RemoveDuplicatesfromSortedList();

	@Test
	void test() {
		ListNode node = new ListNode(1, new ListNode(1, new ListNode(2)));
		ListNode actual = test.deleteDuplicates(node);
		ListNode expectNode = new ListNode(1, new ListNode(2));
		boolean expected = true;
		assertEquals(expected, ListNodeComparator.equals(expectNode, actual));
	}

	@Test
	void test2() {
		ListNode node = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
		ListNode actual = test.deleteDuplicates(node);
		ListNode expectNode = new ListNode(1, new ListNode(2, new ListNode(3)));
		boolean expected = true;
		assertEquals(expected, ListNodeComparator.equals(expectNode, actual));
	}

}
