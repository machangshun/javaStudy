/*
 * �̳����ڸ��ƴ�������������Լ��ٺܶ಻��Ҫ���ظ���ı����ͷ����Ķ��壬����������ά���޸ġ�
 * �̳еĺ���Ĭ�ϵ��ø���ĺ��������ຯ�������ع�
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
		//������ת����ͬ��ֻ�ǵ�������û��ת��
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