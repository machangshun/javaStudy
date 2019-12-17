package practise;

import practise.ListNode;

public class temp {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ret = new ListNode(0);
		ListNode p = l1,q = l2,curr = ret;
		int carry = 0;
		while( p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = x + y + carry;
			carry = sum / 10;
			curr.next = new ListNode(sum%10);
			curr = curr.next;
			if(p != null) {
				p = p.next;
			}
			if(q != null) {
				q = q.next;
			}
		}
		if(carry > 0)
			curr.next = new ListNode(carry);
		return ret.next;
		
	}
	public static void main(String[] args) {
		String store = new String();
		store += "abcd";
		System.out.println(store.substring(0,store.length()-1));
		int[] a = new int[10];
	}
}
