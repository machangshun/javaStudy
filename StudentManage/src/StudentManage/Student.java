/*类定义了类型
 * 子类定义了子类型
 * 子类的对象可以被当作父类的对象来使用
 * 赋值给父类的变量
 * 传递给需要父类对象的函数
 * 放进存放父类对象的容器里
 * 
 * 父类不能赋给子类
 * 
 * 
 * 对象变量是多态的，它们能保存不止一种类型的对象
 * 它们可以保存的是声明类型的对象，或者声明类型的子类的对象
 * 当把子类的对象赋值给父类的变量时，就发生了向上造型
 * 当把一个对象的变量赋予给另一个对象变量时为造型
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
