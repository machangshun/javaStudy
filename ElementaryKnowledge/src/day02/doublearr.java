package day02;

import java.util.Scanner;

public class doublearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[][] num = new int[3][3];
		for(int i = 0; i < num.length;i++) {
			for(int j = 0; j < num[i].length;j++) {
				num[i][j] = i + j;
			}
		}
		for(int i = 0; i < num.length;i++) {
			for(int j = 0; j < num[i].length;j++) {
				System.out.printf("%d",num[i][j]);
				if(j != num[i].length-1) {
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}

}
