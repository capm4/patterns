/**
 * Created by Alex on 10.01.2018.
 */
public class ThreadJoin {
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
		Thread t1 = new Thread(ingrement::act);
		Thread t2 = new Thread(()->{
			try {
				t1.join();
				ingrement.act();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread t3 = new Thread(()->{
			try {
				t2.join();
				ingrement.act();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		});
		t1.start();
		t2.start();
		t3.start();
	}
}
