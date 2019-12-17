package day01;

import java.util.Scanner;

public class 最大公约数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
//		int gcd = 0;
//		for(int i = 1; i <= a && i <= b;i++) {
//			if(a%i==0&&b%i==0) {
//				if (gcd < i) {
//					gcd = i;
//				}
//				
//			}
//		}
		int oa = a;
		int ob = b;
		while(b != 0) {
			int r = a % b;
			System.out.println("a="+a+" "+"b="+b);
			a = b;
			b = r;	
		}
		System.out.println(a);
	}

}
