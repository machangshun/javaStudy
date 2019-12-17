/*
 * 流程图 状态 椭圆
 * 判断 菱形
 * 执行语句 长方形
 * 输入输出 平行四边形
 * 判断 
 * if(){} else{}
 * 级联的：if(){} else if(){} else()
 * */
package day01;

import java.util.Scanner;

public class 判断 {

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
