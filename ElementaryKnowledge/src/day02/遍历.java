/*
 * for-each
 * */
package day02;

import java.util.Scanner;

public class 遍历 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] num = {3,2,3,4,5,6,7,8,9};
		int x = in.nextInt();
		int j = -1;
		boolean found = false;
		for(int i = 0; i < num.length;i++) {
			if(num[i] == x) {
				j = i;
				break;
			}
		}
		for(int k : num) {
			if(k == x) {
				found = true;
				break;
			}
		}
		if(j > -1) {
			System.out.println(x + "是第" + (j+1)+"个");
		}
		else {
			System.out.println();
		}
	}

}
