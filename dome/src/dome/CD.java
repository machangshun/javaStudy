/*
 * ����̳и��࣬�����Զ��������е�����
 * */
package dome;

public class CD extends Item{
	private String artist;
	private int numofTracks;

	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title,playingTime,comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}
	

	@Override
	public String toString() {//�ع�
		return "CD [artist=" + artist + ", numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//�Լ���дequals���Ǹ���Object�еķ���
		CD cc = (CD)obj;
		return artist.equals(cc.artist);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CD cd = new CD("title"," artist",1,1,"..");
		CD cd1 = new CD("title"," artist",1,1,"..");
		System.out.println(cd.equals(cd1));
		cd.print();
		String s = ""+cd;
		System.out.println(s);
		System.out.println(cd.toString());
	}
	

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("CD:");
//		super.print();
		System.out.println(artist);
	}

}
