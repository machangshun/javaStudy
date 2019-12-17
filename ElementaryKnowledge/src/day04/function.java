/*
 * 引入函数可以避免重复实现一件事
 * 它是一块代码，接收0或多个参数
 * 做一件事 并返回0个或一个值
 * ()代表调用这个参数
 * 有参数的传参数
 * 
 * */
package day04;

public class function {
	public static void isPrime() {
		boolean[] isPrime = new boolean[100];
		for(int i = 2; i < isPrime.length;i++) {
			isPrime[i] = true;
		}
		for(int i = 2; i < isPrime.length;i++) {
			if(isPrime[i]) {
				for(int k = 2;i*k < isPrime.length; k++) {
					isPrime[i*k] = false;
				}
			}
		}
		for(int i = 2; i < isPrime.length;i++) {
			if(isPrime[i]) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPrime();
	}

}
