/*
 * ����Ҫ����ʵ���˻�������ҵ���߼��ķ���
 * ��������һ��ʼ��û�г�ʼ���κ�ֵ�ģ�����һ���ռ�Ĺ����ߣ��ͻ���Ԫ��������Щ��ͬ��
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
	//���������������ͣ�1.���������� 2.Ԫ�ص�����
	private ArrayList<String> notes = new ArrayList<String>();
	//����ı�
	public void add(String s) {
		notes.add(s);
	}
	//��λ�ò����ı�
	public void add(String s,int location) {
		notes.add(location,s);
	}
	//��ȡ�ļ���С
	public int getSize() {
		return notes.size();
	}
	//��ȡ�����ı�
	public String getNote(int index) {
		return notes.get(index);
	}
	//ɾ���ı�
	public void removeNote(int index) {
		notes.remove(index);
	}
	//��ȡ�ı��б�
	public String[] list() {
		String[] a = new String[notes.size()];
//		for(int i = 0; i < notes.size(); i++) {
//			a[i] = notes.get(i);
//		}
		//��ֵ��������a��
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
		
		//newһ���������
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
