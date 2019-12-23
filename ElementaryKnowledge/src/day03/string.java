//字符串的操作
package day03;

public class string {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//用new创建
		String s = new String("0124a53Hello");
		String n;
		n = "   helloo    ";
//		System.out.println(s);
//		System.out.println(n);
//		System.out.println(s.equals("hello"));
//		//1为大0为等-1为小
//		System.out.println(s.compareTo(n));
//		System.out.println(s.length());
//		for(int i = 0; i < s.length();i++) {
//			System.out.println(s.charAt(i));
//		}
//		for(char k : s) {}
		//下标切片
		System.out.println("下标切片："+s.substring(3+1));
		System.out.println(s.substring(2,3));
		//找到返回下标，否则返回-1
		System.out.println(s.indexOf('4'));
		int loc = s.indexOf('3');
		System.out.println(s.indexOf('3',loc+1));
		System.out.println(s.startsWith("0"));
		System.out.println(s.endsWith("p"));
		//删除两边空格
		System.out.println(n.trim());
		System.out.println(s.replace("hello","efa"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
	}

}
