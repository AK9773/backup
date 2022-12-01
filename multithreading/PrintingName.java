package multithreading;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			name();
		}
	}

	public static void name() {		
		System.out.println("Aman Kumar ");
	}

}

public class PrintingName {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		Thread t4 = new Thread(r);
		Thread t5 = new Thread(r);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		for (int i = 0; i < 2; i++) {
			r.name();
		}

	}

}
