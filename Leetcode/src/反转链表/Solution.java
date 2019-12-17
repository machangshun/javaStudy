//java虽然没有指针，但可以通过对象及 . 运算来实现链表
package 反转链表;

import java.util.ArrayList;

public class Solution {
	public ListNode reverseList(ListNode head) {
		ArrayList<Integer> store = new ArrayList<Integer>();
		ListNode p = new ListNode(0);
		ListNode curr = p;
		while(head != null) {
			store.add(head.val);
			head = head.next;
		}
		for(int i = store.size()-1; i >= 0; i--) {
			curr.next = new ListNode(store.get(i));//不能用curr去直接new一个，会脱离与p的关系
			curr = curr.next;
		}
		return p.next;
		
	}
}
