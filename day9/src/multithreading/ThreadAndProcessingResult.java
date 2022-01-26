package multithreading;

//Problem: Classical threads do not return processing result
//Solution: we can use thread.join() or wait() and notify()
class Cal implements Runnable{
	private int x,y,sum;
	private boolean isDone = false;
	
	public Cal(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void run() {
		sum=x+y;
		isDone = true;
		synchronized(this) {
			notifyAll();
		}
	}
	synchronized public int getSum() {
		if(!isDone) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sum;
	}
}

public class ThreadAndProcessingResult {
	public static void main(String[] args) {
		Cal cal = new Cal(2,4);
		Thread thread = new Thread(cal);
		thread.start();
		System.out.println(cal.getSum());
	}
}
