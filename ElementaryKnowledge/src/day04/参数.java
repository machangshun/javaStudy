/*��������char->int->double
 * ����ܹ�����խ��
 * ����ʱֻ�Ǵ�ֵ���������������������βΣ�����ʱ����ʵ��
 * ����ÿ�����в���һ�������Ŀռ䣬������ռ��еı����Ƕ��еı��ر���������Ҳ�Ǳ��ر���
 * �����ڣ�ʲôʱ��ʼ���ֵ�ʲôʱ����ʧ
 * ��ʲô��Χ�ڿ��Է����������
 */
package day04;

public class ���� {
	public static void swap(int a,int b) {
		int t;
		t = a;
		a = b; 
		b = t;
	}
	public static int factor(int i) {
		if(i == 1) {
			return i;
		}
		return i*factor(i-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		swap(a,b);
		System.out.println(a);
		factor(4);
	}

}
