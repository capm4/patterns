package epam_book.chapter4;

/**
 * Created by Alex on 19.01.2018.
 */
class Aaaa {
	Aaaa(int i){
		System.out.println("Contstructor Aaaa");
	}
	}
public class Quest extends Aaaa {
	public static void main(String[] args) {
		Quest s = new Quest(1);
	}
	public Quest(int i){
		super(i);
	}
}
