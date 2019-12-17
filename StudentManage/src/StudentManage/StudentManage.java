/*=============================================================================
 * 在运行调试时，一般固有的结构不可变，输入的值可以在调试时改变
 * 子类的对象可以传给父类参数类型，调用时调用的是子类的方法
 * 继承用于改善代码的质量，可以减少很多不必要的重复类的变量和方法的定义，后期有利于维护修改。
 * 继承的函数默认调用父类的函数，子类函数可以重构
 * 使用继承有利于后期的扩展
 * ============================================================================
 * object类函数：所有的类都是继承自Object类
 * */
package StudentManage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
	//定义一个学生类的数组类型容器
	private ArrayList<Student> Stu = new ArrayList<Student>();
	//stu为一个多态变量，当通过对象变量调用函数时，调用哪个函数这件事叫做绑定，java中一般为动态绑定，通过父类的调用有覆盖的关系。
	public void add(Student stu) {
		Stu.add(stu);
	}

	public void modify(String id) throws IOException {
		for(int i = 0; i < Stu.size(); i++) {
			if(Stu.get(i).getNo().equals(id)) {
				Scanner in = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("请分别输入学号：");
				String no = br.readLine();
				System.out.print("请输入姓名：");	
				String name = br.readLine();
				System.out.print("数学成绩：");
				int math = in.nextInt();
				System.out.print("英语成绩：");
				int english = in.nextInt();
				System.out.print("语文成绩：");
				int china = in.nextInt();
				Stu.set(i,new grade(no,name,math,english,china));
				return;
			}
		}
		System.out.println("没有找到该信息！");
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
			System.out.println("1.新增学生信息		2.修改学生信息");
			System.out.println("3.删除学生信息		4.查找学生信息");
			System.out.println("5.打印学生信息		6.退出");
			System.out.println("***************************************");
			int x = in.nextInt();
			switch(x) {
			case 1:
				System.out.print("请分别输入学号：");
				String no = br.readLine();
				System.out.print("请输入姓名：");	
				String name = br.readLine();
				System.out.print("数学成绩：");
				int math = in.nextInt();
				System.out.print("英语成绩：");
				int english = in.nextInt();
				System.out.print("语文成绩：");
				int china = in.nextInt();
				stuManage.add(new grade(no,name,math,english,china));
				break;
			case 2:
				System.out.println("请输入要修改信息的学号：");
				String no_2 = br.readLine();
				stuManage.modify(no_2);
				break;
			case 3:
				System.out.print("请输入要删除学生的学号：");
				String no_3 = br.readLine();
				stuManage.delete(no_3);
				break;
			case 4:
				System.out.println("请输入要查找信息的学号：");
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
