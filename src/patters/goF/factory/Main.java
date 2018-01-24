package patters.goF.factory;

/**
 * Created by Alex on 22.01.2018.
 */
public class Main {
	public static void main(String[] args) {
		Base b1 = ClassFectory.gerBase(1);
		Base b2 = ClassFectory.gerBase(2);
		Base b3 = ClassFectory.gerBase(4);
		b1.perform();
		b2.perform();
	}
}
