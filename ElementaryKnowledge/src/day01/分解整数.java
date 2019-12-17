package day01;

import java.util.Scanner;

public class 分解整数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int result = 0;
		number = in.nextInt();
		do {
			int digit = number % 10;
			result = result*10+digit;
			System.out.print(digit);
			number /= 10;
		}while(number != 0);
		System.out.println(result);
	}

}
