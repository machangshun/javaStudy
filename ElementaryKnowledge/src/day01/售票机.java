/*
 * 6 > 5 > 4 ��
 * a == b == 6 ��
 * a == b > false ��
 *	 ��������ıȽ�:Math.abs(a-b) < le-6
 * */
package day01;

import java.util.Scanner;

public class ��Ʊ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.0;
		double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(a==b);
		System.out.println(Math.abs(a-b)<1e-6);
		Scanner in = new Scanner(System.in);
		System.out.print("��Ͷ�ң�");
		int amount = in.nextInt();
		if (amount >= 10) {
			System.out.println("****************");
			System.out.println("*	��·ר��		*");
			System.out.println("*	��ָ����λƱ	*");
			System.out.println("*	Ʊ�ۣ�10Ԫ	*");
			System.out.println("****************");
			System.out.println("���㣺"+(amount-10));
		}
		else 
			System.out.println("Ͷ�Ҳ��㣡");
		
		
	}

}
