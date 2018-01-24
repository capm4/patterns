package epam_book.chapter4;

/**
 * Created by Alex on 19.01.2018.
 */
class Q{
//	private void show(int i){
//		System.out.println("1");
//	}
}
public class Quest5 extends Q {
	public void show (int i){
		System.out.println("2");
	}

	public static void main(String[] args) {
		Q q = new Quest5();
		int i = 5;
//		q.show(i);
	}
}
