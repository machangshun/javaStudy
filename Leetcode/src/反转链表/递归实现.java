package ��ת����;

public class �ݹ�ʵ�� {
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode p = reverseList(head.next);
		head.next.next = head; //�������ڵ㵹ת
		head.next = null; //��ת����head�������
		return p;
		
	}
}
