/*�ඨ��������
 * ���ඨ����������
 * ����Ķ�����Ա���������Ķ�����ʹ��
 * ��ֵ������ı���
 * ���ݸ���Ҫ�������ĺ���
 * �Ž���Ÿ�������������
 * 
 * ���಻�ܸ�������
 * 
 * 
 * ��������Ƕ�̬�ģ������ܱ��治ֹһ�����͵Ķ���
 * ���ǿ��Ա�������������͵Ķ��󣬻����������͵�����Ķ���
 * ��������Ķ���ֵ������ı���ʱ���ͷ�������������
 * ����һ������ı����������һ���������ʱΪ����
 * 
 * */
package StudentManage;

import java.util.ArrayList;

public class Student{
	public Student(String no,String name) {
		super();
		this.no = no;
		this.name = name;
		// TODO Auto-generated constructor stub
		
	}
	private String no;
	private String name;
	public String getNo() {
		return this.no;
	}

	public void print() {
		System.out.print(no+" "+name+":");
	}
}
