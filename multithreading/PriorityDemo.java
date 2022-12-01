package multithreading;

class Priority extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class PriorityDemo {

	public static void main(String[] args) {

		Thread.currentThread().setPriority(1);
		Priority p1 = new Priority();
		Priority p2 = new Priority();
		Priority p3 = new Priority();

		p1.setPriority(10);
		p2.setPriority(8);
		p3.setPriority(4);

		p1.start();
		p2.start();
		p3.start();

		try {
			p3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread.currentThread().setName("Main");
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}
}
