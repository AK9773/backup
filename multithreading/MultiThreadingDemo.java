package multithreading;

class MyThread extends Thread {
	static Thread t;
	public void run() {
		Thread.currentThread().setName("Aman");	
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class MultiThreadingDemo {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();

		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread.currentThread().setName("Kumar");
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}

}
