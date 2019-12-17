/*
 * 对象是实体，类是规范，定义
 * 类定义了对象，对象是类的实体
 * 对象 = 属性 + 服务
 * 把数据和对数据的操作放在一起->封装
 * */
package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(420,250);
		Circle c1 = new Circle(320,40,40);
		Rectangle r1 = new Rectangle(100, 100, 100, 100);
		Triangle t1 = new Triangle(100, 100, 200, 100, 150, 50);
		Line l1 = new Line(0,205,400,205);
		Circle c2 = new Circle(200,200,50);
		pic.add(c1);
		pic.add(r1);
		pic.add(t1);
		pic.add(l1);
		pic.add(c2);
		pic.draw();	
	}
}
