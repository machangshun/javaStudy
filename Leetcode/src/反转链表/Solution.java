//java��Ȼû��ָ�룬������ͨ������ . ������ʵ������
package ��ת����;

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
			curr.next = new ListNode(store.get(i));//������currȥֱ��newһ������������p�Ĺ�ϵ
			curr = curr.next;
		}
		return p.next;
		
	}
}
