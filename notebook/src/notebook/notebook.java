/*
 * 后期要尽量实现人机交互与业务逻辑的分离
 * 对象数组一开始是没有初始化任何值的，它是一个空间的管理者，和基本元素数组有些不同。
 * foreach
 * */
package notebook;

import java.util.ArrayList;
import java.util.HashSet;
class Value{
	private int i;
	public void set(int i) {
		this.i = i;
	}
	public int get() {return i;}
	public String toString() {
		return ""+i;
	}
}
public class notebook {
	//ArrayList of String
	//容器类有两个类型：1.容器的类型 2.元素的类型
	private ArrayList<String> notes = new ArrayList<String>();
	//添加文本
	public void add(String s) {
		notes.add(s);
	}
	//按位置插入文本
	public void add(String s,int location) {
		notes.add(location,s);
	}
	//获取文件大小
	public int getSize() {
		return notes.size();
	}
	//获取所需文本
	public String getNote(int index) {
		return notes.get(index);
	}
	//删除文本
	public void removeNote(int index) {
		notes.remove(index);
	}
	//获取文本列表
	public String[] list() {
		String[] a = new String[notes.size()];
//		for(int i = 0; i < notes.size(); i++) {
//			a[i] = notes.get(i);
//		}
		//将值放入数组a中
		notes.toArray(a);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("first");
		a.add("second");
		a.add("first");
//		for(String s : a) {
//			System.out.println(s);
//		}
		System.out.println(a);
		System.out.println("--------------");
		HashSet<String> s = new HashSet<String>();
		s.add("first");
		s.add("second");
		s.add("first");
		s.add("arrist");
		System.out.println(s);
//		for(String k : s) {
//			System.out.println(k);
//			
//		}
		
		Value v = new Value();
		v.set(10);
		System.out.println(v);
		
		//new一个数组对象
//		Value[] a = new Value[10];
//		for(int i = 0; i < a.length;i++) {
//			a[i] = new Value();
//			a[i].set(i);
//		}
//		for(Value v : a) {
//			System.out.println(v.get());
//			v.set(0);
//		}
//		for(Value v : a) {
//			System.out.println(v.get());
//		}
		
		
//		notebook nb = new notebook();
//		nb.add("first");
//		nb.add("second");
//		nb.add("third",1);
//		System.out.println(nb.getSize());
//		System.out.println(nb.getNote(0));
//		System.out.println(nb.getNote(1));
//		nb.removeNote(1);
//		String[] a = nb.list();
//		for(String s : a) {
//			System.out.println(s);
//		}
	}

}
