/*
 * ��׽���쳣�����ܻ�ȥ���������쳣���ܴ����ͽ��쳣��throw�׳�
 * finally����
 * 
 * �쳣���Ƶĺô�����ҵ���߼���������쳣�Ĵ���ֿ�
 * */
package catcherror;

import java.util.Scanner;

public class error {

	public static void f() {
		int[] a = new int[10];
		a[10] = 10;
		System.out.println("hello");
	} 
	
	public static void g() {
		f();
	}
	
	public static void h() {
		int i = 10;
		if(i < 100) {
			g();
		}
	}
	
	public static void k() {
		try {
			h();
			System.out.println("in k()");
		}catch(NullPointerException e) {//���쳣��ƥ��
			System.out.println("K()");
			throw e;
		}finally {
			System.out.println("Finally");
		}
	}
	public static void main(String[] args) {
//		int[] a = new int[10];
//		int idx;
//		Scanner in = new Scanner(System.in);
//		idx = in.nextInt();
//		try {
//			a[idx] = 10;
//			System.out.println("hello");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Caught");
//		}
		try {
			k();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("main");
	}

}
