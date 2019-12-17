/*
 * break,continue
 * */
package day01;

import java.util.Scanner;

public class 素数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 1;
		for(int i = 2;i < n; i++) {
			if(n%i==0) {
				isPrime = 0;
				System.out.println(n+"不是素数");
				break;
			}
		}
		if(isPrime == 1) {
			System.out.println("是素数");
		}
		else {
			System.out.println("不是素数");
		}
	}

}
