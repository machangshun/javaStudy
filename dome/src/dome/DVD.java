/* 
 * 如果不用super，会默认调用无参数的构造
 * */
package dome;

public class DVD extends Item{
	private String director;
//	private String title;
	
	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,comment);
		//子类有两个title:父类的被继承下来，子类的重新定义，父类的被隐藏
//		this.title = title;
//		setTitle("b");
		this.director = director;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dvd = new DVD("title"," director",1,"..");
		dvd.print();
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("DVD:");
//		System.out.print(title);
//		super.print();
		System.out.println(director);
		
	}

}
