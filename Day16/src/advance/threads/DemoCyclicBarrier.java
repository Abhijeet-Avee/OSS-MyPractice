package advance.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

//2019, 2020, 2021,2022==> Aggigator
class Aggigator extends Thread{
	@Override
	public void run() {
		
		System.out.println("control goes to aggigator thread...");
	}
	
}
class DatabaseProcessor extends Thread{

	private CyclicBarrier synchPoint;
	
	
	public DatabaseProcessor(CyclicBarrier synchPoint, String name) {
		super(name);
		this.synchPoint = synchPoint;
		this.start();
	}
	
	@Override
	public void run() {
		System.out.println("datebase procesesing is done by "+ this.getName());
		
			try {
				synchPoint.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
	
	}

}

public class DemoCyclicBarrier {

	public static void main(String[] args) {
		
		Aggigator aggigator=new Aggigator();
		
		CyclicBarrier synchPoint=new CyclicBarrier(5, aggigator);
		
		new DatabaseProcessor(synchPoint, "2019");
		new DatabaseProcessor(synchPoint, "2020");
		new DatabaseProcessor(synchPoint, "2021");
		new DatabaseProcessor(synchPoint, "2022");
		new DatabaseProcessor(synchPoint, "2023");
		
		//System.out.println("end");
		
		
	}
}