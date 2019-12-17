package dome;

public class voidegame extends Item {
	public voidegame(String title, int playingTime, String comment,int number) {
		super(title, playingTime, comment);
		// TODO Auto-generated constructor stub
		this.numberOfPlayers = number;
	}

	private int numberOfPlayers;
	public void print() {
		System.out.println();
		super.print();
	}
}
