/*
 * 运算符优先级
 * 强制转换
 */

package day01;

import java.util.Scanner;

public class 浮点型 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double foot;
		double inch;
		System.out.println(1.2-1.1);
		Scanner in = new Scanner(System.in);
		foot = in.nextDouble();
		inch = in.nextDouble();
		System.out.println((int)(10/3.0));
		System.out.println("foot="+foot+",inch="+inch);
		System.out.println((int)((foot+inch/12)*0.3048*100));
	}

}
