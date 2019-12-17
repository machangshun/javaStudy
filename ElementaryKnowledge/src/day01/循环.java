package day01;

import java.util.Scanner;

public class 循环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int balance = 0;
		while (true) {
			System.out.print("请投币：");
			int amount = in.nextInt();
			balance += amount;
			if (balance >= 10) {
				System.out.println("****************");
				System.out.println("*	铁路专线		*");
				System.out.println("*	无指定座位票	*");
				System.out.println("*	票价：10元	*");
				System.out.println("****************");
				System.out.println("找零："+(balance-10));
				balance = 0;
			}
			else {
				System.out.println("投币不足！请继续投币");
			}
				
		}
			
	}

}
