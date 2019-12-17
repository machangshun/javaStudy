/*参数传递char->int->double
 * 宽的能够接受窄的
 * 调用时只是传值给函数，函数命名的是形参，调用时的是实参
 * 函数每次运行产生一个独立的空间，在这个空间中的变量是独有的本地变量，参数也是本地变量
 * 生存期：什么时候开始出现到什么时候消失
 * 在什么范围内可以访问这个变量
 */
package day04;

public class 参数 {
	public static void swap(int a,int b) {
		int t;
		t = a;
		a = b; 
		b = t;
	}
	public static int factor(int i) {
		if(i == 1) {
			return i;
		}
		return i*factor(i-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		swap(a,b);
		System.out.println(a);
		factor(4);
	}

}
