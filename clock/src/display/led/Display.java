/*
 * private���ͳ�Ա������ֻ��ӵ�г�Ա�����ͳ�Ա������ֻ�����������
 * public���ͳ�Ա�����������ⲿ���з��� 
 * ����private����public�Ŀ�����ͬһ��������з���
 * ��ǰ��public��ʾ�κ�������������������������
 * һ��java�ļ���һ�����뵥Ԫ����public����������������ļ���һ�£����Զ�����������public����,һ�����뵥Ԫ�����һ��public
 * һ��.������Ĳ��
 * static �����/������ֻ��һ�γ�ʼ��  ���������  �����ж��������������Ĵ����޹�
 * */
package display.led;

public class Display {
	private int value = 0;
	private int limit = 0;
	
	private static int step = 0;
	
	public Display(int limit) {  //���캯��
		this.limit = limit;
	}
	public void increase() {
		value++;
		if(value == limit) {
			value = 0;
		}
	}
	public int getValue() {
		return value;
	}
	//�ຯ��
	public static void f() {
	//�ຯ�����ܷ��ʷ��ຯ����ֵ
//		d.value++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
		Display d = new Display(24);
		Display d1 = new Display(10);
		
		d1.increase();
		System.out.println(Display.step);
		System.out.println(Display.step);
		d1.step = 2;
		System.out.println(d1.step);
		System.out.println(d.step);
		//static �����
		Display.step = 3;
		System.out.println(d1.step);
		System.out.println(d.step);
//		for(;;) {
//			d.increase();
//			System.out.println(d.getValue());
//		}
	}

}
