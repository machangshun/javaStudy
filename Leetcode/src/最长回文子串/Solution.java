package 最长回文子串;

import java.util.HashSet;

public class Solution {
	public static boolean ishuiwen(String t) {
		for(int i = 0; i < t.length()/2; i++) {
			if(t.charAt(i) != t.charAt(t.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static String longestPalindrome(String s) {
		if(s.isEmpty()) {
			return "";
		}
		String temp = null;
		int max = 0;
		for(int i = 0; i < s.length()-max; i++) {
			for(int j = s.length(); j > i; j--) {
				//判断字符长度是否大于max
				if(max > j - i) {
					break;
				}
				else if(ishuiwen(s.substring(i,j))) {
					max = j - i ;
					temp = s.substring(i,j);
				}
			}
			
		}
		return temp;
	}
	public static void main(String[] args) {
		String  s = "baaccaaab";
		System.out.println(longestPalindrome(s));
	}
}
