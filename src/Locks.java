import java.util.concurrent.CountDownLatch;

/**
 * Created by Alex on 10.01.2018.
 */
public class Locks {
	private  static  class Generator{
		private final CountDownLatch latch;

		private Generator(CountDownLatch latch) {
			this.latch = latch;
		}
		void generate(){
			System.out.println("generatet");
			latch.countDown();
		}
		void stop()throws InterruptedException{
			latch.await();
			System.out.println("stopped");
		}

	}

	public static void main(String[] args) {
		latchDemo();
	}

	private static void latchDemo() {
		int counts = 5;
		CountDownLatch latch = new CountDownLatch(counts);
		Generator generator = new Generator(latch);
		Thread t1 = new Thread(()->{
			for(int i =0; i<counts; i++){
				generator.generate();
			}
		});
		Thread t2 = new Thread(()->{
			try {
				generator.stop();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t2.start();
		t1.start();
	}
}
