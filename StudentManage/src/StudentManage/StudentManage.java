/*=============================================================================
 * �����е���ʱ��һ����еĽṹ���ɱ䣬�����ֵ�����ڵ���ʱ�ı�
 * ����Ķ�����Դ�������������ͣ�����ʱ���õ�������ķ���
 * �̳����ڸ��ƴ�������������Լ��ٺܶ಻��Ҫ���ظ���ı����ͷ����Ķ��壬����������ά���޸ġ�
 * �̳еĺ���Ĭ�ϵ��ø���ĺ��������ຯ�������ع�
 * ʹ�ü̳������ں��ڵ���չ
 * ============================================================================
 * object�ຯ�������е��඼�Ǽ̳���Object��
 * */
package StudentManage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
	//����һ��ѧ�����������������
	private ArrayList<Student> Stu = new ArrayList<Student>();
	//stuΪһ����̬��������ͨ������������ú���ʱ�������ĸ���������½����󶨣�java��һ��Ϊ��̬�󶨣�ͨ������ĵ����и��ǵĹ�ϵ��
	public void add(Student stu) {
		Stu.add(stu);
	}

	public void modify(String id) throws IOException {
		for(int i = 0; i < Stu.size(); i++) {
			if(Stu.get(i).getNo().equals(id)) {
				Scanner in = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("��ֱ�����ѧ�ţ�");
				String no = br.readLine();
				System.out.print("������������");	
				String name = br.readLine();
				System.out.print("��ѧ�ɼ���");
				int math = in.nextInt();
				System.out.print("Ӣ��ɼ���");
				int english = in.nextInt();
				System.out.print("���ĳɼ���");
				int china = in.nextInt();
				Stu.set(i,new grade(no,name,math,english,china));
				return;
			}
		}
		System.out.println("û���ҵ�����Ϣ��");
	}
	
	public void delete(String id) {
		for(int i = 0; i < Stu.size();i++) {
			if(Stu.get(i).getNo().equals(id)) {
				Stu.remove(i);
			}
		}
	}
	
	public void find(String id) {
		for(int i = 0; i < Stu.size();i++) {
			if(Stu.get(i).getNo().equals(id)) {
				Stu.get(i).print();
			}
		}
	}
	
	public void print() {
		for(Student stu : Stu) {
			stu.print();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StudentManage stuManage = new StudentManage();
		while(true) {
			System.out.println("***************************************");
			System.out.println("1.����ѧ����Ϣ		2.�޸�ѧ����Ϣ");
			System.out.println("3.ɾ��ѧ����Ϣ		4.����ѧ����Ϣ");
			System.out.println("5.��ӡѧ����Ϣ		6.�˳�");
			System.out.println("***************************************");
			int x = in.nextInt();
			switch(x) {
			case 1:
				System.out.print("��ֱ�����ѧ�ţ�");
				String no = br.readLine();
				System.out.print("������������");	
				String name = br.readLine();
				System.out.print("��ѧ�ɼ���");
				int math = in.nextInt();
				System.out.print("Ӣ��ɼ���");
				int english = in.nextInt();
				System.out.print("���ĳɼ���");
				int china = in.nextInt();
				stuManage.add(new grade(no,name,math,english,china));
				break;
			case 2:
				System.out.println("������Ҫ�޸���Ϣ��ѧ�ţ�");
				String no_2 = br.readLine();
				stuManage.modify(no_2);
				break;
			case 3:
				System.out.print("������Ҫɾ��ѧ����ѧ�ţ�");
				String no_3 = br.readLine();
				stuManage.delete(no_3);
				break;
			case 4:
				System.out.println("������Ҫ������Ϣ��ѧ�ţ�");
				String no_4 = br.readLine();
				stuManage.find(no_4);
				break;
			case 5:
				stuManage.print();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				break;
			}
		}
		
	}

}
