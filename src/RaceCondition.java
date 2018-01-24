/**
 * Created by Alex on 10.01.2018.
 */
public class RaceCondition {
	private  static  class Ingrement {
		int i = 0;
		void act (){
			for(int j =0; j < 10; j++){
				System.out.println(i++);
			}
		}
	}

	public static void main(String[] args) {
		Ingrement ingrement = new Ingrement();
		for(int i = 0; i<10; i++){
			new Thread(ingrement::act).start();
		}
	}
}
