package 无重复字符的最长子串;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	public int lengthOfLongerstSubstring(String s) {
/*
		String store = "";
		int max = 0;
		for(int i = 0; i < s.length(); i++) { 
			if(store.indexOf(s.charAt(i)) != -1) {
				//如果找到重复的话
				int temp = store.length();
				//将重复的字符切掉
				store = store.substring(store.indexOf(s.charAt(i))+1);
				//将当前最大子串长保存
				max = Math.max(temp, max);
			}
			store += s.charAt(i);
		}
		
		max = Math.max(store.length(), max);
		return max;
*/
		/*
		int n = s.length();
		Set<Character> set = new HashSet<Character>();
		int ans = 0,i = 0,j = 0;
		while(i < n && j < n) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			}
			else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
		*/
		/*
		int n = s.length(),ans = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int j = 0,i = 0; j < n; j++) {
			//如果map键值中包含该字符
			if(map.containsKey(s.charAt(j))) {
				//
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j),j+1);
		}
		return ans;
		*/
		/*int[26] 用于a~z或 A~Z
		 * ASCII码 int[128]
		 * ASCII码扩展 int[256]
		 */
		int n = s.length(),ans = 0;
		int[] index = new int[128];
		
		for(int j = 0, i = 0; j < n; j++) {
			i = Math.max(index[s.charAt(j)], i);
			ans = Math.max(ans,j - i + 1);
			index[s.charAt(j)] = j + 1;
		}
		return ans;
	}
	public static void main(String[] args) {
		Solution a = new Solution();
		System.out.println(a.lengthOfLongerstSubstring("abcabcs"));
	}
}
