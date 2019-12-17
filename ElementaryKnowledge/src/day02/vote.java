package day02;

import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] numbers = new int[10];
		int x;
		x = in.nextInt();
		while(x != 0) {
			if (x >= 0 && x <= 9) {
				numbers[x] ++;
			}
			x = in.nextInt();
		}
		for(int i = 0; i < numbers.length;i++) {
			System.out.println(i+":"+numbers[i]);
			
		}
	}

}
