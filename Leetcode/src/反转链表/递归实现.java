package 反转链表;

public class 递归实现 {
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode p = reverseList(head.next);
		head.next.next = head; //将两个节点倒转
		head.next = null; //倒转的与head链表分离
		return p;
		
	}
}
