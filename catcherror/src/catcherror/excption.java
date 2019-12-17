/*
 * 子类的异常被父类捕捉
 * Exception可以捕捉所有的异常
 * 
 * 子类继承父类时不能够抛出比父类更多的异常
 * 与之不一样的是，如果父类构造函数抛出了异常，子类的构造函数就必须声明父类可能抛出的所有异常，可以声明新的异常
 * */
package catcherror;
class OpenException extends Exception{
	
}

class CloseException extends OpenException{
	
}
public class excption {

	public static int open() {
		return -1;
	}
	public static void readFile() throws OpenException ,CloseException{//陈述语句，抛出异常
		if(open() == -1) {
			throw new CloseException(); //祈使语句，请抛出一个异常
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Open");
		} 
	}

}
