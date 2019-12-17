/*
 * 函数通过对象调用
 * 成员函数和对象的联系this
 * this是成员函数的一个特殊的固有本地变量，它表达了调用这个函数的那个对象
 * 消失时有自动垃圾回收机制
 * */
package vendingmachine;

public class vendingmachine {
	vendingmachine() {  //构造函数,相当于初始化函数，自动调用它
		price = 90;
		total = 0;
	}
	
	vendingmachine(int price){ //重载
		this();				//调用没有参数的构造函数,只能放在开头并且只能用一次
		this.price = price;
	}
	vendingmachine(int price,int total){
		this();
	}
	int price = 80;    //1
	int balance = 20;
	int total;
	
	void setPrice(int price) {
		this.price = price;
	}
	void showPrompt() {
		System.out.println("Welcome");
	}
	void insertMoney(int amount) {
		balance = balance + amount;
		this.showBalance();
	}
	void showBalance() {
		System.out.println(this.balance);
	}
	void getFood() {
		if(balance >= price) {
			System.out.println("Here you are");
			balance = balance - price;
			total = total + price;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vendingmachine vm = new vendingmachine();
		vm.showPrompt();
		vm.showBalance();
		vm.insertMoney(100);
		vm.getFood();
		vm.showBalance();
		vendingmachine vm1 = new vendingmachine(100);
		vm1.insertMoney(200);
		vm1.getFood();
		vm1.showBalance();
	}

}
