package test.easy;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import easy.MergeTwoSortedLists;
import model.ListNode;

class MergeTwoSortedListsTest {

	MergeTwoSortedLists test = new MergeTwoSortedLists();

	@Test
	void test() {
		ListNode node = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));

		ListNode resultNode = test.merge(node, node2);

		int[] arr = new int[] { 1, 1, 2, 3, 4, 4 };

		for (int i = 0; i < arr.length; i++) {
			assertEquals(arr[i], resultNode.val);
			resultNode = resultNode.next;
		}

		assertNull(resultNode);
	}

	@Test
	void test2() {
		ListNode node = new ListNode(2);
		ListNode node2 = new ListNode(1);

		ListNode resultNode = test.merge(node, node2);

		int[] arr = new int[] { 1, 2 };

		for (int i = 0; i < arr.length; i++) {
			assertEquals(arr[i], resultNode.val);
			resultNode = resultNode.next;
		}

		assertNull(resultNode);
	}

}
