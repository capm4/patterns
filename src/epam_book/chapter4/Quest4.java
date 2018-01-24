package epam_book.chapter4;

/**
 * Created by Alex on 19.01.2018.
 */
class Bas{
	Bas() {
		int i = 1;
		//System.out.println(i);
	}
}
public class Quest4 extends Bas{
	static int  i;

	public static void main(String[] args) {
		Quest4 q = new Quest4();
		System.out.println(i);
	}
}
