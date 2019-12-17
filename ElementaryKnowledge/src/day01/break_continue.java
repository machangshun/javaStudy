package day01;

public class break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OUT:
		for(int i = 1;i <= 10;i++) {
			for(int j = 1; i <= 10; j++) {
				System.out.println(i+j);
				break OUT;
			}
		}
	}

}
