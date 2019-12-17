package coin;

import java.util.HashMap;
import java.util.Scanner;

public class coin {
	//类似于python的字典,但不同的是hash只能键值一对一
	private HashMap<Integer,String> coinnames = new HashMap<Integer,String>();
	
	public coin() {
		coinnames.put(1,"penny");
		coinnames.put(10,"dime");
		coinnames.put(25,"quarter");
		coinnames.put(50,"half-dolar");
		coinnames.put(50, "五毛");
//		System.out.println(coinnames.keySet().size());
//		System.out.println(coinnames);
		//keySet()给出了所有hash表所有key的集合
		for(Integer k : coinnames.keySet()) {
			String s = coinnames.get(k);
			System.out.println(s);
		}
	}
	public String getName(int amount) {
		if(coinnames.containsKey(amount))
			return coinnames.get(amount);
		else
			return "NOT FOUND";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		coin c = new coin();
		String name = c.getName(amount);
		System.out.println(name);
	}
	
}
