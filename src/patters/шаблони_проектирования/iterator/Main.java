package patters.шаблони_проектирования.iterator;

/**
 * Created by Alex on 23.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		String [] skills = {"Java", "C++", "Spring"};
		JavaDeveloper javaDeveloper = new JavaDeveloper("Alex K.", skills);
		Iterator iterator = javaDeveloper.getIterator();
		System.out.println(javaDeveloper.getName());
		System.out.println("skills : ");
		while(iterator.hasnext()){
			int i = iterator.getIndex();
			System.out.println("index = "+i+"  "+ iterator.next().toString()+"\n");
		}
	}
}
