/*
 * ����ͨ���������
 * ��Ա�����Ͷ������ϵthis
 * this�ǳ�Ա������һ������Ĺ��б��ر�����������˵�������������Ǹ�����
 * ��ʧʱ���Զ��������ջ���
 * */
package vendingmachine;

public class vendingmachine {
	vendingmachine() {  //���캯��,�൱�ڳ�ʼ���������Զ�������
		price = 90;
		total = 0;
	}
	
	vendingmachine(int price){ //����
		this();				//����û�в����Ĺ��캯��,ֻ�ܷ��ڿ�ͷ����ֻ����һ��
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
