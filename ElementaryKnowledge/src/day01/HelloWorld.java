package day01;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		//��������
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:"+in.nextLine());
		int price = 0;
		int amout = 100;
		System.out.print("������Ʊ�棺");
		amout = in.nextInt();
		System.out.print("�������");
		price = in.nextInt();
		System.out.println(amout+"-"+price+"="+(amout-price));
		

	}
	int heapSize = 8;
//	public void deletMin(int[]arr) {
//		swap(arr,index:1,heapSize);
//		heapSize--;
//		sink(arr,parentIndex:1);
//	}

}

