/*
 *一开始：for(0,1,3){2}
 *后续：for(;2;1){3} 
 *有固定次数用for
 *必需执行一次do while
 *其他情况：while
 * */
package day01;

import java.util.Scanner;

public class 阶乘 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int result = 1;
		int n = in.nextInt();
//		while(n != 0) {
//			result *= n;
//			n -= 1;
//		}
		for(int i=n;i!=n;i--) {
			result *= i;
		}
		System.out.println("result="+result);
	}

}
