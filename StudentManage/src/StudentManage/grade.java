/**
 * 成绩继承于学生的信息
 */
package StudentManage;

/**
 * @author mac
 *
 */
public class grade extends Student{
	private int mathgrade;
	private int englishgrade;
	private int chinagrade;
	
	public grade(String no,String name,int mathgrade, int englishgrade, int chinagrade) {
		super(no,name);
		this.mathgrade = mathgrade;
		this.englishgrade = englishgrade;
		this.chinagrade = chinagrade;
	}
	public void print() {
		super.print();
		System.out.println(" "+mathgrade+" "+englishgrade+" "+chinagrade);
	}

}
