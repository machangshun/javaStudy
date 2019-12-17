/*
 * 抽象函数-表达概念而无法实现具体代码的函数
 * 抽查类-表达概念而无法构造实体的类
 * 
 * 带有abstract修饰符的函数
 * 抽象类不能制造对象但可以定义变量
 * 任何继承了抽象类的非抽象类的对象可以赋给这个变量
 * 
 * 继承自抽象类的子类必需覆盖父类中的抽象函数
 * 否则自己成为抽象类
 * 
 * 
 * 两种抽象：
 * 与具体相对
 * 表示一种概念而非实体
 * 与细节相对
 * 表示在一定程度上忽略细节而着眼大局
 * 
 * 数据与表现分离
 * interface与class类似
 * implements 接口实现
 * */
package shapes;

import java.awt.Graphics;
//抽象
//抽象的类不能实例化类型
public abstract class Shape{
	
	public abstract void draw(Graphics g);
//	public abstract void move();
//	public static void main(String[] args) {
//		Shape s= new Shape();
//	}
}
