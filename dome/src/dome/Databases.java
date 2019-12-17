/*
 * 继承用于改善代码的质量，可以减少很多不必要的重复类的变量和方法的定义，后期有利于维护修改。
 * 继承的函数默认调用父类的函数，子类函数可以重构
 * */
package dome;

import java.util.ArrayList;

public class Databases {
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listItem = new ArrayList<Item>();
//	public void add(CD cd) {
//		listCD.add(cd);
//	}
//	
//	public void add(DVD dvd) {
//		listDVD.add(dvd);
//		
//	}
	public void add(Item item) {
		listItem.add(item);
		
	}
//	public void list() {
//		for(CD cd : listCD) {
//			cd.print();
//		}
//		for(DVD dvd : listDVD) {
//			dvd.print();
//		}
//	}
	public void list() {
		for(Item item : listItem) {
			item.print();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Object();
		o.toString();
		Item item = new Item("a",0,"..");
		CD cd = new CD("a","a",1,1,"");
		item = cd;
		//与类型转换不同，只是当作，并没有转换
		CD cc = (CD)item;
		Databases db = new Databases();
		db.add(new CD("title"," artist",1,1,".."));
		db.add(new CD("title"," artist",1,1,".."));
		db.add(new DVD("title"," director",1,".."));
		db.add(new Item("1",1,"1"));
		db.add(new voidegame("voidegame",1,"...",1));
		db.list();
	}

}