/*������һ������
 * �����ͬ����
 * ���������һ���ռ�����ߣ���ֵ�������������ʱ��һ��Ҳ������ռ�Ĺ�����
 * */
package day02;

public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; ++i) {
			numbers[i] = i;
			System.out.println(numbers[i]);
		}
		System.out.println(numbers[10]);
		int[] num = {12,3,4,5,6,7,8};
		System.out.println(num[5]);
		int[] num1 = num;
		num1[5] = 8;
		System.out.println(num[5]);
	}

}
