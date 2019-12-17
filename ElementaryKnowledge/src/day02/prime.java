/*
 * prime的算法优化
 * */
package day02;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		boolean isPrime = true;
//		int x = in.nextInt();
		int[] primes = new int[50];
		primes[0] = 2;
		int cnt = 1;
//		if(x == 1 || x % 2 == 0 || x == 2) {
//			isPrime = false;
//		}else{
//			for(int i = 3;i < x; i+=2) {
//				if(x % i == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			for(int i = 3; i < Math.sqrt(x);i+=2) {
//				if(x % i == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//		}
		MAIN_LOOP:
		for(int i = 3; cnt < 50; i++) {
			for(int x = 0; x < cnt; x++) {
				if(i % primes[x] == 0) {
					continue MAIN_LOOP;
				}
			}
			primes[cnt++] = i;
		}
//		System.out.println(isPrime);
		for(int K:primes) {
			System.out.println(K+" ");
		}
	}

}

