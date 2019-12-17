/*
 * 利用for-each 或 迭代器两种方法进行访问
 * 容器的操作函数相互嵌套使用更加强大，灵活多变
 * Integer	String	Map.Entry<K,V>	对象都可以作为容器基本元素的类型
 * */
package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class practise {
	
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		HashSet<String> hasharr = new HashSet<String>();
		hasharr.add("c");
		hasharr.add("b");
		hasharr.add("a");
		hasharr.add(""+hasharr.contains("b"));
		hasharr.add(""+hasharr.contains("d"));
		Iterator<String> iterator = hasharr.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			//一次只能调用一次next,否则会越界
//			System.out.println(next+ " " + iterator.next().hashCode());
//			System.out.println(next+" "+next.hashCode());
		}
//		System.out.println(hasharr.contains("b"));
//		System.out.println(hasharr);
//		System.out.println(hasharr.clone());
//		for(String k : hasharr) {
//			System.out.println(k);
//		}
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("hello");
		arr.add("first");
		arr.add("second");
		
		//指定位置插入,后面的元素后移
		arr.add(2,"this is 2");
		
		//替换
		arr.set(0, "second");  
//		arr.remove(3);
		
//		for(String k : arr) {
//			System.out.println(k);
//		}
//		System.out.println(arr);
//		System.out.println(arr.contains("second"));
//		System.out.println(arr.get(0));
//		System.out.println(arr.indexOf("second"));
//		System.out.println(arr.isEmpty());
//		
//		System.out.println(arr.lastIndexOf("second"));
//		System.out.println(arr.remove("first"));
//		System.out.println(arr);
		
		Map<Integer, String> hash = new HashMap<Integer,String>();
		hash.put(1, "one");
		hash.put(2,"second");
		hash.put(3,"third");
		System.out.println(hash);
		int x = in.nextInt();
		//get获取值
		System.out.println(hash.get(x));
		//判断是否有这个键
		System.out.println(hash.containsKey(x));
		//获取所有的值的集合
		System.out.println(hash.keySet());
		System.out.println(hash.values());
//		Set<Integer> keys = hash.keySet();
//		for(Iterator<Integer> it = keys.iterator();it.hasNext();) {
//			Integer key = it.next();
//			String value = hash.get(key);
//			System.out.println(value);
//		}
//		for(String k : hash.values()) {
//			System.out.println(k);
//		}
		//同时遍历键值
//		Set<Map.Entry<Integer,String>> keyValues = hash.entrySet();
		for(Map.Entry<Integer, String> k : hash.entrySet()) {
			Integer key = k.getKey();
			String v = k.getValue();
			System.out.println(key + " " + v);
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
	}

}
