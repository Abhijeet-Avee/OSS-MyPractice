package classical.threads;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//class Printer{
//	private ReadWriteLock lock=new ReentrantReadWriteLock(true);
//	
//	public  void print(String letter){
//		
//			try {
//				lock.writeLock().lock();
//				
//				System.out.print("[");
//				try{
//					Thread.sleep(100);
//				}catch(InterruptedException e){}
//				System.out.println(letter + "]");
//				
//			}finally {
//				lock.writeLock().unlock();
//			}
//		
//	}
//}
class Printer{
	private Semaphore semaphore=new Semaphore(2);
	
	public  void print(String letter){
		
			try {
				semaphore.acquire();
				
				System.out.print("[");
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){}
				System.out.println(letter + "]");
				
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}finally {
				semaphore.release();
			}
		
	}
}

class Client extends Thread{
	private Thread thread;
	private Printer printer;
	private String letter;
	
	public Client(Printer printer, String letter){
		this.printer=printer;
		this.letter=letter;
		thread=new Thread(this);
		thread.start();
	}
	public void run(){
		printer.print(letter);
	}
}
public class DemoReentrantLock{
	
	public static void main(String[] args) {
		
		Printer printer=new Printer();
		Client client1=new Client(printer, "i love java");
		Client client2=new Client(printer, "i hate java");
		Client client3=new Client(printer, "i love india");
		
	}

}