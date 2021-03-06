package multithreading;
//BlockingQueue: java 5: used to solve producer and consumer problem

//We are using wait() and notify right now.

class Q {
	int n;
	boolean valueSet = false;

	// Consumer method
	synchronized int get() {
		if (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("get: " + n);
		valueSet = false;
		notify();
		return n;
	}

	// Producer method
	synchronized void put(int n) {
		if (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("put: " + n);
		valueSet = true;
		notify();
	}
}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}
}

class Consumer implements Runnable {

	Q q;

	public Consumer(Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {
		while (true)
			q.get();
	}

}

public class ProducerAndConsumer {
	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
