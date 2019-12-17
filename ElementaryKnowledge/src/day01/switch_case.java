/*
 * switch
 * */
package day01;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int type = in.nextInt();
		switch(type) {
		case 1:
		case 2:
			System.out.println("this is case2");
		case 3:
			System.out.println("this is case3");
			break;
		case 4:
		default:
			System.out.println("this is default");
			break;
		}
	}

}
