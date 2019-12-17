/*小技巧：
 * 当循环的数比较大时，可用较小的数来推出大数
 * */
package day01;

import java.util.Scanner;

public class 数数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count = 0;
		int number = in.nextInt();
		number = Math.abs(number);
		do{
			number /= 10;
			count++;
		}while(number > 0);
		System.out.println(count);
	}

}
