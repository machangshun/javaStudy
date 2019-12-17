/*
 * private类型成员变量，只能拥有成员变量和成员函数，只能在类里访问
 * public类型成员变量，能在外部进行访问 
 * 不加private或者public的可以在同一个包里进行访问
 * 类前有public表示任何其他类里可以用它来定义对象
 * 一个java文件是一个编译单元，用public定义的类名必需与文件名一致，可以定义其他不带public的类,一个编译单元最多有一个public
 * 一个.代表包的层次
 * static 类变量/函数，只做一次初始化  属于这个类  被所有对象所共享，与对象的创建无关
 * */
package display.led;

public class Display {
	private int value = 0;
	private int limit = 0;
	
	private static int step = 0;
	
	public Display(int limit) {  //构造函数
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
	//类函数
	public static void f() {
	//类函数不能访问非类函数的值
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
		//static 类变量
		Display.step = 3;
		System.out.println(d1.step);
		System.out.println(d.step);
//		for(;;) {
//			d.increase();
//			System.out.println(d.getValue());
//		}
	}

}
