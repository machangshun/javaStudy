package z×ÖÐÎ±ä»»;

import java.util.ArrayList;

public class Solution {
	 public static String convert(String s, int numRows) {
		 if(numRows == 1) {
			return s;
		 }
		 String res = "";
		 char[][] hash = new char[numRows][s.length()];
		 int i = 0,j = 0;
		 boolean flag1 = false,flag2 = false;
		 for(char k : s.toCharArray()) {
			 if(i == numRows) {
				 flag1 = false;
				 flag2 = true;
				 i--;
			 }
			 if(flag2) {
				 int total = i + j;
				 hash[--i][++j] = k;
			 }
			 if(i == 0) {
				 flag1 = true;
				 flag2 = false;
			 }
			 if(flag1) {
				 hash[i++][j] = k;
			 } 
		 }
		 for(int i1 = 0; i1 < numRows; i1++) {
			 for(int j1 = 0; j1 < s.length(); j1++) {
				 if(hash[i1][j1] != 0) {
					 res += hash[i1][j1];
				 }
			 }
		 }
		 return res;
	 }
	 public static void main(String[] args) {
		 String s = "AB";
		 System.out.println(convert(s,1));
	 }
}
