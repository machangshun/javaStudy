/*
 * ������쳣�����ಶ׽
 * Exception���Բ�׽���е��쳣
 * 
 * ����̳и���ʱ���ܹ��׳��ȸ��������쳣
 * ��֮��һ�����ǣ�������๹�캯���׳����쳣������Ĺ��캯���ͱ���������������׳��������쳣�����������µ��쳣
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
	public static void readFile() throws OpenException ,CloseException{//������䣬�׳��쳣
		if(open() == -1) {
			throw new CloseException(); //��ʹ��䣬���׳�һ���쳣
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
