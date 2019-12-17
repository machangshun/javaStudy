/*
 * 捕捉到异常但不能回去，如果这个异常不能处理，就将异常用throw抛出
 * finally最终
 * 
 * 异常机制的好处，将业务逻辑代码和有异常的代码分开
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
		}catch(NullPointerException e) {//与异常不匹配
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
