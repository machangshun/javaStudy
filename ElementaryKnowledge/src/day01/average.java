package day01;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int total = num;
		int temp = 0;
		while(num != 0) {
			int i = in.nextInt();
			temp += i;
			num -= 1;
		}
		if(total > 0) {
			System.out.println(temp);
			System.out.println("aver="+(double)temp/total);
		}
		
	}

}
