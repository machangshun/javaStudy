/*С���ɣ�
 * ��ѭ�������Ƚϴ�ʱ�����ý�С�������Ƴ�����
 * */
package day01;

import java.util.Scanner;

public class ������ {

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
