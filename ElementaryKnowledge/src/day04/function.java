/*
 * ���뺯�����Ա����ظ�ʵ��һ����
 * ����һ����룬����0��������
 * ��һ���� ������0����һ��ֵ
 * ()��������������
 * �в����Ĵ�����
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
