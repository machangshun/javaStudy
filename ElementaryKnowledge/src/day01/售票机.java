/*
 * 6 > 5 > 4 错
 * a == b == 6 错
 * a == b > false 错
 *	 两个浮点的比较:Math.abs(a-b) < le-6
 * */
package day01;

import java.util.Scanner;

public class 售票机 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.0;
		double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(a==b);
		System.out.println(Math.abs(a-b)<1e-6);
		Scanner in = new Scanner(System.in);
		System.out.print("请投币：");
		int amount = in.nextInt();
		if (amount >= 10) {
			System.out.println("****************");
			System.out.println("*	铁路专线		*");
			System.out.println("*	无指定座位票	*");
			System.out.println("*	票价：10元	*");
			System.out.println("****************");
			System.out.println("找零："+(amount-10));
		}
		else 
			System.out.println("投币不足！");
		
		
	}

}
