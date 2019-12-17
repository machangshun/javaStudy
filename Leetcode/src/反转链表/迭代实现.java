package 反转链表;

public class 迭代实现 {
	public ListNode reverseList(ListNode head) {
	       ListNode prev = null;
			ListNode curr = head;
			while(curr != null) {
				ListNode nextTemp = curr.next;
				curr.next = prev;
				prev = curr;
				curr = nextTemp;
			}
			return prev;
	    }
}
