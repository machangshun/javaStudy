/*
 * ����ͼ ״̬ ��Բ
 * �ж� ����
 * ִ����� ������
 * ������� ƽ���ı���
 * �ж� 
 * if(){} else{}
 * �����ģ�if(){} else if(){} else()
 * */
package day01;

import java.util.Scanner;

public class �ж� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		int temp;
		if(x > y) {
			if(x>z) {
				temp = x;
			}else {
				temp = z;
			}
		}
		else {
			if(y > z) {
				temp = y;
			}else {
				temp = z;
			}	
		}
		System.out.println(temp);
		
	}

}
