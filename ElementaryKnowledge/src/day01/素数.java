/*
 * break,continue
 * */
package day01;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 1;
		for(int i = 2;i < n; i++) {
			if(n%i==0) {
				isPrime = 0;
				System.out.println(n+"��������");
				break;
			}
		}
		if(isPrime == 1) {
			System.out.println("������");
		}
		else {
			System.out.println("��������");
		}
	}

}
